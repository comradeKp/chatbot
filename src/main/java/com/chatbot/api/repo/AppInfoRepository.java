package com.chatbot.api.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chatbot.api.model.AppInfo;
@Repository
public interface AppInfoRepository extends CrudRepository<AppInfo, Integer> {
	List<AppInfo> findAll();
	@Query("select distinct appName from AppInfo")
	List<String> getAllAppNames();
	@Query("select environment from AppInfo where appName = ?1")
	List<String> getEnvByAppName(String app);
	@Query("select dbDetails from AppInfo where appName = ?1 and environment = ?2")
	String getDbDetailsByAppNameAndEnvironment(String app, String env);
	@Query("select url from AppInfo where appName = ?1 and environment = ?2")
	String getUrlByAppNameAndEnvironment(String app, String env);
}
