package co.micol.reference;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Int Array test
//		int[] score;
//		score = new int[6];

		int[] score = new int[6];
//		score[0] = 1;
//		score[1] = 2;
//		score[2] = 3;
//		score[3] = 4;
//		score[4] = 5;
//		score[5] = 6;
		
		for(int i = 0; i < score.length; i++) {
			score[i] = i + 1;
		}

//		for(int i = 0; i < score.length; i++) {
//			System.out.println("배열 " + i + " 번째 요소 값 = " + score[i]);
//		}
		
		int i = 0;
		for(int num : score) {		// for-each문 : 성능이 향상된 for
			System.out.println("배열 " + i + " 번째 요소 값 = " + num);
			i++;
		}
		
//		----------------------------------------------------		
//		String studentName = "홍길동";
//		String studenName1 = "김치국";
		
		String[] studentName = new String[30];
		studentName[0] = "홍길동";
	}

}
