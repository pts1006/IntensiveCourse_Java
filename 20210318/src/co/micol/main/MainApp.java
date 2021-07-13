package co.micol.main;

import java.util.Scanner;

import co.micol.lotto.Lotto;

public class MainApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Lotto lotto;	// 인스턴스를 선언한다. 선언만 했다. 초기화 안 했다. 게임 횟수 안 정했으니까.
		
		System.out.println("금액을 입력하세요. : ");
		int money = sc.nextInt();
		
		lotto = new Lotto(money/1000);	// 생성할 때 생성자 모습으로 초기화해야 한다.
		lotto.run();
		
		sc.close();
		
	}

}
