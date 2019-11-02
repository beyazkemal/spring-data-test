package com.kemalbeyaz.springdatatest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class SpringDataTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataTestApplication.class, args);
    }
}
