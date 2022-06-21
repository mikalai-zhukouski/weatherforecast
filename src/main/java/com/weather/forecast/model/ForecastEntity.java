package com.weather.forecast.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;

@Entity
@Table(name = "HOURLYFORECAST")
@Schema(description = "Forecast entity")
public class ForecastEntity {

    @Id
    @Column(name = "forecasttime")
    @Schema(description = "Forecast time", example = "")
    private Date forecastTime;

    @Column(name = "winddirection")
    @Schema(description = "Wind Direction", example = "30 degrees")
    private double windDirection;

    @Column(name = "temperature")
    @Schema(description = "Temperature in celsius degree")
    private double temperature;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    @Schema(description = "Humidity in %")
    private double humidity;

    @Column(name = "windspeed")
    @Schema(description = "Wind Speed in the m/s")
    private double windSpeed;

    @Column(name = "precipitation")
    @Schema(description = "Precipitation in mm")
    private double precipitation;

    @Column(name = "snowfraction")
    @Schema(description = "Snowfraction in mm")
    private double snowfraction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    @Schema(description = "Shoes")
    private String shoes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    @Schema(description = "Things")
    private String things;

    @Column(name = "windchill")
    @Schema(description = "WindChill")
    private double windChill;

    public Date getForecastTime() {
        return forecastTime;
    }

    public void setForecastTime(Date forecastTime) {
        this.forecastTime = forecastTime;
    }

    public double getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(double windDirection) {
        this.windDirection = windDirection;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public double getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(double precipitation) {
        this.precipitation = precipitation;
    }

    public double getSnowfraction() {
        return snowfraction;
    }

    public void setSnowfraction(double snowfraction) {
        this.snowfraction = snowfraction;
    }

    public String getShoes() {
        return shoes;
    }

    public void setShoes(String shoes) {
        this.shoes = shoes;
    }

    public String getThings() {
        return things;
    }

    public void setThings(String things) {
        this.things = things;
    }

    public double getWindChill() {
        return windChill;
    }

    public void setWindChill(double windChill) {
        this.windChill = windChill;
    }
}
