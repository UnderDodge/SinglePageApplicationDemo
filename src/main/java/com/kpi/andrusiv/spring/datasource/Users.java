package com.kpi.andrusiv.spring.datasource;


import javax.persistence.*;

@Entity
//@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name = "id")
    private int id;

    //@Column(name = "login")
    private String login;

    //@Column(name = "password")
    private String password;

    public Users(){

    }

    public Users(int id, String login, String password){
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
