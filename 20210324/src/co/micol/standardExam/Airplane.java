package co.micol.standardExam;

public class Airplane implements Flyer {

	public Airplane() {
		System.out.println("비행기");
	}

	@Override
	public void takeOff() {
		System.out.println("모터음, 이륙");
	}

	@Override
	public void fly() {
		System.out.println("기계적으로 난다");
	}

	@Override
	public void land() {
		System.out.println("기계로 착륙");
	}
	
	
	
}
