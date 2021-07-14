package ci.micol.student;

public class Student {
	
	private String name, school, major, tel;
	private int age;
	
	public Student() {
		//기본생성자 (이 경우, 값을 안 채우고 전달하는 방법)
	}
	
	public Student(String name, String school, String major, int age, String tel) {
		this.name = name;
		this.school = school;
		this.major = major;
		this.age = age;
		this.tel = tel;
	}	// 이 경우, 밑의 값을 채워 넣고 싶을 때.
	
	public String toString() {		// 최상위 객체인  Object 클래스로부터 상속된 메소드. 오버라이드. : 다시 정의해서 쓰는 것.
		System.out.println("학생이름 : " + name);
		System.out.println("학   교 : " + school);
		System.out.println("전공학과 : " + major);
		System.out.println("학생나이 : " + age);
		System.out.println("전화번호 : " + tel);
		return null;
	}
	
	//그럼 이제 세터와 게터를 만들어 보자.
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	// 우클릭 ~> source ~> getter setter 만들기 있음.
	// 혹은 11시 방향 메뉴창에서 선택 가능.
}
