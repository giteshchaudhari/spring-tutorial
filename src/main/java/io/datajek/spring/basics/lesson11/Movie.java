package io.datajek.spring.basics.lesson11;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE,
        proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Movie {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public Movie(){
        super();
        logger.info("In Movie constructor method");
    }

    @PostConstruct
    private void postConstruct(){
        logger.info("Movie PostConstruct");
    }

    @PreDestroy
    private void preDestroy(){
        logger.info("Movie PreDestroy");
    }
}
