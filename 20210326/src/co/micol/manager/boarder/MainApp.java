package co.micol.manager.boarder;


import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class MainApp {

	public static void main(String[] args) {
		// TODO 싱글톤 DAO 테스트

//		Connection conn = orcl.getConnection();

		Date tdate;
		tdate = Date.valueOf("2021-03-26");
		/*
		  날짜
			  이런 방법도 있다.
			  
			  java.util.Date today = new java.util.Date(); //현재 날짜와 시간
			  SimpleDateFormat st = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			  String now = st.format(today);
		  
		 */
		BoarderDao dao = new BoarderDao();
		List<BoarderVO> list = new ArrayList<BoarderVO>();	// '리스트'에 담을 그릇을 만든다.
		BoarderVO vo;
		
		list = dao.selectAll();
		for(BoarderVO vo1 : list) {
			vo1.toString();
		}
		
		System.out.println("==========================");
		vo = new BoarderVO();
		vo.setBoarderId(1);
		vo = dao.select(vo);
		vo.toString();
		
		System.out.println("==========================");
		vo = new BoarderVO();
		vo.setBoarderId(3);
		vo.setBoarderWriter("멍청이.");
		vo.setBoarderDate(tdate);
		vo.setBoarderContents(" ");
		vo.setBoarderTitle("처음은 아닌 게 아니다.");
		
		int n = dao.update(vo);
		
		if(n != 0) {
			System.out.println("입력했다.");
		} else {
			System.out.println("실패했다.");
		}
		
	}

}
