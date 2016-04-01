package com.piotr.service;

import com.piotr.dao.UserDao;
import com.piotr.dao.UserDaoImpl;
import com.piotr.model.User;

import java.util.List;

/**
 * Created by jalos on 01.04.2016.
 */
public class UserServiceImpl implements UserService{
private UserDao userDao= new UserDaoImpl();
//UserDao po private to typ
    public List<User> findAll() {
        return userDao.findAll(); // findAll wyciagniecie wszystkich uczesntikow , w zmiennej userDao
        // wyciagnij uzytkownkiow to w dao piszesz
    }
}
