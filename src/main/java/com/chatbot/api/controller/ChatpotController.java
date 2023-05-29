package com.chatbot.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chatbot.api.model.Terminology;
import com.chatbot.api.repo.TerminologyRepository;

@Controller
@RequestMapping(path = "/chatbot")
public class ChatpotController {

	@Autowired
	TerminologyRepository repo;

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<Terminology> getAllUsers() {
		return repo.findAll();
	}
}
