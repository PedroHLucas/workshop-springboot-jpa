package com.projetowebservice.course.repositories;

import com.projetowebservice.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositories extends JpaRepository<User, Long> {


}
