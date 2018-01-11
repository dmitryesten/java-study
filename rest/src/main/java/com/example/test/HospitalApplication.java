package com.example.test;

import com.example.test.models.Article;
import com.example.test.models.Doctor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HospitalApplication {

    @Bean
    public Doctor getDoctor() {
        return new Doctor();
    }

    @Bean
    public Article getArticle(){
        return new Article();
    }

    public static void main(String[] args) {
        SpringApplication.run(HospitalApplication.class, args);
    }

}
