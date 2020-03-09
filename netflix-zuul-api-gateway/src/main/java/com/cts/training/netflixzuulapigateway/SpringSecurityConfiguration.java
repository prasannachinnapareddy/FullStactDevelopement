package com.cts.training.netflixzuulapigateway;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;
@Configuration
@EnableWebSecurity
public class SpringSecurityConfiguration extends WebSecurityConfigurerAdapter
{
	
//		@Autowired
//		PasswordEncoder passwordEncoder;
		
		@Autowired
		DataSource dataSource;
	
		@Override
	    protected void configure(HttpSecurity http) throws Exception 
	 	{
	  
	      	http.authorizeRequests()
	        .antMatchers("/").permitAll()
	        .antMatchers("user-service/login").access("hasRole('USER','ADMIN')")
	        .antMatchers("/user-service/**").access("hasRole('USER')")
	      	.and().csrf().disable()
	      	.httpBasic();
	 	}

		@Override
		protected void configure(AuthenticationManagerBuilder auth) throws Exception
		{
			auth.jdbcAuthentication()
			.usersByUsernameQuery("select uname,psw,true from registers where uname=?")
			.authoritiesByUsernameQuery("select uname,user_type from registers where uname=?")
			.dataSource(dataSource)
			.passwordEncoder(new PasswordEncoder() {

				@Override
				public String encode(CharSequence rawPassword) 
				{
					return rawPassword.toString();
				}

				@Override
				public boolean matches(CharSequence rawPassword, String encodedPassword) 
				{
					return rawPassword.equals(encodedPassword);
				}
			});
		}
}
