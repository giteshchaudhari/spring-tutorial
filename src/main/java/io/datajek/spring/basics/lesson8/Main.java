package io.datajek.spring.basics.lesson8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ApplicationContext appContext = SpringApplication.run(Main.class, args);
        CollaborativeFilter collaborativeFilter1 = appContext.getBean(CollaborativeFilter.class);
        CollaborativeFilter collaborativeFilter2 = appContext.getBean(CollaborativeFilter.class);
        CollaborativeFilter collaborativeFilter3 = appContext.getBean(CollaborativeFilter.class);

        System.out.println(collaborativeFilter1);
        System.out.println(collaborativeFilter2);
        System.out.println(collaborativeFilter3);

        //Retrieve prototype bean from application context thrice
        ContentBasedFilter cf1 = appContext.getBean(ContentBasedFilter.class);
        ContentBasedFilter cf2 = appContext.getBean(ContentBasedFilter.class);
        ContentBasedFilter cf3 = appContext.getBean(ContentBasedFilter.class);

        System.out.println(cf1);
        System.out.println(cf2);
        System.out.println(cf3);
    }
}