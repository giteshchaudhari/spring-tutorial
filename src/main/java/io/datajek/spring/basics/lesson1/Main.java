package io.datajek.spring.basics.lesson1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        RecommenderImplementation recommender = new RecommenderImplementation();
        String[] result = recommender.recommendMovies("Finding Dory");
        System.out.println(Arrays.toString(result));
    }
}