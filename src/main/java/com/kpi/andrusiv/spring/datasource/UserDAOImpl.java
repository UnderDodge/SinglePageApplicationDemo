package com.kpi.andrusiv.spring.datasource;

import com.mysql.jdbc.Connection;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;


@Repository
public class UserDAOImpl implements UserDAO {

    Connection con = null;
    Statement statement = null;
    ResultSet result = null;

    @PostConstruct
    public void init() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/InfoPulseLogin?user=root&amp;password=");
            statement = con.createStatement();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {



            /*
            if(result!=null){
                try {
                    result.close();
                    System.out.println("Result closed");
                } catch (SQLException e) { }
            }
            if(statement!=null){
                try {
                    statement.close();
                    System.out.println("Statement closed");
                } catch (SQLException e) { }
            }
            if(con!=null){
                try {
                    con.close();
                    System.out.println("Connection closed");
                } catch (SQLException e) { }
            }
            */
        }

    }

    @Override
    public boolean checkIfUserExists(String login, String password) {
        try {
            result = statement.executeQuery("SELECT * FROM users WHERE login='" + login + "' AND password='" + password + "'");
            if (result.next()){
                System.out.println("Welcome, "+result.getString("login"));
                return true;
            }else{
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public void setUser(String login, String password) {

    }
}
