package com.piotr.model;

/**
 * Created by jalos on 01.04.2016.
 */
public class User {
private int id;
    private String name;
    private String lastName;


    public User(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
    // tworzymy dla wszystkich
    // robimy dla wszystkich oprocz  id
    // jedno bezpoaramentrczyny


    public User(int id,String name, String lastName) {
        this.lastName = lastName;
        this.id = id;
        this.name = name;
    }

    public User() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

}
