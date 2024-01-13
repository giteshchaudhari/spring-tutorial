package io.datajek.spring.basics.lesson8;

import io.datajek.spring.basics.lesson8.Filter;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ContentBasedFilter implements Filter {
    public ContentBasedFilter() {
        System.out.println("ContentBasedFilter constructor called");
    }
    public String[] getRecommendations(String movie) {
        //logic of content-based filter
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}