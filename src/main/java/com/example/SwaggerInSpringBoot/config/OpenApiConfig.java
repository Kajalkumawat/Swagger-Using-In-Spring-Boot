//package com.example.SwaggerInSpringBoot.config;
//
//import io.swagger.v3.oas.annotations.OpenAPIDefinition;
//import io.swagger.v3.oas.models.Components;
//import io.swagger.v3.oas.models.OpenAPI;
//import io.swagger.v3.oas.models.info.Info;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@OpenAPIDefinition
//@Configuration
//public class OpenApiConfig {
//    /*
//    The purpose of this class is to configure the basic settings for Swagger
//    /OpenAPI documentation in a Spring Boot application and to provide the basic configuration needed to create the documentation.
//    The title, version and description parameters we specified will appear in the Swagger interface.
//     */
//    @Bean
//    public OpenAPI baseOpenAPI() {
//        return new OpenAPI().components(new Components())
//                .info(new Info()
//                        .title("Springboot_Swagger Project OpenAPI Docs")
//                        .version("1.0.0").description("Doc Description"));
//    }
//
//}
