package co.micol.interfaceExtend;

public class MainApp {

	public static void main(String[] args) {
		
		InterfaceB impl = new ImplementC();
		((ImplementC)impl).methodA();
		impl.methodB();
		((ImplementC)impl).methodC();
		
	}

}
