package io.datajek.spring.basics.lesson4;

import io.datajek.spring.basics.lesson2.Filter;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Primary;

@Component
@Primary
public class CollaborativeFilter implements Filter {

    public String[] getRecommendations(String movie) {
        //logic of collaborative filter
        return new String[] { "Finding Nemo", "Ice Age", "Toy Story"};
    }
}