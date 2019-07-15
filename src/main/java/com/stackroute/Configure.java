package com.stackroute;



import com.stackroute.demo.BeanLifeCycleDemo;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Configure {
  @Bean("actor")
  public Actor createActor() {
    Actor actor = new Actor();
    actor.setAge(22);
    actor.setGender("Female");
    actor.setName("Asmitha");
    return actor;
  }


  @Bean(name = "movie")
  public Movie createMovie1() {
    Movie movie = new Movie(createActor());
    movie.setActor(createActor());
    return movie;
  }

  @Bean(initMethod = "customInit", destroyMethod = "customDestroy")
  public BeanLifeCycleDemo getMyFileSystemBean() {
    return new BeanLifeCycleDemo();
  }
}