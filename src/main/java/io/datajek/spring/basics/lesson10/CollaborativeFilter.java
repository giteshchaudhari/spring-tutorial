package io.datajek.spring.basics.lesson10;

import io.datajek.spring.basics.lesson8.Filter;
import org.springframework.stereotype.Component;

@Component
public class CollaborativeFilter implements Filter {
    CollaborativeFilter() {
        System.out.println("CollaborativeFilter constructor called");
    }
    public String[] getRecommendations(String movie) {
        //logic of collaborative filter
        return new String[] { "Finding Nemo", "Ice Age", "Toy Story"};
    }
}