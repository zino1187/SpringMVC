/*
�����Խ��ǰ� ���õ� ��û�� ó���ϴ� ���� ��Ʈ�ѷ�
*/
package notice.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import notice.model.Notice;

public class NoticeController {
	@RequestMapping("/notice/insert")
	public String insert(Notice notice){
		//dto �� �����Ͱ� �ڵ����� ä�����µ� �ʿ��� ���� ����!!
		//�ݵ�� �Ķ���͸�� DTO Ŭ���� ���� ����������� ���� ���ƾ� �Ѵ�!!
		System.out.println("�ۼ���"+notice.getWriter());
		System.out.println("����"+notice.getTitle());
		System.out.println("����"+notice.getContent());
		
		System.out.println("�۾��� ��û�� �޾ҳ׿�");
		
		/*SpringMVC�� �����ͺ��̽� �������� �����Ѵ�!!*/
		String sql="insert into member~~~~";
		return null;
	}
}






