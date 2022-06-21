package com.weather.forecast.service.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.boot.jackson.JsonComponent;

import java.util.Date;

@JsonComponent
public class WeatherForecastMetadata {

    @JsonProperty(value = "name")
    private String name;

    @JsonProperty(value = "latitude")
    private double latitude;

    @JsonProperty(value = "longitude")
    private double longitude;

    @JsonProperty(value = "height")
    private int height;

    @JsonProperty(value = "timezone_abbrevation")
    private String timeZoneAbbreviation;

    @JsonProperty(value = "utc_timeoffset")
    private double timeZoneOffset;

    @JsonProperty(value = "modelrun_utc")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm", timezone="UTC")
    private Date modelRun;

    @JsonProperty(value = "modelrun_updatetime_utc")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm", timezone="UTC")
    private Date modelUpdate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getTimeZoneAbbreviation() {
        return timeZoneAbbreviation;
    }

    public void setTimeZoneAbbreviation(String timeZoneAbbreviation) {
        this.timeZoneAbbreviation = timeZoneAbbreviation;
    }

    public double getTimeZoneOffset() {
        return timeZoneOffset;
    }

    public void setTimeZoneOffset(double timeZoneOffset) {
        this.timeZoneOffset = timeZoneOffset;
    }

    public Date getModelRun() {
        return modelRun;
    }

    public void setModelRun(Date modelRun) {
        this.modelRun = modelRun;
    }

    public Date getModelUpdate() {
        return modelUpdate;
    }

    public void setModelUpdate(Date modelUpdate) {
        this.modelUpdate = modelUpdate;
    }
}
