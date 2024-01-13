package io.datajek.spring.basics.lession9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilter implements Filter {
    private static int instances = 0;
    private Movie movie;

    public ContentBasedFilter() {
        instances++;
        System.out.println("ContentBasedFilter constructor called");
    }

    @Autowired
    @Qualifier("movie")
    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public static int getInstances() {
        return ContentBasedFilter.instances;
    }

    public Movie getMovie() {
        return movie;
    }

    public String[] getRecommendations(String movie) {
        //logic of content-based filter
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}