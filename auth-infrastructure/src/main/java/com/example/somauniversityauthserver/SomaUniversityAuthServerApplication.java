package com.example.somauniversityauthserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class SomaUniversityAuthServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SomaUniversityAuthServerApplication.class, args);
    }

}
