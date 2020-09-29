package com.caseyjofleck.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@ComponentScan(basePackages = "com.caseyjofleck")
@Import({SpringRepositoryConfig.class})
public class SpringConfig {	    	
}
