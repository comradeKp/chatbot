package com.chatbot.api.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chatbot.api.model.Terminology;

public interface TerminologyRepository extends CrudRepository<Terminology, Integer>{
	List<Terminology> findAll();
}
