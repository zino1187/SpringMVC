package hardware.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class SmartPhoneController {

	@RequestMapping("/smartphone")
	public String execute() {
		System.out.println("스마트폰 요청을 처리할께요");
		return "tv/smart"; 
	}

	
}
