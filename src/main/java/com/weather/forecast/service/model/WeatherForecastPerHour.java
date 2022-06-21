package com.weather.forecast.service.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.boot.jackson.JsonComponent;

import java.util.Date;
import java.util.List;

@JsonComponent
public class WeatherForecastPerHour {

    @JsonProperty(value = "time")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm", timezone="UTC")
    private List<Date> forecastTime;

    @JsonProperty
    private List<Double> precipitation;

    @JsonProperty(value = "snowfraction")
    private List<Double> snowFraction;

    @JsonProperty(value = "rainspot")
    private List<String> rainSpot;

    @JsonProperty
    private List<Double> temperature;

    @JsonProperty(value = "felttemperature")
    private List<Double> feltTemperature;

    @JsonProperty(value = "pictocode")
    private List<Integer> pictoCode;

    @JsonProperty(value = "windspeed")
    private List<Double> windSpeed;

    @JsonProperty(value = "winddirection")
    private List<Integer> windDirection;

    @JsonProperty(value = "relativehumidity")
    private List<Integer> relativeHumidity;

    @JsonProperty(value = "sealevelpressure")
    private List<Double> seaLevelPressure;

    @JsonProperty(value = "precipitation_probability")
    private List<Integer> precipitationProbability;

    @JsonProperty(value = "convective_precipitation")
    private List<Double> convectivePrecipitation;

    @JsonProperty(value = "isdaylight")
    private List<Integer> isDayLight;

    @JsonProperty(value = "uvindex")
    private List<Integer> uvIndex;

    public List<Date> getForecastTime() {
        return forecastTime;
    }

    public void setForecastTime(List<Date> forecastTime) {
        this.forecastTime = forecastTime;
    }

    public List<Double> getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(List<Double> precipitation) {
        this.precipitation = precipitation;
    }

    public List<Double> getSnowFraction() {
        return snowFraction;
    }

    public void setSnowFraction(List<Double> snowFraction) {
        this.snowFraction = snowFraction;
    }

    public List<String> getRainSpot() {
        return rainSpot;
    }

    public void setRainSpot(List<String> rainSpot) {
        this.rainSpot = rainSpot;
    }

    public List<Double> getTemperature() {
        return temperature;
    }

    public void setTemperature(List<Double> temperature) {
        this.temperature = temperature;
    }

    public List<Double> getFeltTemperature() {
        return feltTemperature;
    }

    public void setFeltTemperature(List<Double> feltTemperature) {
        this.feltTemperature = feltTemperature;
    }

    public List<Integer> getPictoCode() {
        return pictoCode;
    }

    public void setPictoCode(List<Integer> pictoCode) {
        this.pictoCode = pictoCode;
    }

    public List<Double> getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(List<Double> windSpeed) {
        this.windSpeed = windSpeed;
    }

    public List<Integer> getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(List<Integer> windDirection) {
        this.windDirection = windDirection;
    }

    public List<Integer> getRelativeHumidity() {
        return relativeHumidity;
    }

    public void setRelativeHumidity(List<Integer> relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
    }

    public List<Double> getSeaLevelPressure() {
        return seaLevelPressure;
    }

    public void setSeaLevelPressure(List<Double> seaLevelPressure) {
        this.seaLevelPressure = seaLevelPressure;
    }

    public List<Integer> getPrecipitationProbability() {
        return precipitationProbability;
    }

    public void setPrecipitationProbability(List<Integer> precipitationProbability) {
        this.precipitationProbability = precipitationProbability;
    }

    public List<Double> getConvectivePrecipitation() {
        return convectivePrecipitation;
    }

    public void setConvectivePrecipitation(List<Double> convectivePrecipitation) {
        this.convectivePrecipitation = convectivePrecipitation;
    }

    public List<Integer> getIsDayLight() {
        return isDayLight;
    }

    public void setIsDayLight(List<Integer> isDayLight) {
        this.isDayLight = isDayLight;
    }

    public List<Integer> getUvIndex() {
        return uvIndex;
    }

    public void setUvIndex(List<Integer> uvIndex) {
        this.uvIndex = uvIndex;
    }
}
