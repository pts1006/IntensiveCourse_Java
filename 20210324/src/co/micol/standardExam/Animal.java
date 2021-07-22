package co.micol.standardExam;
				//추상클래스

public class Animal {
	
	public Animal() {
		System.out.println("짐승");
	}
	
	public void run() {
		System.out.println("상위 객체가 취하는 행동.");
	}
	
	public void eat() {
		System.out.println("먹는다");
	}
	public void sleep() {
		System.out.println("잔다.");
	}

}
