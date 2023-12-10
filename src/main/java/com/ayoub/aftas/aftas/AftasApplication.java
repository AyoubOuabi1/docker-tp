package com.ayoub.aftas.aftas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@SpringBootApplication
public class AftasApplication {

    @GetMapping("")
    public String get() {
        return "aftas";
    }
    public static void main(String[] args) {
        SpringApplication.run(AftasApplication.class, args);
    }

}