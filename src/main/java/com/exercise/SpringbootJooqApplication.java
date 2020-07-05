package com.exercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootJooqApplication {

    public static void main(String[] args) {
        System.getProperties().setProperty("org.jooq.no-logo", "true");
        SpringApplication.run(SpringbootJooqApplication.class, args);
    }

}
