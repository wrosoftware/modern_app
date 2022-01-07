package com.deviniti.modernapp._configuration.spring;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import static com.deviniti.modernapp._configuration.spring.SpringConfiguration.BASE_PACKAGE;

@Configuration
@ComponentScan(BASE_PACKAGE)
@EntityScan(BASE_PACKAGE)
@EnableJpaRepositories(BASE_PACKAGE)
class SpringConfiguration {
    static final String BASE_PACKAGE = "com.deviniti.modernapp";
}
