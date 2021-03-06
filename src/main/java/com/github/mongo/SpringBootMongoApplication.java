package com.github.mongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;


/**
 * @author shao
 */
@EnableScheduling
@EnableMongoAuditing
@SpringBootApplication
@EnableMongoRepositories
public class SpringBootMongoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMongoApplication.class, args);
    }

}
