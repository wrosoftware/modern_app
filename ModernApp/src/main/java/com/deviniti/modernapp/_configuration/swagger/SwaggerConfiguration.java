package com.deviniti.modernapp._configuration.swagger;

import com.deviniti.modernapp.common.annotation.ApiRestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spi.service.contexts.SecurityContextBuilder;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import static java.util.Arrays.asList;

@Configuration
@EnableSwagger2
class SwaggerConfiguration {

    @Value("${application.name}")
    private String title;
    @Value("${application.description}")
    private String description;
    @Value("${application.version}")
    private String version;

    @Bean
    Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .directModelSubstitute(LocalDateTime.class, String.class)
                .directModelSubstitute(LocalDate.class, String.class)
                .directModelSubstitute(LocalTime.class, String.class)
                .securitySchemes(asList(apiKey()))
                .securityContexts(asList(securityContext()))
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(ApiRestController.class))
                .paths(PathSelectors.any())
                .build();
    }

    private SecurityContext securityContext() {
        return SecurityContext.builder()
                .securityReferences(asList(securityReference()))
                .forPaths(PathSelectors.regex("(?!/application/).*"))
                .build();
    }

    private SecurityReference securityReference() {
        return SecurityReference.builder()
                .reference("JWT")
                .scopes(new AuthorizationScope[]{scope()})
                .build();
    }

    private AuthorizationScope scope() {
        return new AuthorizationScope("global", "global");
    }

    private ApiKey apiKey() {
        return new ApiKey("JWT", "Authorization", "header");
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(title)
                .description(description)
                .version(version)
                .build();
    }
}
