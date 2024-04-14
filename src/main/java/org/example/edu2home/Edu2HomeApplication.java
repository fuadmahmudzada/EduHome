package org.example.edu2home;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
@EnableJpaAuditing
@SpringBootApplication
public class Edu2HomeApplication {

    public static void main(String[] args) {
        SpringApplication.run(Edu2HomeApplication.class, args);
    }

}
