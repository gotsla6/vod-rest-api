package com.education.hybe;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class HybeApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(HybeApplication.class)
            .build()
            .run(args);
    }
}
