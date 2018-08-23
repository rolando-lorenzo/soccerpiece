package com.soccerpiece.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soccerpiece.model.User;
import com.soccerpiece.service.SoccerPieceService;

@RestController
@RequestMapping("/api")
public class SoccerPieceController {
	
	@Autowired
	private SoccerPieceService soccerPieceService;
	
	@GetMapping("/")
	public String home() {
		return "Services Up !!";
	}
	
	@GetMapping("/users")
	public List<User> getNoteById() {
	    return soccerPieceService.findAll();
	}

}
