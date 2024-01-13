package io.datajek.spring.basics.lesson3;

import io.datajek.spring.basics.lesson2.Filter;

public class CollaborativeFilter implements Filter {

    public String[] getRecommendations(String movie) {
        //logic of collaborative filter
        return new String[] { "Finding Nemo", "Ice Age", "Toy Story"};
    }
}