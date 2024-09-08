package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student mariam = new Student(
                "Mariam",
                "miriam@gmail.com",
                LocalDate.of(2003, Month.JANUARY, 18)
            );

            Student james = new Student(
                "James Bond",
                "James@gmail.com",
                LocalDate.of(1999, Month.FEBRUARY, 18)
            );

            studentRepository.saveAll(List.of(mariam, james));

        };
    }
}
