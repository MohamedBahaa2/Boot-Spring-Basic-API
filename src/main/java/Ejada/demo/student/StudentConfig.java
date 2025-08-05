package Ejada.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mohamed = new Student(
                    "Mohamed",
                    "mohamed.bahaa682004@gmail.com",
                    LocalDate.of(2004, Month.AUGUST,6)
            );
            Student john = new Student(
                    "John",
                    "John@gmail.com",
                    LocalDate.of(2004, Month.AUGUST,8)
            );
            repository.saveAll(
                    List.of(mohamed,john));

        };

    }
}
