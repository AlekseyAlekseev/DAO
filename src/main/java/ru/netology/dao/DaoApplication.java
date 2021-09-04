package ru.netology.dao;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DaoApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(DaoApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }
}
