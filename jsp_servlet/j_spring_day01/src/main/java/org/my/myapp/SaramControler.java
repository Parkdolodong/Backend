package org.my.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/saram")
public class SaramControler {
	
	@RequestMapping("/list")
	public String saram() {
		System.out.println("SaramController의 saram() 메소드 호출");
		
		return "saram/list"; // WEB-INF/views/saram/list.jsp를 보여준다.
	}
	
	@RequestMapping("/input")
	public String input() {
		System.out.println("Saramcontroller의 input() 메소드 호출");
		
		return "saram/input";
	}
}
