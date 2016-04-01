package com.piotr.main;

import com.piotr.model.User;
import com.piotr.service.UserService;
import com.piotr.service.UserServiceImpl;

import java.util.List;

/**
 * Created by jalos on 01.04.2016.
 */
public class Main {
    public static void main(String[] args) {
UserService us= new UserServiceImpl();
        List<User> users=us.findAll(); // lista musi byc , bo to cala lista
     for (User u : users){
         System.out.println(u);
     }

    }
}
