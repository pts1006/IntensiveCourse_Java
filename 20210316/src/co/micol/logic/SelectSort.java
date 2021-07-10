package co.micol.logic;

import java.util.Arrays;

public class SelectSort {
	static //sort = 정렬
	
	int[] num = {1, 5, 7, 2, 10, 4, 6, 8, 3, 9}; //배열 생성과 초기화

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		arrayTest();	//arrayTest 메소드를 호출한다.	얘는 스태틱 필요.
		
		System.out.println();
		
		SelectSort aa = new SelectSort();	// 얘는 스태틱 불필요.
		aa.arrayTest();
		*/
		
		SelectSort exe = new SelectSort();
		
		// 자바 도구 num에 스태틱 붙이라네.
		Arrays.sort(num);
		for(int n : num) {
			System.out.print(n + " ");
		}
		
		System.out.println();
		System.out.println("====================");
		
		exe.selectionSortUpgrade();	// 실습2
		
		System.out.println();
		System.out.println("====================");
		
		
		exe.selectionSort();	// 실습1
		
	}

	public void arrayTest() {		//메소드 만들기
		
		for(int i = 0; i < num.length; i++) {
			System.out.println(i + " 요소값 : " + num[i]);
		}
		
	}
	
	public void selectionSort() {	// 전통적인 방법 (현재는 이렇게 쓰이지 않음)
		int temp;
		for(int i = 0; i < num.length - 1; i++) {
			for(int j = i + 1; j < num.length; j++) {
				if(num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
		for(int n : num) {	// 결과 출력
			System.out.print(n + " ");
		}
		
	}
	
	public void selectionSortUpgrade () {	// 얘는 위에 방법 개량
		int temp, min;
		for(int i = 0; i < num.length -1; i++) {
			min = i;
			for(int j = i + 1; j <num.length; j++) {
				if(num[min] > num[j]) min = j;
			}	// 최솟값 위치 찾기 끝.
			if(i != min) {		// 현 위치 값보다 작은 값인 애가 존재한다면 그놈과 위치 교환
				temp = num[i];
				num[i] = num[min];
				num[min] = temp;
			}
		}
		for(int n : num) {
			System.out.print(n + " ");
		}
	}
	
}
