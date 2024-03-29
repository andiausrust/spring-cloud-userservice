package com.andi.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EnableDiscoveryClient
public class UserserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserserviceApplication.class, args);
    }



}
