package co.micol.example.collection;

import java.util.Date;

public class MemberVO {		// VO or DTO or Bean
	private String id, password;
	private int money;
	private Date edate;
	
	public MemberVO(String id, String pw, int m, Date d) {	// Data Set 구축을 위해 '구태여' 생성자를 사용함.
		this.id = id;
		this.password = pw;
		this.money = m;
		this.edate = d;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public Date getEdate() {
		return edate;
	}
	public void setEdate(Date edate) {
		this.edate = edate;
	}
	
	
}
