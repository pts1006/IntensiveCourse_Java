package co.micol.exam;

public class MainApp {

	public static void main(String[] args) {
		
		LowClass low = new LowClass();
		low.method();	//부모만 가지고 있는 것.
		low.methodTest();	// 부모도 나도 갖고 있는 것. (내 거로 오버라이드)
		low.run();	// 내 거.
		
	}

}
