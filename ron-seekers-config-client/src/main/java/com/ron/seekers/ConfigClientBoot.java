package com.ron.seekers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
//@RefreshScope
public class ConfigClientBoot {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientBoot.class, args);
    }


}
