package com.piotr.dao;

import com.piotr.model.User;

import java.util.List;

/**
 * Created by jalos on 01.04.2016.
 */
public interface UserDao {
   // symulowac uzytkownikow z bazy
    List<User> findAll(); // metoda abstrakcyjna nie ma implementacji nie dajemy klamere, ani jak ma zachowywac sie


}
