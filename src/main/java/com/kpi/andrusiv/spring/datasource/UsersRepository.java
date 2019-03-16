package com.kpi.andrusiv.spring.datasource;

import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<Users, Long> {
    Users findByLoginAndPassword(String login,String password);
}
