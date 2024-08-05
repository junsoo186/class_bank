package com.tenco.bank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tenco.bank.repository.model.User;

// Controller -> Stirng (뷰리졸버 동작--> JSP 파일 찾아서 렌더링 처리 한다.)
//RestController --> 데이터를 반환 처리
@RestController  // Controller + REST APL
public class TestController {
		
		@GetMapping("/test")
		public User test1() {
			int result = 10/0;
			return 	User.builder().username("길동").password("asd123").build();
		}
}
