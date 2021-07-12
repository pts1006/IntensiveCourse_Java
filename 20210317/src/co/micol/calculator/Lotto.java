package co.micol.calculator;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {

	private int[] num = new int[6];
	private int money;
	private int payment;
	private int Count;
	private int change;
	
	private void random() {
		
		Random rand = new Random();
		for(int i = 0; i < 6; i++) {
			num[i] = rand.nextInt(45) + 1;
			// 중복된 수인지 아닌지 판단 해야 한다.
			if(i != 0) {
				for(int j = 0; j < i; j++) {
					if(num[i] == num[j]) i--;	//중복제거
				}
			}
		}
	}
	
	public void run() {
		
		random();
		Arrays.sort(num);	// 오름차순 정열.
		
		for(int n : num) {
			System.out.print(n + " ");
		}
		
	}
	
	public void start() {
		
		Scanner sc = new Scanner(System.in);
		
		int Loop = 0;
		
		System.out.print("요금 지정 : ");
		money = sc.nextInt();
		
		while(Loop == 0) {
			
			System.out.print("돈 줘 : ");
			payment = sc.nextInt();
			
			if(money > payment) System.out.println("\n돈 부족\n");
			else Loop = 1;
			
		}
	
		if(money < payment) {
			System.out.print("몇 판 할래? : ");
			Count = sc.nextInt();
			
			change = payment - (money * Count);
			
			System.out.println("\nGame Start\n");
			
			for(int i = 1; i <= Count ; i++) {
				System.out.print(i + "회차 : ");
				run();
				System.out.println("\n=======================");
		} 
			System.out.println("\n잔돈 : " + change + "원");
		} else {
			run();
		}
		 
		
		sc.close();
		
	}
	
}
