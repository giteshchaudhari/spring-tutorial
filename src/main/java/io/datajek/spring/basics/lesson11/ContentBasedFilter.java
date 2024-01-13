package io.datajek.spring.basics.lesson11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;

@Component
public class ContentBasedFilter implements Filter {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    public ContentBasedFilter() {
        System.out.println("ContentBasedFilter constructor called");
    }


    @PostConstruct
    private void postConstruct() {
        //load movies into cache
        logger.info("In ContentBasedFilter postConstruct method");
    }

    public String[] getRecommendations(String movie) {
        //logic of content-based filter
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}