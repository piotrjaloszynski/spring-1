package com.piotr.dao;

import com.piotr.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jalos on 01.04.2016.
 */


public class UserDaoImpl implements UserDao {

    private Database database;

    public UserDaoImpl(Database database) {
        this.database = database;
    }

    public UserDaoImpl() {
    }


    // private Database database = new Database(); Z WOJTKIEM  czy tu moge umieszczac, tego
    // nie dajemy poniewaz  spring to zamienia , to jest zysk , on bedzie za pomoca dnotocacji i plikow
    // klonfuguracyjnych wstrzykiwal zaleznosc ktora mamy.


    // symulowac uzytkownikow z bazy
    public List<User> findAll() throws SQLException { // metoda abstrakcyjna nie ma implementacji w klasie nie dajemy klamere, ani jak ma zachowywac sie


        List<User> users = new ArrayList<>();
        Connection conn = database.getConn();
        PreparedStatement statement = conn.prepareStatement("Select *FROM user");
        ResultSet result = statement.executeQuery();

        while (result.next())

        {
            int id = result.getInt("id");// string ma byc w nawiasie funkcji
            String name = result.getString("name");
            String lastName = result.getString("lastName");
            User user = new User(id, name, lastName);
            users.add(user);

        }

        return users;
    }

    public void update(User user) throws SQLException {
        Connection conn = database.getConn();
        PreparedStatement statement = conn.prepareStatement("Update user SET  name=?, lastName=?  WHERE id=?");
        // pierwszy znak dla ktorego robimy pytanie to imie .stad stateme.nt  dla imienia

        statement.setString(1, user.getName());
        statement.setString(2, user.getLastName());

        statement.executeUpdate();

    }

    public void delete(User user) throws SQLException {
        Connection conn = database.getConn();
        PreparedStatement statement = conn.prepareStatement("DELETE  FROM user WHERE id=?"); // po to ? zeby moc sparametryzowac
        // zeby byla ciagle uzyteczna , jakbym  napisal  WHERE id= 1 to zawsze tylko nr 1 !
        statement.setInt(1, user.getId());
        // statement.setString(2,user.getNazwisko());
        //statement.setString(3, user.getEmail());
        statement.executeUpdate();// metoda zmieni cos  bylo 10 a jest 7, jezeli pworwadze zmian to excecute update. zamiast
        //excetuteQuery


    }

    public void save(User user) throws SQLException {
        Connection conn = database.getConn();
        PreparedStatement statement = conn.prepareStatement("iNSERT INTO user (id,name,lastName) values ( ?,?,?) "); // po to ? zeby moc sparametryzowac
        // zeby byla ciagle uzyteczna , jakbym  napisal  WHERE id= 1 to zawsze tylko nr 1 !
        statement.setInt(1, user.getId());
        statement.setString(2, user.getName());
        statement.setString(3, user.getLastName());

        statement.executeUpdate();

    }
}
