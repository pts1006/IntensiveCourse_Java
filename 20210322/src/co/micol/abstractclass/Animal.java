package co.micol.abstractclass;
				//추상클래스

public abstract class Animal {
		//내용물에 하나라도 abstract가 있으면 여기에도 똑같이 abstract 붙여 줘야 한다.
	
	public void run() {
		//내용을 정의하지 않아도 다른 놈들 묶어 주기 좋다.
		System.out.println("상위 객체가 취하는 행동.");
	}
	
	public abstract void eat() ;
	// 메소드 필드가 굳이 필요가 없어서 지움. 단, abstract적어주고 세미콜른 찍어 줘야 한다.
	
	public void sleep() {
		System.out.println("잔다.");
	}
}
