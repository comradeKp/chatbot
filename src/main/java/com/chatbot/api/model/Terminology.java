package com.chatbot.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Terminology {
	@Id
	private Integer termId;
	private String name;
	private String url;

	public Integer getTermId() {
		return termId;
	}

	public void setTermId(Integer termId) {
		this.termId = termId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
