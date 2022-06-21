package com.weather.forecast.service;


import com.weather.forecast.dao.ForecastRepository;
import com.weather.forecast.model.ForecastEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.Date;
import java.util.List;

@Service("forecastService")
public class DefaultForecastService implements ForecastService {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private ForecastRepository forecastRepository;

    @Override
    public void saveForecasts(List<ForecastEntity> forecasts) {
        forecastRepository.saveAll(forecasts);
    }

    @Override
    public List<ForecastEntity> getForecasts(Date dateFrom, Date dateTo) {

        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<ForecastEntity> criteria = builder.createQuery(ForecastEntity.class);
        Root<ForecastEntity> from = criteria.from(ForecastEntity.class);
        criteria.select(from);
        if (dateFrom != null && dateTo != null) {
            criteria.where(builder.between(from.get("forecastTime"), dateFrom, dateTo));
        } else if (dateFrom != null) {
            criteria.where(builder.greaterThanOrEqualTo(from.get("forecastTime"), dateFrom));
        } else if (dateTo != null) {
            criteria.where(builder.lessThanOrEqualTo(from.get("forecastTime"), dateTo));
        }

        TypedQuery<ForecastEntity> typed = entityManager.createQuery(criteria);
        try {
            return typed.getResultList();
        } catch (final NoResultException nre) {
            return null;
        }
    }
}
