package co.micol.standardExam;

public class Bird extends Animal implements Flyer {

	public Bird() {
		System.out.println("새");
	}
	
	public void run() {
		System.out.println("다리로 총총 뛰어다닌다.");
	}
	
	public void eat() {
		System.out.println("주로 벌레를 먹는다.");
	}
	
	public void color() {
		System.out.println("황색.");
	}

	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		System.out.println("날개를 펄럭인다.");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("날개로 날아다닌다.");
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("두 발로 착지한다.");
	}
	
	public void layEggs() {
		System.out.println("알을 낳는다.");
	}
	
}
