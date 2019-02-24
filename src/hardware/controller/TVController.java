package hardware.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class TVController {
	
	@RequestMapping("/tv")
	public String execute() {
		System.out.println("TV 요청을 처리할께요");
		//tv 수리에 대한 결과 보여주기!!
		return "tv/result"; 
	}
}





