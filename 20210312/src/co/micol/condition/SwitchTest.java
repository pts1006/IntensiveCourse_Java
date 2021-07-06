package co.micol.condition;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO switch ~ case
		int kor = 100;
		String grade;

		switch (kor) {
			case 100:
				grade = "A";
				break;
			case 90:
				grade = "B";
				break;
			case 80:
				grade = "C";
				break;
			case 70:
				grade = "D";
				break;
	
			default:
				grade = "F";
				break;
		}
		
		System.out.println(grade);
		
		System.out.println(100 % 10);
		
		
		
	}

}
