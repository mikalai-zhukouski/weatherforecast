package com.weather.forecast.service;

import com.weather.forecast.helpers.ForecastHelper;
import com.weather.forecast.service.model.WeatherForecast;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Component
@EnableAsync
public class WeatherForecastService {

    @Resource(name = "forecastService")
    private ForecastService forecastService;

    @Value("${forecast.endpoint}")
    private String forecastEndpoint;

    @Value("${forecast.api.key}")
    private String forecastApiKey;

    @Value("${forecast.longitude}")
    private String forecastLongitude;

    @Value("${forecast.latitude}")
    private String forecastLatitude;

    @Value("${forecast.asl}")
    private String forecastAsl;

    @Value("${forecast.format}")
    private String forecastFormat;

    @Value("${forecast.timezone}")
    private String forecastTimeZone;

    @Async
    @Scheduled(fixedRate = 1000000L)
    public void getForecast() {
        RestTemplate restTemplate = new RestTemplate();

        UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.fromHttpUrl(forecastEndpoint)
        .queryParam("apikey", "{apikey}")
        .queryParam("lat", "{lat}")
        .queryParam("lon", "{lon}")
        .queryParam("asl", "{asl}")
        .queryParam("format", "{format}")
        .queryParam("tz", "{tz}")
        .encode();
        String urlTemplate = uriComponentsBuilder
                .toUriString();

        Map<String, Object> parameters = new HashMap<>();
        parameters.put("apikey", forecastApiKey);
        parameters.put("lat", forecastLatitude);
        parameters.put("lon", forecastLongitude);
        parameters.put("asl", forecastAsl);
        parameters.put("format", forecastFormat);
        parameters.put("tz", forecastTimeZone);
        ResponseEntity<WeatherForecast> forecastEntity = restTemplate.getForEntity(urlTemplate, WeatherForecast.class, parameters);

        forecastService.saveForecasts(ForecastHelper.convertHourlyForecasts(forecastEntity.getBody()));
    }
}
