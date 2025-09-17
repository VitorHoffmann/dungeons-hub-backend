package com.example.dungeonshubbackend;

import org.springframework.boot.SpringApplication;

public class TestDungeonsHubBackendApplication {

    public static void main(String[] args) {
        SpringApplication.from(DungeonsHubBackendApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
