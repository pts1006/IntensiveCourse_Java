package co.micol.example.collection;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainApp {

	public static void main(String[] args) {
		//생성자를 통해.
		SampleMember sm = new SampleMember();
		List<MemberVO> list = new ArrayList<MemberVO>();	//리스트 만들고 리스트를 출력할 거니까 여기도 리스트를 만들어야지. (그릇 생성)
		list = sm.members();
		
		System.out.println("=====================");
		@SuppressWarnings("unused")
		Date now = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd : hh:mm:ss");
		
		//리스트에서 직접 출력
		for(MemberVO member : list) {
			System.out.print(member.getId() + " ");
			System.out.print(member.getPassword() + " ");
			System.out.print(member.getMoney() + " ");
			System.out.println(df.format(member.getEdate()));
		}
		
	}

}
