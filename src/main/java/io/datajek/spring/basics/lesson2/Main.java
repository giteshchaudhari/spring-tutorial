package io.datajek.spring.basics.lesson2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        RecommenderImplementation recommender = new RecommenderImplementation(new CollaborativeFilter());
        String[] result = recommender.recommendMovies("Finding Dory");
        System.out.println(Arrays.toString(result));
    }
}