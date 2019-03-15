package com.kpi.andrusiv.spring.domain;

import org.springframework.stereotype.Service;

@Service
public class LDAPLoginService implements LoginService {


    @Override
    public void login(String login, String password) {
        throw new RuntimeException("LDAP login not supported");
    }
}
