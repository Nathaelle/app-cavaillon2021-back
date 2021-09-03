package com.ecommerce.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

@Configuration
@EnableWebSecurity
class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    
	@Override
    protected void configure(HttpSecurity http) throws Exception {
      
        http.csrf().disable()
            .httpBasic().and()
            .authorizeRequests()
            	.antMatchers(HttpMethod.GET, "/categories-*", "/admin*", "/categories").permitAll()
            	.antMatchers(HttpMethod.POST, "/add-category").permitAll()
            	.antMatchers(HttpMethod.OPTIONS, "/add-category").permitAll()
                .anyRequest().authenticated();
            
      
    }
    
}
