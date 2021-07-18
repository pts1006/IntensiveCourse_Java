package co.micol.car;

public class Tire {

	private String location;
	private int wheelCount;
	
	public Tire(String location, int wheelCount) {
		this.location = location;
		this.wheelCount = wheelCount;
	}
	
	public String toString() {	//Object 객체가 갖고 있는 메소드를 오버라이드 해서 사용함.
		
		System.out.println(location + " " + wheelCount);
		return null;
		
	}
	
}
