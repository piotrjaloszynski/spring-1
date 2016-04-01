package com.piotr.main;

import com.piotr.model.User;
import com.piotr.service.UserService;
import com.piotr.service.UserServiceImpl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by jalos on 01.04.2016.
 */


public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");

        //UserService us= new UserServiceImpl();
       UserService us=context.getBean("userServiceImpl",UserService.class);
        //1. userService - id beana ,
        // 2.pobranie  nazwy klasuy dla bina ktorego chcemy zaladaowac
        List<User> users=us.findAll(); // lista musi byc , bo to cala lista
     for (User u : users){
         System.out.println(u);
     }

    }
}
