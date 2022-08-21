package com.reservapiscina.apirest.config;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


import static springfox.documentation.builders.PathSelectors.regex;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
		@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.reservapiscina.apirest"))
				.paths(regex("/api.*"))
				.build()
				.apiInfo(metaInfo());
	}
	

	private ApiInfo metaInfo() {
		
		ApiInfo apiInfo = new ApiInfo(
				"Produtos API REST",
				"API REST de cadastro de produtos.",
				"1.0",
				"Terms of Service",
				new Contact("Candice Brasileiro", "youtube.com", "candicelopes88@gmail.com"),
				"Apache Licence Version 2.0",
				"http://www.apache.org/licensen.html", new ArrayList<VendorExtension>()
		);
		
		return apiInfo;
	}
}
