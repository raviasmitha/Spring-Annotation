package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configure.class);
        Movie movie = (Movie) applicationContext.getBean("movie");
        System.out.println(movie.getActor());
        Movie movie1 = applicationContext.getBean("movie1",Movie.class);
        System.out.println(movie1.getActor());
        System.out.print("singleton scope: ");
        System.out.println(movie==movie1);
        Movie movie2 = applicationContext.getBean("movie2",Movie.class);
        System.out.println(movie2.getActor());
        Movie movie3 = applicationContext.getBean("movie2",Movie.class);
        System.out.println(movie3.getActor());
        System.out.print("prototype scope: ");
        System.out.println(movie2==movie3);




    }

}