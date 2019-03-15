package com.kpi.andrusiv.spring.datasource;

import java.util.Map;

public interface UserDAO {

    boolean checkIfUserExists(String login,String password);

}
