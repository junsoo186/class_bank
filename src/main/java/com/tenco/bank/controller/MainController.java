package com.tenco.bank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller //Ioc 대상(싱글톤 패턴 관리가 된다.) --> 제어의 역전
// 제어의 권한이 개발자에게 있으면 라이브러리, 제어의 권한이  프레임워크
public class MainController {
	// REST API 기반으로 주소를 셜계 할 수 있다.
	
	// 주소 설계
	// http:localhost:8080/main-page
	@GetMapping({"/main-page", "/index"})
	public String mainPage() {
		System.out.println("mainPage() 호출 확인");
		// [JSP 파일 찾기 (yml 설정) ] - 뷰 리졸버 
		// prefix: /WEB-INF/view
		//         /main  
		// suffix: .jsp 
		return "/main";
	}
	
}
