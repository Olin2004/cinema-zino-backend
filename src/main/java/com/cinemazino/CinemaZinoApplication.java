package com.cinemazino;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.cinemazino", "com.cinemazino.mapper"})
public class CinemaZinoApplication {
    public static void main(String[] args) {
        // Load variables from .env file into System properties
        Dotenv dotenv = Dotenv.load();
        dotenv.entries().forEach(entry ->
                System.setProperty(entry.getKey(), entry.getValue())
        );

        SpringApplication.run(CinemaZinoApplication.class, args);
    }
}
