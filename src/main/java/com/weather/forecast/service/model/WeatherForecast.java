package com.weather.forecast.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.boot.jackson.JsonComponent;

@JsonComponent(value = "")
public class WeatherForecast {

    @JsonProperty
    private WeatherForecastMetadata metadata;

    @JsonProperty
    private WeatherForecastUnits units;

    @JsonProperty(value = "data_day")
    private WeatherForecastPerDay weatherForecastPerDay;

    @JsonProperty(value = "data_1h")
    private WeatherForecastPerHour weatherForecastPerHour;

    public WeatherForecastMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(WeatherForecastMetadata metadata) {
        this.metadata = metadata;
    }

    public WeatherForecastUnits getUnits() {
        return units;
    }

    public void setUnits(WeatherForecastUnits units) {
        this.units = units;
    }

    public WeatherForecastPerDay getForecastPerDay() {
        return weatherForecastPerDay;
    }

    public void setForecastPerDay(WeatherForecastPerDay weatherForecastPerDay) {
        this.weatherForecastPerDay = weatherForecastPerDay;
    }

    public WeatherForecastPerHour getForecastPerHour() {
        return weatherForecastPerHour;
    }

    public void setForecastPerHour(WeatherForecastPerHour weatherForecastPerHour) {
        this.weatherForecastPerHour = weatherForecastPerHour;
    }
}
