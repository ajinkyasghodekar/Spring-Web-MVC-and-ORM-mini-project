package in.practice.ajinkya.init;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import in.practice.ajinkya.config.MvcConfig;
import in.practice.ajinkya.config.OrmConfig;

public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {

	//NON-MVC (JDBC/ORM/EMAIl/...etc)
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { OrmConfig.class };
	}

	//WEB MVC CONFIG
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { MvcConfig.class };
	}

	//URL-Pattern
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}
}