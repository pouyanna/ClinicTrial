package com.project.clinicaltrials;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

import static springfox.documentation.builders.PathSelectors.regex;


@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select().apis(RequestHandlerSelectors.basePackage("com.project.clinicaltrials"))
                .paths(regex("/.*"))
                .build()
                .apiInfo(metaData());

    }
    private ApiInfo metaData() {
        return new ApiInfo(
                "Api 1413",
                "Spring Boot REST API for BookStock App",
                "1.0",
                "Terms of service",
                new Contact("mina", "esmailza@unlv.nevada.edu", "1234@yahoo.com"),
                "Apache License Version 2.0",
                "https://www.apache.org/licenses/LICENSE-2.0", Collections.emptyList());
    }

}
