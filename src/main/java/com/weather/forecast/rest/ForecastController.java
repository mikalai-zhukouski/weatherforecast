package com.weather.forecast.rest;

import com.weather.forecast.model.ForecastEntity;
import com.weather.forecast.service.ForecastService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RestController
@Tag(name = "Forecast Controller", description = "Get forecast")
public class ForecastController {

    @Resource(name = "forecastService")
    private ForecastService forecastService;

    @Operation(
            summary = "Get the forecast",
            description = "Get forecast by filter"
    )
    @GetMapping(path = "/forecast")
    public ResponseEntity<List<ForecastEntity>> getForecast(
            @RequestParam(required = false) @Parameter(example = "2020-6-21 21:45", description = "Date from for forecast in <b>yyyy-MM-dd HH:mm</b> format")
            @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm") Date dateFrom,
            @RequestParam(required = false) @Parameter(example = "2020-6-21 21:45", description = "Date to for forecast in yyyy-MM-dd HH:mm format")
            @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm") Date dateTo) {
        List<ForecastEntity> forecasts = forecastService.getForecasts(dateFrom, dateTo);

        forecasts.forEach(forecast -> {
            double temperature = forecast.getTemperature();
            double precipitation = forecast.getPrecipitation();
            double snowfraction = forecast.getSnowfraction();
            if (temperature > 25) {
                forecast.setShoes("Sandals");
            } else if (temperature > 5) {
                if (precipitation > 0) {
                    forecast.setShoes("Tall boots");
                } else {
                    forecast.setShoes("Light boots");
                }
            } else {
                forecast.setShoes("Winter shoes");
            }

            if (precipitation > 300 && snowfraction == 0) {
                forecast.setThings("Boat");
            } else if (precipitation > 5 && snowfraction == 0) {
                forecast.setThings("Umbrella");
            }

            if (snowfraction > 1) {
                forecast.setThings("Hat + gloves");
            }
        });

        return new ResponseEntity<>(forecasts, HttpStatus.OK);
    }
}
