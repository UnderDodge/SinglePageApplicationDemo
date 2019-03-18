package com.kpi.andrusiv.spring.domain;

public interface LoginService {


    void login(String login, String password);

    void create(String login, String password);

}
