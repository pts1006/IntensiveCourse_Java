package co.micol.classExam;

public class Car {

	public String model;
	public int price;
	private String name;
	
	public Car() {	//생성자 (클래스 이름과 같은 애를 이렇게 부른다.) , 모든 클래스는 생성자를 갖고 있다.(평소 안 보일 뿐)
		
		//아무것도 안 써 있으면 디폴트 생성자. 생략 가능.
		
	}
	
	public void run() {	// 퍼블릭을 빼 놓으면 다른 패키지에서는 쓸 수 없다.
		name = "현대자동차";
		System.out.println(name + "가 움직인다.");
	}
	
	protected void stop() {	// 프로텍티드도 마찬가지.
		name = "현대자동차";
		System.out.println(name + "가 멈춘다.");
	}
	
}
