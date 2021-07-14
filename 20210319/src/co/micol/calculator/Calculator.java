package co.micol.calculator;

public class Calculator {

	//사칙연산을 수행하는 계산기.
	
	public int sum() {	//이 메소드를 호출하면 무조건 정수 20이 들어간다.
		return 20;
	}
	
	public int sum(int m) {	//이 메소드는 정수 한 개를 입력하면 전달된 값에 +10을 하게 된다.
		return m + 10;
	}		// 메소드 오버로딩 : 동일한 함수 명으로 전달 인자를 달리하거나 타입을 달리해서 같은 이름으로 쓰는 것.
			// 다형성.
	
	public int sum(int m, int n) {
		int result = m + n;
		return result;
	}
	
	public float sum(float f, float g) {
		return f + g;
	}
	
	public void sum(int m, int n, int k) {	//정수 세 개를 전달하면 합을 계산해서 출력해 준다.
		System.out.println(m + n + k);
	}
	
}
