package hardware.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class RadioController {
	
	@RequestMapping("/radio")
	public String execute() {
		System.out.println("���� ��û�� ó���Ҳ���");
		return "radio/result"; 
	}
}
