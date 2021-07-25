package co.micol.manager.common;

import java.util.List;

public interface DaoInterface<T> {	// 개별 DAO를 만들 때 항상 포함시킬 거다.

	public List<T> selectAll();	//Table의 전체 data select
	public T select(T vo);	// 한 개의 record select
	public int insert(T vo);	// 데이터 삽입
	public int delete(T vo);	// 데이터 삭제
	public int update(T vo);	// 데이터 갱신
		// DAO 가장 기본적인 다섯 가지
	
	
}
