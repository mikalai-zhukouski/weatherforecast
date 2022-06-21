package com.weather.forecast.helpers;

import com.weather.forecast.model.ForecastEntity;
import com.weather.forecast.service.model.WeatherForecast;
import com.weather.forecast.service.model.WeatherForecastPerHour;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ForecastHelper {

    public static double windChillFactor(double windSpeed, double temperature) {
        double windSpeedInKmPerHr = windSpeed * 60 * 60 /1000;
        return 13.12 + 0.6215 * temperature - 11.37 * Math.pow(windSpeedInKmPerHr, 0.16) + 0.3965 * temperature * Math.pow(windSpeedInKmPerHr, 0.16);
    }
    public static List<ForecastEntity> convertHourlyForecasts(WeatherForecast forecast) {
        WeatherForecastPerHour weatherForecastPerHour = forecast.getForecastPerHour();
        List<Date> forecastPerHourDates = weatherForecastPerHour.getForecastTime();
        List<ForecastEntity> forecasts = new ArrayList<>();
        for (Date forecastDate : forecastPerHourDates) {
            ForecastEntity forecastEntity = new ForecastEntity();
            forecastEntity.setForecastTime(forecastDate);
            forecastEntity.setPrecipitation(weatherForecastPerHour.getPrecipitation().get(forecastPerHourDates.indexOf(forecastDate)));
            double snowFraction = weatherForecastPerHour.getSnowFraction().get(forecastPerHourDates.indexOf(forecastDate));
            double snowFractionInMm = snowFraction * forecastEntity.getPrecipitation() * 7;
            forecastEntity.setSnowfraction(snowFractionInMm);
            forecastEntity.setWindSpeed(weatherForecastPerHour.getWindSpeed().get(forecastPerHourDates.indexOf(forecastDate)));
            forecastEntity.setWindDirection(weatherForecastPerHour.getWindDirection().get(forecastPerHourDates.indexOf(forecastDate)));
            forecastEntity.setTemperature(weatherForecastPerHour.getTemperature().get(forecastPerHourDates.indexOf(forecastDate)));
            forecastEntity.setWindChill(windChillFactor(forecastEntity.getWindSpeed(), forecastEntity.getTemperature()));
            forecasts.add(forecastEntity);
        }

        return forecasts;
    }
}
