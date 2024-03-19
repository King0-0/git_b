package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {
	
	@GetMapping("/listBoard")
	public String listBoard() {
<<<<<<< HEAD
		System.out.println("31");
=======
		System.out.println("1");
>>>>>>> branch 'master' of https://github.com/King0-0/git_b.git
		return "게시물 목록";
		
	}
}
