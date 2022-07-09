package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Applications { //Для запуска локального сервера, интернет не нужен.

    public static void main(String[] args) {
        SpringApplication.run(Applications.class);
    }
}
