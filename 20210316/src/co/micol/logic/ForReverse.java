package co.micol.logic;

public class ForReverse {
	
	public void ex1() {
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void ex2() {
		
		for(int i = 0; i < 5; i++) {
			for(int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void ex3() {
		
		// 타원형 만들기
		final int N = 5;
		for(int i = -5; i <= N; i++) {
			for(int j = -5; j <= N; j++) {
				if(i * i + j * j <= N * N ) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				
			}
			
			System.out.println();
			
		}
	}
	
	public void ex4() {
		
		// 정삼각형 만들기 ㅅㅂ
		// 가장 큰 값 개수를 고려해서 짜는 방법. 뒤에 공백 안 생김.
		
		int size = 7;
		int space = size / 2;
		int col = 1;
		
		for(int i  = 0; i < 4; i++) {
			for(int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for(int  k = 0; k < col; k++) {
				System.out.print("*");
			}
			space--;
			col +=2;
			System.out.println();
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ForReverse exe = new ForReverse();
		exe.ex4();
		
		
	}

}
