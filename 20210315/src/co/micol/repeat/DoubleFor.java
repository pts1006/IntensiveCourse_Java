package co.micol.repeat;

public class DoubleFor {

	public static void main(String[] args) {
		// TODO double for test
		// 구구단
		for(int i = 1; i < 10; i++) {
			if(i != 1)
			System.out.println(); // 개행용
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j) );
			}
		}

	}

}
