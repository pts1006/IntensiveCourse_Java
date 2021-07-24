package co.micol.example.collection;

import java.util.ArrayList;
import java.util.List;

public class SampleMember {	// 여기는 멤버 수 한정하지 않고, 하나하나 심어 넣는다.

	public List<MemberVO> members(){
		
		MemberVO[] vo;
		List<MemberVO> list = new ArrayList<MemberVO>();
		MemberData dao = new MemberData();
		vo = dao.dataSet();
		
		for(MemberVO mem : vo) {
			System.out.print(mem.getId() + " ");	// for문 썼을 경우 { vo[i].getID(); } 이런 식으로 가져와야 한다.
			System.out.print(mem.getPassword() + " ");
			System.out.print(mem.getMoney() + " ");
			System.out.println(mem.getEdate());
			
			list.add(mem);
			// 위의 데이터들을 list에 담아라.	(데이터 추가하기 ~> 단순 배열에선 이런 거 안 되지)
			
		}
		
		return list;
		
	}
	
/*	위와 유사한 생성법. : 여기는 20명으로 한정.
	public MemberVO[] memberArray() {
		vo = new MemberVO[20];
		
		return vo;
	}
*/	
}
