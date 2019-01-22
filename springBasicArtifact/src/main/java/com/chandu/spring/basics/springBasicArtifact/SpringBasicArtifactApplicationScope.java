package com.chandu.spring.basics.springBasicArtifact;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.chandu.spring.basics.Components.ComponentDao;
import com.chandu.spring.basics.springBasicArtifact.scope.PersonDao;



@SpringBootApplication
@ComponentScan("com.chandu.spring.basics.Components")
public class SpringBasicArtifactApplicationScope {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringBasicArtifactApplicationScope.class);
	
	
	public static void main(String[] args) {
		
		
		ApplicationContext applicationContext =  SpringApplication.run(SpringBasicArtifactApplicationBasic.class, args);
					
		PersonDao personDao= applicationContext.getBean(PersonDao.class);
		
		/*PersonDao personDao2= applicationContext.getBean(PersonDao.class);
		
		LOGGER.info("{}",personDao);
		LOGGER.info("{}",personDao.getJdbcConnection());
		
		LOGGER.info("{}",personDao2);
		LOGGER.info("{}",personDao2.getJdbcConnection());*/
		
       ComponentDao componentDao= applicationContext.getBean(ComponentDao.class);
		
		LOGGER.info("{}",componentDao);
		LOGGER.info("{}",componentDao.getJdbcConnection());
		
		
	}

}
