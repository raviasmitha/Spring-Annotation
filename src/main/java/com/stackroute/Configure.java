package com.stackroute;


import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.stackroute")
public class Configure {

  @Bean
  public Actor actorBean(){
    Actor actor = new Actor();
    actor.setName("asmitha");
    actor.setGender("female");
    actor.setAge(22);
    return actor;
  }


}
