package com.piotr.dao;

import com.piotr.model.User;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by jalos on 01.04.2016.
 */
public interface UserDao {
     List<User> findAll() throws SQLException; // ma byc publiczna i abstrakcyjna
    void update(User user) throws SQLException;
    void delete(User user) throws SQLException;
    void save(User user) throws SQLException;

}

// interfejs  podsumowujace metody , co umie zrobic