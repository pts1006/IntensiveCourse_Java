package co.micol.example.collection;

import java.util.Date;

// DB라고 간주하자.
public class MemberData {	//DB를 서치해서 가져온다고 가정하자.
	
	private MemberVO[] vo = new MemberVO[10];
	
	public MemberVO[] dataSet () { // 여기서 쓰이는 것들은 배열 객체가 된다.
		
		Date d = new Date();
		vo[0] = new MemberVO("001", "pw", 10000, d);
		vo[1] = new MemberVO("002", "pw", 10000, d);
		vo[2] = new MemberVO("003", "pw", 10000, d);
		vo[3] = new MemberVO("004", "pw", 10000, d);
		vo[4] = new MemberVO("005", "pw", 10000, d);
		vo[5] = new MemberVO("006", "pw", 10000, d);
		vo[6] = new MemberVO("007", "pw", 10000, d);
		vo[7] = new MemberVO("008", "pw", 10000, d);
		vo[8] = new MemberVO("009", "pw", 10000, d);
		vo[9] = new MemberVO("010", "pw", 10000, d);
		
		return vo;
		
	}
	
}
