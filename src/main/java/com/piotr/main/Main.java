package com.piotr.main;

import com.piotr.config.AppConfig;
import com.piotr.model.User;
import com.piotr.service.UserService;
import com.piotr.service.UserServiceImpl;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by jalos on 01.04.2016.
 */


public class Main {
    public static void main(String[] args) {
       AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
// przkeazuje klase ktora jest klasa configuracyjna
        //UserService us= new UserServiceImpl();
       UserService us=context.getBean("userServiceImpl",UserService.class);
        //1. userService - id beana ,
        // 2.pobranie  nazwy klasuy dla bina ktorego chcemy zaladaowac
        List<User> users=us.findAll(); // lista musi byc , bo to cala lista
     for (User u : users){ // tymczasowa zmiena ktora uzywamy po iteracji po tablicy
         System.out.println(u);
     }

    }
}
