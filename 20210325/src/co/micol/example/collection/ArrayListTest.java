package co.micol.example.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	/*
	 실습 목적
	 	- 배열과 Collection의 차이
	 	- Generic Type의 기본 이해 ~> 해석할 수 있을 정도만.
	 	- VO 객체의 의미 파악.	(== DTO, Bean)	~> 자세한 건 검색해라 적기 귀찮다.
	 */
	public static void main(String[] args) {
		
		System.out.println("Array와 ArrayList 차이");
		
		System.out.println("\nArray");
		
		String[] name;

		name = new String[5];
		name[0] = "박길자";
		name[1] = "박승리";
		name[2] = "홍길동";
		name[3] = "이승자";
		name[4] = "홍기자";
//		name[5] = "추가행";		배열 5개로 지정해 놓고, 6개 만들었다. ~> 오류 뜬다.
		name[2] = "";	// 이렇게 할 경우 name[2]가 공백으로 남음. 단, 공간은 그대로 차지하고 있음. 틀이 안 깨짐.
							// 밑에 있는 list.remove와 함께 볼 것.
		
		for(int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}	// 반복문으로 만들 때 차이 보자.
		
		System.out.println("=====================");
		for(String str : name) {
			System.out.println(str);
		}
		
		System.out.println("\nArrayList");
		
		List<String> list = new ArrayList<String>();
		list.add("홍승리");
		list.add("홍기자");
		list.add("홍승호");
		list.add("홍승수");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));	// 얘는 객체라서 안에 있는 값 가져오려면 get이 필요.
		}
		
		list.remove(2);		// List 안에서, 원하는 위치를 삭제한다. ( 뒤에 있던 애가 앞에 있던 애 자리로 들어온다.)
		list.add("추가행");		// 얘는 위에 Array랑 다르게 크기도 지정 안 해 줬고, 새로운 값이 와도 저절로 저장한다.
		System.out.println("=====================");
		for(String str : list) {
			System.out.println(str);
		}
		
	}

}
