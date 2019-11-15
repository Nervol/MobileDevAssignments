package com.example.lab01;

public class User {
    private String login;
    private String password;
    private int picture;

    public User(String login, String password, int picture) {
        this.login = login;
        this.password = password;
        this.picture = picture;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
