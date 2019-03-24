package com.kpi.andrusiv.spring.datasource;

import com.kpi.andrusiv.spring.datasource.entity.Games;
import com.kpi.andrusiv.spring.datasource.entity.Users;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GamesRepository extends CrudRepository<Games, Long> {
    Games findByUsers(Users users);
    List <Games> findAll();
}
