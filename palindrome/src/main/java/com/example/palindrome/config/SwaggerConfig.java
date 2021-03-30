package com.example.palindrome.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI(){
        return new OpenAPI().info(new Info()
                .title("Assessment")
                .description("add more description")
                .version("0.0.1-SNAPSHOT"))
                .addServersItem(new Server().url("http://localhost:8080/demo"));
    }
}
