package co.micol.manager.member;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.micol.manager.common.DAO;
import co.micol.manager.common.DaoInterface;

public class MemberDao extends DAO implements DaoInterface<MemberVO> {

	private PreparedStatement psmt; // 명령 실행
	private ResultSet rs; // select()에서 결과 값을 담는 것

	// sql 구문 작성
	private final static String SELECT_ALL = "SELECT * FROM MEMBER"; // 상수화
//	private final static String SELECT = "SELECT * FROM MEMBER WHERE ID = ?";	밑에 select 과제 수행하려고 임의로 주석처리.
	private final static String INSERT = "INSERT INTO MEMBER VALUES(?,?,?,?)";	// 이 경우 값을 네 개 담아야 하니까 물음표 네 개.

	public MemberDao() { // 없어도 된다.
		super(); // 상위 클래스에 있는 나를 가지고 생성해 달라.
	}

	@Override
	public List<MemberVO> selectAll() {
		// 전체 리스트 가져오기
		List<MemberVO> list = new ArrayList<MemberVO>();
		MemberVO vo;	// 한 개의 레코드를 담을 수 있는 변수 vo
		try {
			psmt = conn.prepareStatement(SELECT_ALL);
			rs = psmt.executeQuery(); // executeQuery()는 select구문에서만 쓴다.
			while (rs.next()) {	//다음 rs 불러와라. 근데 언제 끝날지는 모르겠다. 어쨌든 다 들고 와라. 다음이 없을 때까지.
				vo = new MemberVO();
				vo.setId(rs.getString("id"));	//rs에서 얻은 String을 vo의 Id에 담아서 가져와라.
				vo.setPassword(rs.getString("password"));
				vo.setName(rs.getString("name"));
				vo.setTel(rs.getString("tel"));
				list.add(vo);	//list에 vo를 계속 더해 나간다. 언제까지? rs 다음 값이 없을 때까지.
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return list;	//반환하는 값이 list니까 마지막에는, while문을 통해 추가된 애들이 담긴다.
	}

	private void close() {
		try {
			if (rs != null) rs.close();
			if (psmt != null) psmt.close();
//			if (conn != null) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public MemberVO select(MemberVO vo) {
		// 한 개의 record select
		String SELECT = "SELECT * FROM MEMBER WHERE ID = ?";
		
		try {
			psmt = conn.prepareStatement(SELECT);
			psmt.setString(1, vo.getId());
			rs = psmt.executeQuery();
			if(rs.next()) {
				vo.setPassword(rs.getString("password"));
				vo.setName(rs.getString("name"));
				vo.setTel(rs.getString("tel"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return vo;
	}

	@Override
	public int insert(MemberVO vo) {
		// 데이터 삽입
		int n = 0;	// 몇 행이 삽입됐는지 표시하기 위함. (카운트 용임)
		try {
			psmt = conn.prepareStatement(INSERT);
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPassword());
			psmt.setString(3, vo.getName());
			psmt.setString(4, vo.getTel());
			n = psmt.executeUpdate();	//insert, delete, update에 사용된다.
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return n;
	}

	@Override
	public int delete(MemberVO vo) {
		// 데이터 삭제
		int n = 0;
		String DELETE = "DELETE FROM MEMBER WHERE ID = ?";
		try {
			psmt = conn.prepareStatement(DELETE);
			psmt.setString(1,  vo.getId());
			n = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return n;
	}

	@Override
	public int update(MemberVO vo) {
		// 데이터 갱신
		int n = 0;
		String UPDATE = "UPDATE MEMBER SET NAME = ?, PASSWORD = ?, TEL = ? WHERE ID = ?";
		try {
			psmt = conn.prepareStatement(UPDATE);
			psmt.setString(1, vo.getName());
			psmt.setString(2, vo.getPassword());
			psmt.setString(3, vo.getTel());
			psmt.setString(4, vo.getId());
			
			n = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return n;
	}

}