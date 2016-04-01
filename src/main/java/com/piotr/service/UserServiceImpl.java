package com.piotr.service;

import com.piotr.dao.UserDao;
import com.piotr.dao.UserDaoImpl;
import com.piotr.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jalos on 01.04.2016.
 */


// tu robimy  bo mamy zaleznosci tutaj
@Service
public class UserServiceImpl implements UserService{

@Autowired
    private UserDao userDao;

            //= new UserDaoImpl();
//UserDao po private to typ
    public List<User> findAll() {
        return userDao.findAll(); // findAll wyciagniecie wszystkich uczesntikow , w zmiennej userDao
        // wyciagnij uzytkownkiow to w dao piszesz
    }
}
