package co.micol.repeat;

public class DoWhileTest {

	public static void main(String[] args) {
		// TODO do while test
		int sum = 0;
		int i = 1;
		do {
			sum = sum + i;
			i++;
			if(i > 10) break;		// break 연습용
			else continue;		// continue 연습용
		} while(true);
		
		System.out.println("누적 합 : " + sum);

	}

}
