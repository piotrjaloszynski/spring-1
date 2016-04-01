package com.piotr.dao;

import com.piotr.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jalos on 01.04.2016.
 */

@Repository
public class UserDaoImpl implements UserDao {
@Autowired // spring worzac  user DDao znadzie beana i go wstrzyknie
 private Database database;

         //= new Database();
// metoda mogla pobrac  polaczenie i cos zrobic
    // zrob zeby cos zrobila , potrzeba implementacja  database nowa baza danych i metoda find all tez ma
    // odpytywac,
    public List<User> findAll() { // pojQIL w by zaimplementowac z useDao
        List<User> users= new ArrayList<User>();
        users.add(new User("John","Smith"));
        users.add(new User("Zaba","Afrykanska"));
        users.add(new User("Iza","Opolska"));

        return users;


    }


}
