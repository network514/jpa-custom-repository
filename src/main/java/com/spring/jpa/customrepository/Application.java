package com.spring.jpa.customrepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
// ~Impl -> ~default로 접미어 변경
//@EnableJpaRepositories(repositoryImplementationPostfix = "default")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
