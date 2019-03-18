package com.kpi.andrusiv.spring.datasource;

import java.sql.Date;
import java.util.Map;

public interface UserDAO {

    boolean checkIfUserExists(String login,String password);

    void setUser(String login, String password);

}
