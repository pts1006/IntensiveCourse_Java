package co.micol.condition;

public class Iftest {

	public static void main(String[] args) {
		
		
		int num = 110;
		
		if(num > 100) {
			System.out.println("100보다 크다.");
		} else {
			System.out.println(num + "보다 크지 않다.");
		}
		
		String A = (num > 100) ? "yes" : "no";
		System.out.println(A);
	
		System.out.println((num > 100)? true : false);
		
	}

}

