package com.projetowebservice.course.service;

import com.projetowebservice.course.entities.User;
import com.projetowebservice.course.repositories.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepositories repositories;

    public List<User> findAll(){
        return repositories.findAll();
    }
    public User findById(Long id ){
        Optional<User> obj = repositories.findById(id);
        return obj.get();
    }
}
