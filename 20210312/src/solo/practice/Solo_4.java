package solo.practice;

import java.util.Scanner;

public class Solo_4 {
		// p.134
	public void exercise03() {
		
		int result = 0;
		
		for(int i = 1; i < 101; i++ ) {
			if(i % 3 == 0) {
				result = result + i;
			}	
		}
		
		System.out.println("3의 배수의 합 : " + result);
	}
	
	/*
	  이렇게 i = 3부터 시작해서 3씩 증가 시켜도 가능 
	int sum = 0;
	for(int i = 3; i <= 100; i+=3) {
		sum = sum + i;
	}
	
	System.out.println("누적 합 = " + sum);
	*/
	public void exercise04() {
		
		int x = 0;
		int y = 0;
		
		while(x != 7) {
		x = (int) (Math.random() * 6) + 1;
		y = (int) (Math.random() * 6) + 1;
		
		System.out.println("(" + x + ", " + y + ")");
		
			if(x + y == 5) {
			break;
			}
		
		}
				
	}
	
	public void exercise05() {
		
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 8; j++ ) {
				if((4*i) + (5*j) == 60) {
					System.out.println("(" + i + ", " + j + ")");
				}
			}
		}
		
	}
	
	public void exercise06() {
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	

	public void exercise07() {
		
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------------");
			System.out.println("1. 예금 || 2. 출금 || 3. 잔고 || 4. 종료");
			System.out.println("-----------------------------------");
			System.out.print("선택> ");
			balance = scanner.nextInt();
			
			switch(balance) {
				case 1 :
					System.out.print("예금액> ");
					balance = scanner.nextInt();
					continue;
				case 2 :
					System.out.print("출금액> ");
					balance = scanner.nextInt();
					continue;
				case 3 :
					System.out.print("잔고> ");
					balance = scanner.nextInt();
					continue;
				default :
					run = false;
			}
			
			System.out.println(); // 개행용
			System.out.print("프로그램 종료");
			scanner.close();
		}
		
	}
	
	public static void main(String[] args) {

		Solo_4 exe = new Solo_4();
		exe.exercise07();
		
	}

}
