package org.niit.BEJ_C14_S1_Auth1;

import org.niit.BEJ_C14_S1_Auth1.filter.JwtFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BejC14S1Auth1Application {

	public static void main(String[] args) {
		SpringApplication.run(BejC14S1Auth1Application.class, args);
	}
	@Bean
	public FilterRegistrationBean jwtFilter(){
		FilterRegistrationBean frb=new FilterRegistrationBean<>();
		frb.setFilter(new JwtFilter());
		frb.addUrlPatterns("/api/v2/users","/api/v1/users/{email}");
//		frb.addUrlPatterns("/api/v2/*");// addUrlPatter(String ...)// var-args
		return frb;
	}

}
