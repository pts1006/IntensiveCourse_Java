package co.micol.calculator;

public class Calculator {

	public int m;
	public int n;
	
	public int sum() {
		return m+n;		// 리턴 타입이 void가 아니면 반드시 return구문이 들어가야 한다.
	}
	
	public int sub() {
		return m-n;
	}
	
	public int mul() {
		return m*n;
	}
	
	public int div() {
		return m/n;
	}
}
