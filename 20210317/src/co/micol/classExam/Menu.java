package co.micol.classExam;

import java.util.Scanner;

public class Menu {		//캡슐화 된 클래스

	private Scanner sc;
	private Car car;
	private ForTest forTest;
	
	public void run() {
		
		car = new Car();
		forTest = new ForTest();
		sc = new Scanner(System.in);
		
		int choice;
		
		do {
			menuTitle();
			System.out.print("원하는 작업 번호를 선택하세요.");
			choice = sc.nextInt();
			switch (choice) {
				case 1:
					car.run();
					break;
				case 2:
					forTest.forPrint();
					break;
				case 3:
					System.out.println("\n종료");	
					sc.close();
					break;
				}
		} while(choice != 3);
		
		System.out.println();
	}
	
	private void menuTitle() {
		System.out.println("1. Car");
		System.out.println("2. forTest");
		System.out.println("3. 종  료");
		System.out.println("================");
		
		
	}
	
}
