package com.weather.forecast.dao;

import com.weather.forecast.model.ForecastEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface ForecastRepository  extends JpaRepository<ForecastEntity, Date> {
}
