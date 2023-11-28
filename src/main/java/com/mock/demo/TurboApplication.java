package com.mock.demo;

import lombok.SneakyThrows;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableMBeanExport;


@EnableMBeanExport
@SpringBootApplication
public class TurboApplication {

    public static void main(String[] args) {

        SpringApplication.run(TurboApplication.class, args);
    }
}
