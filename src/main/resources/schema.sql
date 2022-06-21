CREATE SCHEMA IF NOT EXISTS forecast COLLATE utf8_general_ci;

USE forecast;

# This table added for the future possibility to get forecast on the daily basis
CREATE TABLE IF NOT EXISTS `DAILYFORECAST`(
                                              forecasttime    DATETIME PRIMARY KEY UNIQUE,
                                              temperature     DECIMAL(5, 2) NOT NULL,
                                              winddirection   DECIMAL(5, 2) NOT NULL,
                                              windspeed       DECIMAL(5, 2) NOT NULL,
                                              rainspot        INT NOT NULL,
                                              snowfraction    DECIMAL(5, 2) NOT NULL,
                                              windchill       DECIMAL(5, 2) NOT NULL
);

CREATE TABLE IF NOT EXISTS `HOURLYFORECAST`(
                                        forecasttime    DATETIME PRIMARY KEY UNIQUE,
                                        temperature     DECIMAL(5, 2) NOT NULL,
                                        winddirection   DECIMAL(5, 2) NOT NULL,
                                        windspeed       DECIMAL(5, 2) NOT NULL,
                                        precipitation   DECIMAL(7, 0) NOT NULL,
                                        snowfraction    DECIMAL(5, 2) NOT NULL,
                                        windchill       DECIMAL(5, 2) NOT NULL

);

