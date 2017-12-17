package com.ex.springsecurity.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class DemoSecuriyConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		// add our users for in memory authentication
		
		auth.inMemoryAuthentication()
			.withUser("john").password("test123").roles("EMPLOYEE");
		
		auth.inMemoryAuthentication()
			.withUser("mary").password("test123").roles("MANAGER");
		
		auth.inMemoryAuthentication()
			.withUser("admin").password("test123").roles("ADMIN");
		
	}
}