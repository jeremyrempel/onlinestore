package com.github.jeremyrempel.onlinestore;

import io.reactivex.Single;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class OnlineStoreApplication {

    public static void main(String[] args) {
        Single.just("Hello World!").subscribe(System.out::println);

        SpringApplication.run(OnlineStoreApplication.class, args);
    }
}
