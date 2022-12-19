package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student wtb = new Student(1L,
                    "wtb",
                    "491179137@qq.com",
                    LocalDate.of(2000, Month.APRIL, 10)
            );
            repository.saveAll(
                    List.of(wtb)
            );


        };
    }
}
