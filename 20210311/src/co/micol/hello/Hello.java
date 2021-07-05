package co.micol.hello;

public class Hello {

	public static void main(String[] args) {
		
		System.out.println("Hello world");
		System.out.println("My name is Jaewoo Jang");
		
		int var1 = 10;
		int var3 = 3;
		double var2 = 15.5;
		
		int result = var1 + (int)var2;		// 강제 type 변환
		System.out.println(result);

		double resultValue = var1 + var2;	// 자동 형 변환
		System.out.println(resultValue);
		
		double resultDiv = var1 / var3;		// {정수/정수 = 정수 = 3} ~> 더블형으로 바꿔도 3.0이 된다.
		System.out.println(resultDiv);
		
		
		
	}

}
