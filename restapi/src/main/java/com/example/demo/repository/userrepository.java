package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.user;

@Repository

public interface userrepository extends CrudRepository<user, Integer>{

}
