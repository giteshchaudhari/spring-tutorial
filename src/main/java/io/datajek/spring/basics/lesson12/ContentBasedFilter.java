package io.datajek.spring.basics.lesson12;

import io.datajek.spring.basics.lesson2.Filter;
import org.springframework.stereotype.Component;

import javax.inject.Named;

@Named
public class ContentBasedFilter implements Filter {

    public String[] getRecommendations(String movie) {
        //logic of content-based filter
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}