package com.weatrher.forecast.weatherforecast;

//import com.weather.forecast.mapper.ForecastMapper;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class WeatherforecastApplicationTests {

    @Test
    void contextLoads() {
    }

   // @Autowired
   // ForecastMapper forecastMapper;

    @Test
    public void whenRecordsInDatabase_shouldReturnArticleWithGivenId() {
        //ForecastEntity forecast = forecastMapper.getForecast(new Date());

        /*assertThat(forecast, IsNull.notNullValue());
        assertThat(forecast.getHumidity(), IsEqual.equalTo(1L));
        assertThat(forecast.getHumidity(), IsEqual.equalTo(""));
        assertThat(forecast.getHumidity(), IsEqual.equalTo(""));*/
    }

}
