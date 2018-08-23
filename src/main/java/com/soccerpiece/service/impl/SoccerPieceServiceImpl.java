package com.soccerpiece.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soccerpiece.model.User;
import com.soccerpiece.repository.UsersRepository;
import com.soccerpiece.service.SoccerPieceService;

@Service
public class SoccerPieceServiceImpl implements SoccerPieceService{
	
	@Autowired
	private UsersRepository usersRepository;

	@Override
	public List<User> findAll() {
		return (List<User>)usersRepository.findAll();
	}

}
