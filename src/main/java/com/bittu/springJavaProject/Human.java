package com.bittu.springJavaProject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component

public class Human {
    Logger logger= LoggerFactory.getLogger(Human.class);
    Burger burger;
    @Autowired
    Human (Burger burger){
        this.burger=burger;

    }
    public void eat()
    {
       logger.info("eating before ");
       logger.debug("meri debug karo");
       logger.error("kch  to glt h");
        System.out.println("Eating burger"+burger.getBrandName());

    }
  /*  @PostConstruct
    void post(){
        logger.info("human ka human");

        }

    @PreDestroy
    void pre(){
        logger.info("human");
    }*/
}
