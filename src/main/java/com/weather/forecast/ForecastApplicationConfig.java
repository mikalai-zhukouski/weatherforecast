package com.weather.forecast;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
public class ForecastApplicationConfig {

    @Bean
    public OpenAPI forecastOpenAPI() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Forecast Swagger Api")
                                .version("1.0.0")
                );
    }
}
