package com.chatbot.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chatbot.api.model.Response;
import com.chatbot.api.model.Terminology;
import com.chatbot.api.repo.AppInfoRepository;
import com.chatbot.api.repo.TerminologyRepository;
import com.chatbot.api.service.impl.ChatbotServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:3000/", maxAge = 3600)
@RequestMapping(path = "/chatbot")
public class ChatpotController {

	@Autowired
	TerminologyRepository termRepo;

	@Autowired
	AppInfoRepository appRepo;
	
	@Autowired
	ChatbotServiceImpl chatbotService;


	@GetMapping(path = "/all-terms")
	public List<Terminology> getAllTermInfo() {
		return termRepo.findAll();
	}

	@GetMapping(path = "/all-apps")
	public List<String> getAllAppNames() {
		return appRepo.getAllAppNames();
	}
	
	@GetMapping(path = "/all-envs")
	public List<String> getAllEnvironments() {
		return appRepo.getAllEnv();
	}
	
	@GetMapping(path = "/all-actions")
	public List<String> getAllActions() {
		return chatbotService.getActions();
	}

	@GetMapping(path = "/environments/{app}")
	public List<String> getEnvironments(@PathVariable String app) {
		return appRepo.getEnvByAppName(app);
	}

	@GetMapping(path = "/db-details/{app}/{env}")
	public String getDbDetails(@PathVariable String app, @PathVariable String env) {
		return appRepo.getDbDetailsByAppNameAndEnvironment(app, env);
	}

	@GetMapping(path = "/endpoint/{app}/{env}")
	public String getEndPoint(@PathVariable String app, @PathVariable String env) {
		return appRepo.getUrlByAppNameAndEnvironment(app, env);
	}
	
	@GetMapping(path = "/app-info/{input}")
	public Response getAppInfo(@PathVariable String input) {
		return chatbotService.getAppInfo(input);
	}
}
