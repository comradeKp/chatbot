package com.chatbot.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AppInfo {
	@Id
	private Integer id;
	private String appName;
	private String environment;
	private String url;
	private String dbDetails;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDbDetails() {
		return dbDetails;
	}
	public void setDbDetails(String dbDetails) {
		this.dbDetails = dbDetails;
	}

}
