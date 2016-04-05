package com.piotr.service;

import com.piotr.dao.UserDao;
import com.piotr.dao.UserDaoImpl;
import com.piotr.model.User;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by jalos on 01.04.2016.
 */
public class UserServiceImpl implements UserService{
private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao; // uzywamy tego bean  do wstrzykniecia tego konstruktora do serwisu
    }

    //new UserDaoImpl();
//UserDao po private to typ
    public List<User> findAll() {
        try {
            return userDao.findAll(); // findAll wyciagniecie wszystkich uczesntikow , w zmiennej userDao
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // wyciagnij uzytkownkiow to w dao piszesz
    return null; // jesli sie wywali to zwroci nulla
}

}
