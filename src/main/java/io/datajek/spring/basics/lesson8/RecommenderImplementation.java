package io.datajek.spring.basics.lesson8;

import io.datajek.spring.basics.lesson8.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
//public class RecommenderImplementation {
//
//    //use filter interface to select filter
//    @Autowired
//    private Filter filter;
//
//    public String [] recommendMovies (String movie) {
//
//        //print the name of interface implementation being used
//        System.out.println("Name of the filter in use: " + filter + "\n");
//
//        String[] results = filter.getRecommendations("Finding Dory");
//
//        return results;
//    }
//}