package com.wedson.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wedson.aula.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
