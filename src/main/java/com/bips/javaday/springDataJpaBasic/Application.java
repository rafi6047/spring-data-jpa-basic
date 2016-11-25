package com.bips.javaday.springDataJpaBasic;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.Resource;

/**
 * Created by Rafi on 2016-11-14.
 */
@SpringBootApplication
public class Application {

    @Resource
    private ProduceData produceData;

    @Resource
    private QueryData queryData;

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @Bean
    public CommandLineRunner demo() {
        return (args) -> {

            produceData.produceAndPersist();

            queryData.runQueries();

        };
    }



}