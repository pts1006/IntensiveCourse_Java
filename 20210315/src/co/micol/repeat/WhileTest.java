package co.micol.repeat;

public class WhileTest {

	public static void main(String[] args) {
		// TODO While Test
		int sum = 0;
		int i = 1;
		while(i <= 100) {
			sum = sum + 1;		//sum += 1;
			i ++;		// sum += i++;
		}

		System.out.println("누적 합 = " + sum);
		
	}

}
