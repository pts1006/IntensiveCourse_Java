package co.micol.manager.boarder;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoarderDao implements Service {
	
	private SingletonDao orcl = SingletonDao.getInstance();
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	
	@Override
	public List<BoarderVO> selectAll() {
		
		BoarderVO vo;
		List<BoarderVO> list = new ArrayList<BoarderVO>();
		String SQL = "SELECT * FROM BOARDER";
		try {
			conn = orcl.getConnection();
			psmt = conn.prepareStatement(SQL);
			rs = psmt.executeQuery();
			while(rs.next()) {
				vo = new BoarderVO();
				vo.setBoarderId(rs.getInt("boarderId"));
				vo.setBoarderWriter(rs.getString("boarderWriter"));
				vo.setBoarderDate(rs.getDate("boarderDate"));
				vo.setBoarderTitle(rs.getString("boarderTitle"));
//				vo.setBoarderContents(rs.getString("boarderContents"));
				vo.setBoarderHit(rs.getInt("boarderHit"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return list;
	}

	@Override
	public BoarderVO select(BoarderVO vo) {
		// 한 놈 찾기
		String SELECT = "SELECT * FROM Boarder WHERE BOARDERID = ?";
		
		try {
			conn = orcl.getConnection();
			psmt = conn.prepareStatement(SELECT);
			psmt.setInt(1, vo.getBoarderId());
			rs = psmt.executeQuery();
			if(rs.next()) {
				vo.setBoarderWriter(rs.getString("boarderWriter"));
				vo.setBoarderDate(rs.getDate("boarderDate"));
				vo.setBoarderTitle(rs.getString("boarderTitle"));
				vo.setBoarderContents(rs.getString("boarderContents"));
				vo.setBoarderHit(rs.getInt("boarderHit"));
				
				boarderHitCount(vo.getBoarderId());	// 조회수 증가 메소드
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return vo;
	}

	private void boarderHitCount(int boarderId) {
		// select 할 때마다 조회수(hit)증가
		String SQL = "UPDATE BOARDER SET BOARDERHIT = BOARDERHIT + 1 WHERE BOARDERID = ?";
		try {
			psmt = conn.prepareStatement(SQL);
			psmt.setInt(1,  boarderId);
			psmt.executeUpdate();
			//실행만 하도록 한다.
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public int insert(BoarderVO vo) {
		// 기입하기
		
		String INSERT = "INSERT INTO BOARDER VALUES(?,?,?,?,?,?)";
		
		int n = 0;
		
		try {
			conn = orcl.getConnection();
			psmt = conn.prepareStatement(INSERT);
			psmt.setInt(1,  vo.getBoarderId());
			psmt.setString(2, vo.getBoarderWriter());
			psmt.setDate(3, vo.getBoarderDate());
			psmt.setString(4, vo.getBoarderTitle());
			psmt.setString(5, vo.getBoarderContents());
			psmt.setInt(6, vo.getBoarderHit());
			n = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return n;
	}

	@Override
	public int delete(BoarderVO vo) {
		// 삭제하기

		int n = 0;
		String DELETE = "DELETE FROM BOARDER WHERE BOARDERID = ?";
		try {
			conn = orcl.getConnection();
			psmt = conn.prepareStatement(DELETE);
			psmt.setInt(1,  vo.getBoarderId());
			n = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return n;
	}

	@Override
	public int update(BoarderVO vo) {
		// 갱신하기
		
		int n = 0;
		String UPDATE = "UPDATE BOARDER SET BOARDERWRITER = ?, BOARDERDATE = ?, BOARDERTITLE = ?, BOARDERCONTENTS = ?, BOARDERHIT = ? WHERE BOARDERID = ?";
		
		try {
			conn = orcl.getConnection();
			psmt = conn.prepareStatement(UPDATE);
			psmt.setString(1, vo.getBoarderWriter());
			psmt.setDate(2, vo.getBoarderDate());
			psmt.setString(3, vo.getBoarderTitle());
			psmt.setString(4, vo.getBoarderContents());
			psmt.setInt(5, vo.getBoarderHit());
			psmt.setInt(6, vo.getBoarderId());
			
			n = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return n;
	}

	private void close() {
		try {
			conn = orcl.getConnection();
			if(rs != null) rs.close();
			if(psmt != null) psmt.close();
			if(conn != null) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
