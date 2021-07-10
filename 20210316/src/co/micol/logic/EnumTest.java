package co.micol.logic;

public class EnumTest {
				//열거 타입 변수 테스트
	public enum Week { //enum type define
		
		Mon, Tue, Wde, Thu, Fri, Sat, Sun
		
	}

	public static void main(String[] args) {
		// TODO Enum Test
		Week toDay = null;	//stack memory에만 변수를 할당. 열거 타입은 null로 생성할 수 있다. new 필요x
		toDay = Week.Tue;
		System.out.println(toDay);

	}

}
