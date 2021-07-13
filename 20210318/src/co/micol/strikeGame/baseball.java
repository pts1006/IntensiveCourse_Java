package co.micol.strikeGame;

import java.util.Random;
import java.util.Scanner;

public class baseball {

	private Random random;
	private int number[] = new int [3];
	private String dout;
	private boolean Boolean;
	
	public void Game() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("의심하는 번호 : ");
		dout = sc.nextLine();
		
		Boolean = true;
		
		while(Boolean == true) {
			for(int i = 0; i < 2; i++) {
				number[i] = random.nextInt(10) + 1;	// 왜 실행 안 됨.
				if(number[i] == dout.charAt(i)) {
					System.out.println("Strike");
					Boolean = false;
				} else {
					continue;
			}
		}
		sc.close();
	}
		
		/*
		
		  실행 잘 안 됨 ~> 얼추 수정 ~> number[i] 에 인트 값을 넣을 수 없음.
		  그 외 문제.
		  문제점 1. 중복을 고려하지 않았다.
		  문제점 2. all or not 밖에 없다.
		  문제점 3. 무한루프 안 됨.
		  문제점 4. 사용자랑 티키타카 하는 기능 x.
		  문제점 5. 실행됐다 하더라도 for문도 다시 반복돼서 랜덤값이 변하게 됨.
		  			(if문이랑 분리 필요?)~> 그럼 number[i]에서 오류 나던데?
		  
		*/
		
	}
	
}
