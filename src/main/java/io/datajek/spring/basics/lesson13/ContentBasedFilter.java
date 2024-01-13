package io.datajek.spring.basics.lesson13;

import io.datajek.spring.basics.lesson2.Filter;
import org.springframework.stereotype.Component;

import javax.inject.Named;

@Component
public class ContentBasedFilter implements Filter {

    public String[] getRecommendations(String movie) {
        //logic of content-based filter
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}