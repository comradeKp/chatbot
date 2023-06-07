package com.chatbot.api.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chatbot.api.model.Response;
import com.chatbot.api.repo.AppInfoRepository;

@Service
public class ChatbotServiceImpl {

	@Autowired
	AppInfoRepository appInfoRepository;

	public Response getAppInfo(String input) {
		String[] inputArray = input.toUpperCase().split("-");
		String app = inputArray[0];
		String env = inputArray[1];
		String action = inputArray[2];
		Response response = new Response();
		if (appInfoRepository.getAllAppNames().contains(app) && appInfoRepository.getAllEnv().contains(env)) {
			if (action.equals("DB")) {
				response.setInfo(appInfoRepository.getDbDetailsByAppNameAndEnvironment(app, env));
				response.setType("DB");
			} else if (action.equals("URL")) {
				response.setInfo(appInfoRepository.getUrlByAppNameAndEnvironment(app, env));
				response.setType("URL");
			}
		}
		return response;
	}

	public List<String> getActions() {
		return Arrays.asList(new String[] { "DB", "URL" });
	}

}
