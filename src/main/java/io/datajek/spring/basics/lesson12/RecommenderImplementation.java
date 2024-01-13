package io.datajek.spring.basics.lesson12;

import io.datajek.spring.basics.lesson2.Filter;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class RecommenderImplementation {

    //use filter interface to select filter
    private Filter filter;

    @Inject
    public RecommenderImplementation( @Qualifier("collaborativeFilter") Filter filter){
        this.filter = filter;
        System.out.println("Constructor invoked...");
    }
    public String [] recommendMovies (String movie) {

        //print the name of interface implementation being used
        System.out.println("Name of the filter in use: " + filter + "\n");

        String[] results = filter.getRecommendations("Finding Dory");

        return results;
    }
}