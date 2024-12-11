package com.sam.hellosam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloSamApplication {


    @RequestMapping("/")
    String home() {
        return "Hello Sam!";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloSamApplication.class, args);
    }

}
