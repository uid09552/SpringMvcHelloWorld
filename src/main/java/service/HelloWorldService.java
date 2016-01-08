package service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.context.WebApplicationContext;

@Service
public class HelloWorldService {
	private static final Logger logger = LoggerFactory.getLogger(HelloWorldService.class);
	
	public String getDesc() {
		logger.debug("getDesc() called");
		
		return "Gradle + Spring MVC Hello World Example";
	}
	
	public String getTitle(String name)
	{
		if (StringUtils.isEmpty(name)){
			return "Hello World, from Spring MVC";
		}else {
			return "Hello " + name;
		}
	}
	
}
