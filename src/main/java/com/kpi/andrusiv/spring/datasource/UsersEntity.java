package com.kpi.andrusiv.spring.datasource;


import javax.persistence.*;

@Entity
public class UsersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String login;

    private String password;

    UsersEntity(){

    }

    UsersEntity(int id, String login, String password){
        this.id=id;
        this.login=login;
        this.password=password;
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
