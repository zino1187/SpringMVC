/*
 * �� Ŭ������ ������ �ۼ��ϱ� ������ �ƴ϶�, �� Ŭ�����κ��� �����Ǵ�
 * �ν��Ͻ� 1����, 1���� ���ڵ带 ��������̴�!! 
 * �Ǵ� Ŭ���̾�Ʈ�� �������� ������ �Ķ���͵��� ��� ���� �뵵�� 
 * ����� ������... ������ Ŭ������ �ƴ϶� ���� �����͸��� ������� �뵵��
 * ��ü�� ������ ��Ʈ������ ����о߿����� VO (Value Object), 
 * DTO(Data Transfer Object :������ ���޿� ��ü )
 * */
package notice.model;

public class Notice {
	//�����ʹ� �����ϱ� ������ ���ȵǾ�� �Ѵ�. ���� private ���� ������������
	//�ܺ��� � ��ü�� �� �ν��Ͻ��� �����͸� ��ų�, �������� �Ϸ���, 
	//����� ���������� �������� �ϰ�, �̷� ��ü ���� ����� ������ ����ȭ
	//ĸ��ȭ 
	private int notice_id;
	private String writer;
	private String title;
	private String content;
	private String regdate;
	private int hit;
	
	public int getNotice_id() {
		return notice_id;
	}
	public void setNotice_id(int notice_id) {
		this.notice_id = notice_id;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	
	
	
}








