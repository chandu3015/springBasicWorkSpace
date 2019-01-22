package com.chandu.spring.basics.Components;




import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentDao {
	
	private  Logger  LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	ComponentJdbcConnection jdbcConnection;
	
	public ComponentDao(ComponentJdbcConnection jdbcConnection)
	{
		this.jdbcConnection = jdbcConnection;
	}

	public ComponentJdbcConnection getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(ComponentJdbcConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}
	
	
	@PostConstruct
	public void postConstruct()
	{
		LOGGER.info("Post COnstruct in ComponentDAO");
	}
	
	@PreDestroy
	public void preDestroy()
	{
		LOGGER.info("Pre Destroy in ComponentDAO");
	}
	
	

}
