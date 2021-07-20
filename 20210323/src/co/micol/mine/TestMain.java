package co.micol.mine;

import java.util.Random;

public class TestMain {

	public static void main(String[] args) {
		
		int r = 5;
		int c = 5;
		int[][] arr = new int[r][c];
		
		Random random = new Random();
		
		//max 크기만큼 난수 발생
		int max = r * c;
		for(int i = 1; i <= 5; i++) {	//i 범위는 지뢰 개수
			int rand = random.nextInt(max);
			int tr = rand / c;	//행 번호
			int tc = rand % c;	//열 번호
			if(arr[tr][tc] != 0) {
				i--;
				continue;
			}
			arr[tr][tc] = 7;	// 지뢰 위치 표시용 숫자
		}
		//지뢰 주변 지뢰수를 카운트
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				if(arr[i][j] == 7) {
					if(i - 1 >= 0 && j - 1 >= 0 && arr[i - 1][j - 1] != 7) arr[i - 1][j - 1]++;
					if(i - 1 >= 0 				&& arr[i - 1][j] != 7) arr[i - 1][j]++;
					if(i - 1 >= 0 && j + 1 < r && arr[i - 1][j + 1] != 7) arr[i - 1][j + 1]++;
					if(		 		 j + 1 < r && arr[i][j + 1] != 7) arr[i][j + 1]++;
					if(		 		 j - 1 >= 0 && arr[i][j - 1] != 7) arr[i][j - 1]++;
					if(i + 1 < r && j - 1 >= 0 && arr[i + 1][j - 1] != 7) arr[i + 1][j - 1]++;
					if(i + 1 < r && 				 arr[i + 1][j] != 7) arr[i + 1][j]++;
					if(i + 1 < r && j + 1 < r && arr[i + 1][j + 1] != 7) arr[i + 1][j + 1]++;
				}
				
			}
		}
		
		
		//출력
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				System.out.print(arr[i][j] + "\t");
				
			}
			System.out.println();
		}
		
	}

}
