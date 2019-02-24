/*
공지게시판과 관련된 요청만 처리하는 하위 컨트롤러
*/
package notice.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import notice.model.Notice;

public class NoticeController {
	@RequestMapping("/notice/insert")
	public String insert(Notice notice){
		//dto 에 데이터가 자동으로 채워지는데 필요한 전제 조건!!
		//반드시 파라미터명과 DTO 클래스 내의 멤버변수명이 서로 같아야 한다!!
		System.out.println("작성자"+notice.getWriter());
		System.out.println("제목"+notice.getTitle());
		System.out.println("내용"+notice.getContent());
		
		System.out.println("글쓰기 요청을 받았네요");
		
		/*SpringMVC는 데이터베이스 연동까지 지원한다!!*/
		String sql="insert into member~~~~";
		return null;
	}
}






