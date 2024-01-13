package io.datajek.spring.basics.lesson6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ApplicationContext appContext = SpringApplication.run(Main.class, args);
        RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);
        String[] result = recommender.recommendMovies("Finding Dory");
        System.out.println(Arrays.toString(result));
    }
}