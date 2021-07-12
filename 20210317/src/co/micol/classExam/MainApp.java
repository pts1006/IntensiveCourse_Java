package co.micol.classExam;

import co.micol.calculator.Lotto;

public class MainApp {

	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		
		Calculator calculator = new Calculator();
		
		System.out.print("정수 한 개 값을 입력하세요. ");
		calculator.m = sc.nextInt();
		
		System.out.print("두 번째 정수를 입력하세요. ");
		calculator.n = sc.nextInt();
		
		int div = calculator.div();		//리턴벨류가 존재하면 같은 타입의 변수에 돌려받음
		System.out.println(div);

		sc.close();
		*/
		
		/*
		Menu menu = new Menu();
		menu.run();
		*/
		
		/*
		Scanner sc = new Scanner(System.in);
		
		Lotto lotto = new Lotto();
		
		System.out.println("금액을 입력하세요.");
		int money = sc.nextInt();
		
		int game = money / 1000;
		int line = 1; //라인 수
		
		for(int i = 0; i < game; i++) {
			lotto.run();
			if(line == 5) {
				line = 1;
			} else {
				line ++;
			}
			System.out.println();
			System.out.println("=================");
		}

		sc.close();
		*/
		
		/*
		Lotto lotto = new Lotto();
						// x는 입금 금액에 따른 횟수 변수
		for(int i = 0; i < 7; i++) {
			lotto.run();
			System.out.println("\n================");
		}
		*/
		
		Lotto lotto = new Lotto();
		lotto.start();
		
	}

}
