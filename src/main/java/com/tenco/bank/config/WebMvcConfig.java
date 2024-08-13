package com.tenco.bank.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.tenco.bank.handler.AuthInterceptor;

import lombok.RequiredArgsConstructor;

@Configuration // 1개 이상의 bean 을 등록 할 때 설정
@RequiredArgsConstructor
public class WebMvcConfig implements WebMvcConfigurer {

	private final AuthInterceptor AUTHINTERRCEPTOR;
	
	
	
	
	
	// 2가지 만 알자!
	// 우리가 만들어 놓은 AuthInterceptor 를 등록해야 함.
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(AUTHINTERRCEPTOR)
		.addPathPatterns("/account/**")
		.addPathPatterns("/auth/**");
			
		
	}

}
