package solo.practice;

public class Solo_3 {
	
	public void Exercise2() {
		
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
				// 11 + 20
		
		System.out.println(z);
		
	}

	public void Exercise3() {
		
		int score = 85;
		String result = (!(score>90))? "가" : "나";
		
		System.out.println(result);
		
	}
	
	public void Exercise4() {
		
		int pencils = 534;
		int students = 30;
		
		int pencilsPerStudent = (pencils / students);
		System.out.println(pencilsPerStudent);
		
		int pencilsLeft = (pencils % pencilsPerStudent);
		System.out.println(pencilsLeft);
		
	}
	
	public void Exercise5() {
		
		int value = 356;
		System.out.println(value / 100 * 100);
		
	}
	
	public void Exercise6() {
		
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = ((lengthBottom + lengthTop) * height / 2);
		System.out.println(area);
		
	}
	
	public void Exercise7() {
		
		int x = 10;
		int y = 5;
		
		System.out.println( (x > 7) && (y <= 5) );		// o && o
		System.out.println( ( x % 3 == 2) || (y % 2 != 1) );	// x || x
		
	}
	
	public void Exercise8() {
		
		/*
		 
		 	NAN값을 검사해서 올바른 결과가 출력될 수 있도록 NAN을 검사하는 코드를 작성.
		 
		 */
		
		double x = 5.0;
		double y = 0.0;
		
		double z = x % y;
		
		if(z != 0) {		// ?????
			System.out.println("0.0으로 나눌 수 없습니다.");
		} else {
			double result = z + 10;
			System.out.println("결과 : " + result);
		}
	
	}
	
	public static void main(String[] args) {

		Solo_3 solo = new Solo_3();
		solo.Exercise8();
		
	}

}
