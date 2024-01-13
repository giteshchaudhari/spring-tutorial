package io.datajek.spring.basics.lesson11;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ApplicationContext appContext = SpringApplication.run(Main.class, args);
        //Retrieve prototype bean from application context thrice
        RecommenderImplementation cf1 = appContext.getBean(RecommenderImplementation.class);
        System.out.println(cf1);
    }
}