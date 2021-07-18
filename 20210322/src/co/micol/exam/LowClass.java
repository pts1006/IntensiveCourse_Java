package co.micol.exam;

public class LowClass extends SuperClass {

	public LowClass() {
	
		super();	// 부모클래스 모습으로 생성할 거다.
					// this()를 포함해서 모두 생성자 안에서만 쓸 수 있다.
		
	}
	
	public void methodTest() {	// 동일 메소드명으로 오버라이드됐음.
		System.out.println("나는 하위 class 메소드 입니다.");
		System.out.println("=========================");
		super.methodTest();	//부모클래스가 갖고 있는 메소드를 실행하고 싶다.(오버라이드 됐지만)
	}
	
	public void run() {
		super.method();
	}
	
}
