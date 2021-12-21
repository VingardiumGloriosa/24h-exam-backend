package com.example.exambackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class ExamBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamBackendApplication.class, args);
    }

}
