package co.micol.mine;

import java.util.Scanner;

//보드
public class MineBoard {
//	int size = 5;	//판 크기
//	int mineCnt = 2;	// 지뢰개수
//	Mine[][] board;		// 보드
//
//	Scanner sc = new Scanner(System.in);
//	
//	public void boardInit() {
//		//판 크기만큼 배열 객체 생성
//		board = new Mine[size][size];
//		//배열개수만큼 Mine을 생성해서 배열 초기화
//		for(int i = 0; i <= size; i++) {
//			for(int j = 0; j <=size; j++)
//				board[i][j] = new Mine();
//		}
//		//지뢰 초기화
//		for(int i = 0; i < mineCnt; i++) {
//			int r = (int)(Math.random()*10);
//			int c = (int)(Math.random()*10);
//			board[r][c].type = "●";
//		}
//		boardInit();
//	}
//
//	public void boardPrint() {
//		//board 2차원 배열 출력 
//		//오픈 상태에 따라서 출력
//		//close 상태면 "■" 출력 , open이면 type을 출력.
//		for(int i = 0; i < board.length; i++) {
//			for(int j = 0; j < board[i].length; j++) {
//				//mine의 type 출력
//				
//			}
//		}
//	}
//	
//	public void start() {
//		
//		//판크기 입력
//		System.out.println("판크기(난이도) 입력");
//		this.size = sc.nextInt();
//		//난이도에 따라 보드 초기화
//		boardInit();
//		
//		//지뢰를 클릭했거나 모두 오픈될떄까지 반복
//			//칸위치 입력	r c m
//			String menu = sc.next();
//			String[] re =  menu.split(" ");
//			//오픈 - 지뢰위치를 입력했으면 게임오버
//			//모든 지뢰가 오픈되었으면 게임완료 - 반복
//		
//	}
//	//지뢰 위치를 입력했으면 false 리턴하고 게임오버
//	
//	//모든 지뢰가 다 오픈되었는지 체크하고 게임완료
//	public boolean
//
//	
//	public boolean open(String inData) {
//		String[] s = inData.split(" ");
//	}
	
}
