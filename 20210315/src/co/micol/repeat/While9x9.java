package co.micol.repeat;

public class While9x9 {

	public static void main(String[] args) {
		// TODO while문으로 구구단 만들기.
		
		int i = 1;
		int j = 1;
		
		while(i < 10) {
			if(i != 1) System.out.println();
			while (j < 10) {
				System.out.println(i + " * " + j + " = " + ( i * j ));
				j++;
			}
			i++;
			j = 1;
		}

	}

}
