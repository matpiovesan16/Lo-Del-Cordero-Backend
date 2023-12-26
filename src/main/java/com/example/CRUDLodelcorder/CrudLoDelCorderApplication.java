package com.example.CRUDLodelcorder;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.aspectj.apache.bcel.classfile.Module;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudLoDelCorderApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudLoDelCorderApplication.class, args);
	}

	@Bean
	public OpenAPI springShopOpenAPI() {
		return new OpenAPI()
				.info(new Info().title("Lo del Cordero Backend")
						.description("ApiRest Docs lo del Cordero")
						.version("v0.0.1")
						.license(new License().name("Apache 2.0").url("http://springdoc.org")))
				.externalDocs(new ExternalDocumentation()
						.description("SpringShop Wiki Documentation")
						.url("https://springshop.wiki.github.org/docs"));
	}

}
