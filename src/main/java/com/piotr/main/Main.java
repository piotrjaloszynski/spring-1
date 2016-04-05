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

        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("beans.xml"); // SPRING TWORZY OBIETK
        // w powyzszym spirng idzie i sam tworzy bagienko
        UserService us= context.getBean("userService",UserService.class);// pobierajac bean na podst. nazwy
        //user service przekazujesz kklase i nie robisz rzuztowania

        /// musimy powiedziec spirngu utworz aplication kontect i daj to
        List<User> users=us.findAll(); // lista musi byc , bo to cala lista
     for (User u : users){ // tymczasowa zmiena ktora uzywamy po iteracji po tablicy
         System.out.println(u);
     }

    }
}
