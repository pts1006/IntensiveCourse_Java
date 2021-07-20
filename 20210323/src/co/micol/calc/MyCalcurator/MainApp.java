package co.micol.calc.MyCalcurator;

public class MainApp {

	public static void main(String[] args) {

		MyCalcurator calc = new MyCalcurator();
		
		// 5 * 2 - 5 + 3
		
		calc.pressNumber(5);
		calc.pressOperator("*");
		calc.pressNumber(2);
		calc.pressOperator("-");
		calc.pressNumber(5);
		calc.pressOperator("+");
		calc.pressNumber(3);
		calc.pressOperator("=");
		
	}

}
