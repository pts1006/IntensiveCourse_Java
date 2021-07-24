package co.micol.exceptionExam;

public class MainApp {

	public static void main(String[] args) {
/*	예외 & API 수업 이것저것 실습.
		ExceptionTest ex = new ExceptionTest();
		System.out.println(ex.hashCode());	// API 객체 해시코드 실습
		
		System.out.println();
		
		ExceptionTest ex1 = new ExceptionTest();
		System.out.println(ex1.hashCode());	// 하나 더 만듦.
		
		
		System.out.println("\nex와 ex1이 같으냐");
		boolean result = ex.equals(ex1);	// 객체 비교.
		System.out.println(result);


//		================================================
		System.out.println("\n현재 시각 읽기");
		long time = System.currentTimeMillis();	//밀리세컨드 단위
		System.out.println(time);
		
		long times = System.nanoTime();	// 나노세컨드 단위
		System.out.println(times);
		
//		================================================		
		System.out.println("\n시스템 프로퍼티 읽기");
		String value = System.getProperty("user.name");
		System.out.println(value);	// 위 두 줄과
		System.out.println(System.getProperty("user.name"));	// 이 한 줄은 같음.
		
		System.out.println(System.getProperty("java.home"));

//		================================================
		System.out.println("\n환경 변수 읽기");
		System.out.println(System.getenv("JAVA_HOME"));

//		================================================
		System.out.println("\nString 메소드");
		String str = "abcdefGhijk";
		String strk = "행복한 일상생활";	// 이거 활용해서 밑에 거 실행해 보며 비교.
		
		char chr = strk.charAt(4);	// 원하는 문자의 위치를 가져온다.
		System.out.println(chr);
		
		byte[] strb = str.getBytes();	// str을 바이트 배열로 변환한다.
		System.out.println(strb);	//배열 명은 주소라서 이렇게 하면 원하는 값을 출력해 낼 수 없다.
		
		for(byte s : strb) System.out.print(s + " ");	// 이렇게 반복문을 해야 나온다.
		
//		================================================
		System.out.println("\n\n문자열 변환");
		int num = 1;
		int sum = 10;
		System.out.println(num + sum);
		
		String nstr = String.valueOf(num);	//숫자 1이 문자열 1이 됨.
		String str2 = String.valueOf(sum);	//슛자 10이 문자열 10이 됨.
		System.out.println(nstr + str2);	// 문자열 1과 문자열 10이 결합돼서 문자열 110이 됨.( 1과 10이 연결된 상태 )
		
		System.out.println("\nString을 int로 변환");
		int n = Integer.valueOf(nstr);
		int m = Integer.valueOf(str2);
		System.out.println(n + m);
		
		System.out.println("\nsplit으로 문자열 자르기");
		String text = "박길자&홍길순&김기자,이승리,최고다_김삼식";
		String[] name = text.split("&|,|_");	// |를 이용해서 짜르고 &와 ,와 _를 하나씩 다 자름.
		for(String na : name) System.out.println(na);
		
		
		System.out.println(text.concat("김순식"));	// .concat() : 기존 문자열에 추가.
*/		
		
	}

}
