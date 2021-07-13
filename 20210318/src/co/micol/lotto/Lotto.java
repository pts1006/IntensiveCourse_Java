package co.micol.lotto;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
	
	private int[] lotto;
	private Random random;
	private int game;
		/*
		 
		  생성자란?
		  
		public Lotto() {	// 기본 생성자
		
			
			
		}
		
		public Lotto(int game) {	//생성자 오버로딩
			
			this.game = game;
			
		}
		
		public Lotto(int game, int[] lotto) {
			this.game = game;
			this.lotto = lotto;
		}
		*/
		
	public Lotto(int game) {
		this.game = game;
	}
		
	private void random() {
		random = new Random();
		for(int i = 0; i< 6; i++) {
			lotto[i] = random.nextInt(45) + 1;
			if(i != 0) {
				for(int j = 0; j < i; j++) {
					if(lotto[i] == lotto[j]) {
						i--;
						break;
					}
				}
			}
		}
		
		Arrays.sort(lotto);
		for(int n : lotto) {
			System.out.println(n + " ");
			
		}
		System.out.println();
	}
	
	public void run() {
		int line = 1;
		for(int i = 0; i < game; i++) {
			random();
			if(line ==5) {
				System.out.println("===================");
				line= 1;
			} else {
				line ++;
			}
		}
	}
		
}

