package co.micol.manager.boarder;

import java.util.List;

public interface Service {

	public List<BoarderVO> selectAll();	// 전체 가져오기
	public BoarderVO select(BoarderVO vo);	//하나의 레코드 가져오기
	public int insert(BoarderVO vo);	//삽입하는거
	public int delete(BoarderVO vo);	//삭제하는거	
	public int update(BoarderVO vo);	//갱신하는거
	
}
