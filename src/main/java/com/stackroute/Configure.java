package com.stackroute;


import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Configure {

  @Bean
  public Actor actorBean(){
    Actor actor = new Actor();
    actor.setName("asmitha");
    actor.setGender("female");
    actor.setAge(22);
    return actor;
  }

  @Bean(name = "movie1")
  public Movie movieBean(){
    return new Movie(actorBean());
  }

  @Bean(name = "movie2")
  public Movie movieBean2(){
    return new Movie(actorBean());
  }
}
