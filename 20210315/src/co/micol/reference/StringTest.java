package co.micol.reference;

public class StringTest {

	public static void main(String[] args) {
		// TODO String Object test 
		String name = "홍길동";
		String str = new String("index.jsp");
		// new 키워드는 메모리를 새로 할당해 주는 키워드로, String에서는 잘 쓰지 않는다. 커지잖아.
		
		
		if(name.equals(str)) {		// name == str 와 같다. 같은데, 객체에서 이런 표현은 잘 안 쓴다.
			System.out.println("두 값은 같다.");
		} else {
			System.out.println("두 값은 다르다.");
		}
		
		System.out.println(name.charAt(0));
		System.out.println(str.charAt(0));
		// 0부터 시작. (0, 1, 2 ....)
		
		if(str.endsWith(".jsp")) {	// 파일 확장자명이 ~~를 포함하고 있다면, 그놈을 출력해 주라.
			System.out.println(str);
		}
		
		System.out.println(str.concat("행복"));	//concat == x. 에 해당 글자 연결해 달라.
		
	}

}
