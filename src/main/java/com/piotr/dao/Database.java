package com.piotr.dao;

import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by jalos on 01.04.2016.
 */

@Component
public class Database {
private Connection conn;
   private static final String URL = "jdbc:mysql://localhost:3306/spring-1";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public Database() {
      try{
          Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException e) {
          e.printStackTrace();
      }


    }
    public void connect() throws SQLException {
        conn= DriverManager.getConnection(URL,USER,PASSWORD);
    }
    public Connection getConn() throws SQLException {
        if (conn==null){
            connect();
        }
        return conn;

    }
}
