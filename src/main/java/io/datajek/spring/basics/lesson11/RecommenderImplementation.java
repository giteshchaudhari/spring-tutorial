package io.datajek.spring.basics.lesson11;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    private Filter filter;
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    public void setFilter(Filter filter) {
        this.filter = filter;
        logger.info("In RecommenderImplementation setter method..dependency injection");
    }

    @PostConstruct
    public void postConstruct() {
        logger.info("In RecommenderImplementation postConstruct method..");
    }

    public String [] recommendMovies (String movie) {

        System.out.println("Name of the filter in use: " + filter + "\n");

        String[] results = filter.getRecommendations("Finding Dory");

        return results;
    }
}