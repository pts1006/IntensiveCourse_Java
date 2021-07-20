package co.micol.calc.MyCalcurator;

import java.util.Scanner;

public class MyCalcurator {

	Scanner sc = new Scanner(System.in);
	
	String op;// 이전 연산자
	int result = 0;// 계산 결과값
	int number = 0;// 입력된 피연산자(숫자)
	
	// 연산자 버튼
	public void pressOperator(String op) {
		System.out.print(op);
		if(this.op != null) {
			if(this.op.equals("+")) {
				result = result + number;
			} else if (this.op.equals("-")) {
				result = result - number;
			} else if (this.op.equals("*")) {
				result = result * number;
			} else if (this.op.equals("/")) {
				result = result / number;
			}
		}
		
		this.op = op;
		result = number;
		
	}

	//숫자버튼
	public void pressNumber(int number) {
	
		this.number = number;
		System.out.print(number);
		
	}
	
	//클리어
	public void pressClear() {
		
		System.out.println();
		
	}
	
}
