package co.micol.main;

import ci.micol.student.Student;
//import co.micol.calculator.Calculator;

public class MainApp {

	public static void main(String[] args) {

//		Calculator cal = new Calculator();
//		int num = cal.sum();
//			// cal.sum(); 이라고 하면 숫자 20이라는 데이터가 넘어 오는데, 담을 곳이 없어서 보이진 않음.
//			//그래서 int num 이란 그릇을 만들어 담아 줘야 함.
//		System.out.println(num);
//
//		
//		int num1 = cal.sum(50);
//		System.out.println(num1);
//		
//		
//		int num2 = cal.sum(10, 20);
//		System.out.println(num2);
//		
//		
//		cal.sum(100, 20, num2);
//
//		
//		float num4 = cal.sum(num1, num2);
//			System.out.println(num4);
		
		Student st = new Student("홍길동", "한국대학교", "컴퓨터공학과", 20, "010-1111-1111");
		st.toString();
		
		System.out.println();
		
		Student st2 = new Student();
		st2.toString();
		
		System.out.println();
		
		st.setName("김치국");	// 내부 멤버 속성에 값을 집어 넣는다. (세터)
		System.out.println(st.getName());	// 내부 멤버 속성에 값을 가져 온다. (게터)
		
	}

}
