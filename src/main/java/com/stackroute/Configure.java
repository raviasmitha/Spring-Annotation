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

  @Bean(name = {"movie1","movie"})
  @Scope("singleton")
  public Movie movieBean(){
    return new Movie(actorBean());
  }

  @Bean(name = "movie2")
  @Scope("prototype")
  public Movie moviebean2(){
    return new Movie(actorBean());
  }
}
