package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;

@ComponentScan (basePackages = "com.stackroute.Domain")
public class Main
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Configure.class);
        Movie movie = context.getBean("movie",Movie.class);

        System.out.println(movie.getActor());
        context.registerShutdownHook();

    }
}
