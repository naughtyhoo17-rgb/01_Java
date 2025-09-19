package edu.kh.control.loop;

import java.util.Scanner;

public class WhileExample {
	
	/* while 문
	 
	 * 별도의 초기식, 증감식 존재 x
	  반복 종료 조건을 자유롭게 설정하는 반복문
	  
	 * 확실히 얼마나 반복 후 끝날 지 모르지만
	  언젠가 반복조건이 false가 되는 경우 반복 종료.
	  
	 */
	
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		
		int input = 9; // 처음의 조건식이 true가 되게끔하는 임의의 수
					   // 첫 turn이 시작되게 하기 위함
		
		while (input != 0) { // input이 0이 아니면 반복,
							 // 0이면 멈춤
			System.out.println("-------메뉴선택-------");
			System.out.println("1. 떡볶이");
			System.out.println("2. 쫄면");
			System.out.println("3. 김밥");
			System.out.println("0. 종료"); // 탈출조건
			
			System.out.print("메뉴 선택 >> ");
			input = sc.nextInt(); // 재대입
			
			switch (input) {
			case 1 : System.out.println("떡볶이를 주문했다"); break;
			case 2 : System.out.println("쫄면을 주문했다"); break;
			case 3 : System.out.println("김밥을 주문했다"); break;
			case 0 : System.out.println("프로그램을 종료합니다"); break;
			default : System.out.println("메뉴에 있는 번호만 선택해!");
			}
			
		}
		
	}
	
	public void ex2() {
		// 입력되는 모든 정수의 합 구하기
		// 단, 0 입력 시 반복 종료 후 결과 출력
		// -> 0 입력되지 않는 한 계속 반복
	
		/*
		  do {
		  		반복 수행할 코드;
		  		-> 반드시 무조건 한번은 수행됨
		  } while(조건식)
		  
		 */
		
		int input = 0; // 입력받은 값을 저장할 변수
		int sum = 0; // 합계를 저장할 변수
		
		do {
			// (반복) 수행될 코드
			System.out.print("정수 입력 : ");
			input = sc.nextInt();
			
			sum += input; // sum = sum + input; -> 누적
			
		} while (input != 0); // 조건 따져서 반복 여부 결정
		
		System.out.println("합계 : " + sum);
	}	
	
	
	
	
	
	
	
	
	
	

}
