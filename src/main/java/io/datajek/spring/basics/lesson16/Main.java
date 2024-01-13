package io.datajek.spring.basics.lesson16;



import io.datajek.spring.basics.lesson16.RecommenderImplementation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;

@SpringBootApplication
@PropertySource("classpath:app.properties")
public class Main {
    public static void main(String[] args) {

        //load the spring configuration file
        ApplicationContext appContext = SpringApplication.run(Main.class, args);

        //retrieve bean from the application context
        RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);

        //display value read from external property file
        String favoriteMovie = recommender.returnFavoriteMovie();
        System.out.println(favoriteMovie);

        //call method to get recommendations
        String[] result = recommender.recommendMovies(favoriteMovie);

        //display results
        System.out.println(Arrays.toString(result));
    }
}