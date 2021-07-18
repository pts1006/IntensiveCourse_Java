package co.micol.car;

public class Car {

	private Tire frontLeftTire;
	private Tire frontRightTire;
	private Tire rearLeftTire;
	private Tire rearRightTire;
	
	public Car() {	// 생성 시 미리 각 Tire 멤버를 초기화 한다.
		frontLeftTire = new Tire("앞 왼쪽 타이어", 2);
		frontRightTire = new Tire("앞 오른쪽 타이어", 2);
		rearLeftTire = new Tire("뒤 왼쪽 타이어", 4);
		rearRightTire = new Tire("뒤 오른쪽 타이어", 4);
	}
	public void run() {
		frontLeftTire.toString();
		frontRightTire.toString();
		rearLeftTire.toString();
		rearRightTire.toString();
	}
}