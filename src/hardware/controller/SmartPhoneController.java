package hardware.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class SmartPhoneController {

	@RequestMapping("/smartphone")
	public String execute() {
		System.out.println("����Ʈ�� ��û�� ó���Ҳ���");
		return "tv/smart"; 
	}

	
}
