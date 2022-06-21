package com.weather.forecast.service;

import com.weather.forecast.model.ForecastEntity;

import java.util.Date;
import java.util.List;

public interface ForecastService {

    void saveForecasts(List<ForecastEntity> forecasts);

    List<ForecastEntity> getForecasts(Date dateFrom, Date dateTo);

}
