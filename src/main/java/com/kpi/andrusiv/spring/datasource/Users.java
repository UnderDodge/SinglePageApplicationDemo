package com.kpi.andrusiv.spring.datasource;


import javax.persistence.*;
import java.util.Date;

@Entity
//@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "id")
    private int id;

    //@Column(name = "login")
    private String login;

    //@Column(name = "password")
    private String password;

    private Date created;

    public Users(){

    }

    public Users(String login, String password, Date created){
        this.login=login;
        this.password=password;
        this.created=created;
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

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
