package com.weather.forecast.service.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.boot.jackson.JsonComponent;

import java.util.Date;

@JsonComponent
public class WeatherForecastPerDay {

    @JsonProperty(value = "time")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="UTC")
    private Date[] forecastTime;

    @JsonProperty(value = "pictocode")
    private int[] pictoCode;

    @JsonProperty(value = "uvindex")
    private int[] uvIndex;

    @JsonProperty(value = "temperature_max")
    private double[] temperatureMax;

    @JsonProperty(value = "temperature_min")
    private double[] temperatureMin;

    @JsonProperty(value = "temperature_mean")
    private double[] temperatureMean;

    @JsonProperty(value = "felttemperature_max")
    private double[] feltTemperatureMax;

    @JsonProperty(value = "felttemperature_min")
    private double[] feltTemperatureMin;

    @JsonProperty(value = "winddirection")
    private int[] windDirection;

    @JsonProperty(value = "precipitation_probability")
    private int[] precipitationProbability;

    @JsonProperty(value = "rainspot")
    private String[] rainSpot;

    @JsonProperty(value = "predictability_class")
    private int[] predictabilityClass;

    @JsonProperty
    private int[] predictability;

    @JsonProperty(value = "snowfraction")
    private double[] snowFraction;

    @JsonProperty(value = "sealevelpressure_max")
    private double[] seaLevelPressureMax;

    @JsonProperty(value = "sealevelpressure_min")
    private double[] seaLevelPressureMin;

    @JsonProperty(value = "sealevelpressure_mean")
    private double[] seaLevelPressureMean;

    @JsonProperty(value = "windspeed_min")
    private double[] windSpeedMin;

    @JsonProperty(value = "windspeed_max")
    private double[] windSpeedMax;

    @JsonProperty(value = "windspeed_mean")
    private double[] windSpeedMean;

    @JsonProperty(value = "relativehumidity_min")
    private int[] relativeHumidityMin;

    @JsonProperty(value = "relativehumidity_max")
    private int[] relativeHumidityMax;

    @JsonProperty(value = "relativehumidity_mean")
    private int[] relativeHumidityMean;

    @JsonProperty(value = "convective_precipitation")
    private double[] convectivePrecipitation;

    @JsonProperty(value = "precipitation_hours")
    private double[] precipitationHours;

    @JsonProperty(value = "humiditygreater90_hours")
    private double[] humidityGreater90Hours;

    @JsonProperty(value = "indexto1hvalues_start")
    private int[] indexTo1HValuesStart;

    @JsonProperty(value = "indexto1hvalues_end")
    private int[] indexTo1HValuesEnd;

    public Date[] getForecastTime() {
        return forecastTime;
    }

    public void setForecastTime(Date[] forecastTime) {
        this.forecastTime = forecastTime;
    }

    public int[] getPictoCode() {
        return pictoCode;
    }

    public void setPictoCode(int[] pictoCode) {
        this.pictoCode = pictoCode;
    }

    public int[] getUvIndex() {
        return uvIndex;
    }

    public void setUvIndex(int[] uvIndex) {
        this.uvIndex = uvIndex;
    }

    public double[] getTemperatureMax() {
        return temperatureMax;
    }

    public void setTemperatureMax(double[] temperatureMax) {
        this.temperatureMax = temperatureMax;
    }

    public double[] getTemperatureMin() {
        return temperatureMin;
    }

    public void setTemperatureMin(double[] temperatureMin) {
        this.temperatureMin = temperatureMin;
    }

    public double[] getTemperatureMean() {
        return temperatureMean;
    }

    public void setTemperatureMean(double[] temperatureMean) {
        this.temperatureMean = temperatureMean;
    }

    public double[] getFeltTemperatureMax() {
        return feltTemperatureMax;
    }

    public void setFeltTemperatureMax(double[] feltTemperatureMax) {
        this.feltTemperatureMax = feltTemperatureMax;
    }

    public double[] getFeltTemperatureMin() {
        return feltTemperatureMin;
    }

    public void setFeltTemperatureMin(double[] feltTemperatureMin) {
        this.feltTemperatureMin = feltTemperatureMin;
    }

    public int[] getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(int[] windDirection) {
        this.windDirection = windDirection;
    }

    public int[] getPrecipitationProbability() {
        return precipitationProbability;
    }

    public void setPrecipitationProbability(int[] precipitationProbability) {
        this.precipitationProbability = precipitationProbability;
    }

    public String[] getRainSpot() {
        return rainSpot;
    }

    public void setRainSpot(String[] rainSpot) {
        this.rainSpot = rainSpot;
    }

    public int[] getPredictabilityClass() {
        return predictabilityClass;
    }

    public void setPredictabilityClass(int[] predictabilityClass) {
        this.predictabilityClass = predictabilityClass;
    }

    public int[] getPredictability() {
        return predictability;
    }

    public void setPredictability(int[] predictability) {
        this.predictability = predictability;
    }

    public double[] getSnowFraction() {
        return snowFraction;
    }

    public void setSnowFraction(double[] snowFraction) {
        this.snowFraction = snowFraction;
    }

    public double[] getSeaLevelPressureMax() {
        return seaLevelPressureMax;
    }

    public void setSeaLevelPressureMax(double[] seaLevelPressureMax) {
        this.seaLevelPressureMax = seaLevelPressureMax;
    }

    public double[] getSeaLevelPressureMin() {
        return seaLevelPressureMin;
    }

    public void setSeaLevelPressureMin(double[] seaLevelPressureMin) {
        this.seaLevelPressureMin = seaLevelPressureMin;
    }

    public double[] getSeaLevelPressureMean() {
        return seaLevelPressureMean;
    }

    public void setSeaLevelPressureMean(double[] seaLevelPressureMean) {
        this.seaLevelPressureMean = seaLevelPressureMean;
    }

    public double[] getWindSpeedMin() {
        return windSpeedMin;
    }

    public void setWindSpeedMin(double[] windSpeedMin) {
        this.windSpeedMin = windSpeedMin;
    }

    public double[] getWindSpeedMax() {
        return windSpeedMax;
    }

    public void setWindSpeedMax(double[] windSpeedMax) {
        this.windSpeedMax = windSpeedMax;
    }

    public double[] getWindSpeedMean() {
        return windSpeedMean;
    }

    public void setWindSpeedMean(double[] windSpeedMean) {
        this.windSpeedMean = windSpeedMean;
    }

    public int[] getRelativeHumidityMin() {
        return relativeHumidityMin;
    }

    public void setRelativeHumidityMin(int[] relativeHumidityMin) {
        this.relativeHumidityMin = relativeHumidityMin;
    }

    public int[] getRelativeHumidityMax() {
        return relativeHumidityMax;
    }

    public void setRelativeHumidityMax(int[] relativeHumidityMax) {
        this.relativeHumidityMax = relativeHumidityMax;
    }

    public int[] getRelativeHumidityMean() {
        return relativeHumidityMean;
    }

    public void setRelativeHumidityMean(int[] relativeHumidityMean) {
        this.relativeHumidityMean = relativeHumidityMean;
    }

    public double[] getConvectivePrecipitation() {
        return convectivePrecipitation;
    }

    public void setConvectivePrecipitation(double[] convectivePrecipitation) {
        this.convectivePrecipitation = convectivePrecipitation;
    }

    public double[] getPrecipitationHours() {
        return precipitationHours;
    }

    public void setPrecipitationHours(double[] precipitationHours) {
        this.precipitationHours = precipitationHours;
    }

    public double[] getHumidityGreater90Hours() {
        return humidityGreater90Hours;
    }

    public void setHumidityGreater90Hours(double[] humidityGreater90Hours) {
        this.humidityGreater90Hours = humidityGreater90Hours;
    }

    public int[] getIndexTo1HValuesStart() {
        return indexTo1HValuesStart;
    }

    public void setIndexTo1HValuesStart(int[] indexTo1HValuesStart) {
        this.indexTo1HValuesStart = indexTo1HValuesStart;
    }

    public int[] getIndexTo1HValuesEnd() {
        return indexTo1HValuesEnd;
    }

    public void setIndexTo1HValuesEnd(int[] indexTo1HValuesEnd) {
        this.indexTo1HValuesEnd = indexTo1HValuesEnd;
    }
}
