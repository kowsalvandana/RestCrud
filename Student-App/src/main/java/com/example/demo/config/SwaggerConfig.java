package com.example.demo.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.PathSelectors;
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	 public Docket myApi() {
	 return new Docket (DocumentationType.SWAGGER_2)
	 .select()
	 .apis(RequestHandlerSelectors.basePackage("com.example.demo.controller"))
	 .paths(PathSelectors.regex("/student.*"))
	 .build();
	 }
	}
