package io.datajek.spring.basics.lesson10;

import io.datajek.spring.basics.lession9.ContentBasedFilter;
import io.datajek.spring.basics.lession9.Movie;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ApplicationContext appContext = SpringApplication.run(Main.class, args);
        //Retrieve prototype bean from application context thrice
        ContentBasedFilter cf1 = appContext.getBean(ContentBasedFilter.class);

         Movie movie1 = cf1.getMovie();
         Movie movie2 = cf1.getMovie();
         Movie movie3 = cf1.getMovie();

         System.out.println(movie1);
            System.out.println(movie2);
            System.out.println(movie3);

            System.out.println(ContentBasedFilter.getInstances());
            System.out.println(Movie.getInstances());


    }
}