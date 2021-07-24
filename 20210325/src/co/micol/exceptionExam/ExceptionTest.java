package co.micol.exceptionExam;

public class ExceptionTest {
	private String driver = "co.Naver";
	
	public ExceptionTest() {
		try {
			Class.forName(driver);
//			정상 작동시 출력할 문구
		} catch (ClassNotFoundException e) {
			// 그냥 Exception e 해도 됨. (최상위)
//			e.printStackTrace(); 어떤 예외가 나오는지 보여 달라는 문구. 실행 안 돼서 시스아웃 넣음.
//			개발 과정에서는 이 문구를 쓰지만, 사용자한테는 밑의 시스아웃을 보여 줌. <오류가 났으니 관리자한테 문의하라> 라고.
			System.out.println("라이브러리 및 발견하지 못함");
		} finally {	// finally 구문은 굳이 쓰지 않아도 괜찮음.
			System.out.println("무조건 수행하는 문");
		}
	}
/*	
	public void ExceptionTest() throws ClassNotFoundException {
		Class.forName(driver);
	} 위의 try - catch문은 해당 글과 같음. 대신, 사용하는 곳(메인)에서 try - catch를 써 줘야 함.
			throws ~>>> 던진다 ~>>> 위임한다 ~>>> 책임 전가 느낌.
*/
}
/*
	정리
		예외처리 방법
			try - catch
			throws
		두 가지 방법이 있다. 아무 거나 쓰면 된다.
*/