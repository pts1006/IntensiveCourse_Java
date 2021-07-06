package solo.practice;

import java.util.Scanner;

public class Solo_5 {
	
	public void exercise07(){
		
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		
		for(int i = 0; i < array.length; i++) {
			if(max < array[i]) max = array[i];
		}
		System.out.println("max : " + max);
	}
	
	public void exercise08(){
		
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		int count = 0;	// 이차원 배열 평균값을 구하기 위해서 반복문 실행 횟수를 기록할 필요가 있음.
		
		for(int i = 0; i < array.length; i++)
			for(int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				count++;
			}
		avg = (double)(sum) / count;
		
		System.out.println("sum : " + sum );
		System.out.println("avg : " + avg );
	}
	
	
	public void exercise09(){
		
		boolean run = true;
		
		@SuppressWarnings("unused")
		int studentNum = 0;	// 쓸 데가 없는데?
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------------------------");
			System.out.println("1. 학생수 || 2. 점수입력 || 3. 점수리스트 || 4. 분석 || 5. 종료");
			System.out.println("------------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.print("학생수> ");
				studentNum = scanner.nextInt();
				continue;
			} else if(selectNo == 2) {
				scores = new int[3];
				for(int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = scanner.nextInt();
				}
				continue;
			} else if(selectNo == 3) {
				for(int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]> " + scores[i]);
				}
				continue;				
			} else if(selectNo == 4) {
				int highScore = (scores[0] < scores[1]) ? scores[1] : scores[0];
				highScore = (scores[1] < scores[2]) ? scores[2] : scores[1];
				
				double average = (double)(scores[0] + scores[1] + scores[2]) / scores.length;
				
				System.out.println("최고 점수 : " + highScore);
				System.out.println("평균 점수 : " + average);
				continue;
			} else if(selectNo == 5) {
				run = false;
			}
			
			System.out.println("프로그램 종료");
			scanner.close();
			
		}
		
	}
	
	public static void main(String[] args) {
	
		Solo_5 exe = new Solo_5();
		exe.exercise09();
		
	}
}
