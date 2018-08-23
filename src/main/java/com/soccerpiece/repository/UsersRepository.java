package com.soccerpiece.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.soccerpiece.model.User;

@Repository
public interface UsersRepository extends CrudRepository<User, Long> {

}
