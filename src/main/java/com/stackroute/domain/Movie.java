package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.BeanFactory;

@Component
public class Movie {


    private  Actor actor;

    public Movie(Actor actor) {
        this.actor = actor;
    }

    @Autowired
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Actor getActor() {
        return actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }


    public void setApplicationContext(ApplicationContext applicationContext) {
        System.out.println(applicationContext);
    }


    public void setBeanName(String beam123) {
        System.out.println(beam123);
    }
}
