package com.kpi.andrusiv.spring.datasource.entity;



import javax.persistence.*;
import java.util.List;

@Entity
public class Games {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @ManyToMany(mappedBy = "games")
    private List<Users> users;

    public Games(){

    }

    public Games(String name){
        this.name=name;
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
}
