package co.micol.manager.main;

import java.util.ArrayList;
import java.util.List;

import co.micol.manager.member.MemberDao;
import co.micol.manager.member.MemberVO;

public class MainApp {

	public static void main(String[] args) {
		
		MemberDao dao = new MemberDao();
		List<MemberVO> list = new ArrayList<MemberVO>();	//전체 리스트 받기용 그릇
		MemberVO vo;
		
		list = dao.selectAll();	// 전체 리스트를 가져오는 구문 실행
		
		for(MemberVO vo1 : list) {
			vo1.toString();
		}
		
		System.out.println("==========================");

		
		// 값 집어 넣기.
		vo = new MemberVO();
		vo.setId("kim");
		vo.setPassword("1234");
		vo.setName("김치국");
		vo.setTel("010-3333-3333");
		
		int n = dao.update(vo);	// 실행하기 update든 insert든
		
		if(n != 0) {
			System.out.println("정상적으로 입력되었다.");
		} else {
			System.out.println("입력이 실패했다.");
		}
/*		
		위의 식(insert일 때)은 한 번 실행했으면 그 다음부터는 주석 처리 해야한다. 혹은 값을 바꾸든가.
		
		왜 why
		
		primary key는 유일한데 run as 할때마다 이 문구가 실행되면 유일하지 않게 되니까 오류가 뜨는 거임.
*/		
		System.out.println("==========================");
		vo = new MemberVO();	// 일단 초기화하자. 위에서 한번 썼으니까.
		vo.setId("왜 안 뜨냐고");
		vo = dao.select(vo);	//한 놈만
		if(vo.getName() != null) {
			vo.toString();
		} else {
			System.out.println("존재X");
		}
		
		System.out.println("==========================");
		vo = new MemberVO();	// 일단 초기화하자.
		vo.setId("park");
		int n2 = dao.delete(vo);
		if(n2 != 0) {
			System.out.println("삭제");
		} else {
			System.out.println("삭제X");
		}
		
		
	}

}
