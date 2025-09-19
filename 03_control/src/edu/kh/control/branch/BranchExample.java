package edu.kh.control.branch;

import java.util.Scanner;

public class BranchExample {
	
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		/* 1부터 10까지 1씩 증가하며 출력하는 반복문 작성
		단, 5를 출력하면 반복문 종료
		1 2 3 4 5 */
		
		for(int i = 1; i <= 10; i++) {
			
			System.out.print(i + " ");
			
			if (i == 5) {
				break;
			}
		}
	}
	
	
	public void ex2() {
		/* 입력받은 모든 문자열을 누적
		단, "exit@" 입력 시 문자열 누적 종료하고 결과 출력 */
		
		
		String str = ""; // 빈 문자열
		
		while (true) {
			
			System.out.print("문자열 입력(exit@ 입력 시 종료) : ");
			String input = sc.nextLine();
			
			/* next() : 다음 한 단어'만' 수집 (공백 포함 x)
			 nextLine() : 다음 한 줄 수집 (공백 포함 o) */
			
			/* 자바에서 문자열(String) 비교는 == 연산자 사용 불가
			 비교연산자(==)는 보통 기본자료형끼리의 연산에서만 사용
			 String 은 기본자료형이 아닌 참조형! */
			
			/* equals() 메서드
			 문자열1.equals(문자열2)
			 -> 문자열1과 문자열2가 같으면 true,
			 같지 않으면 false 반환 (boolean 값을 되돌려 준다) */
			
			if ( input.equals("exit@") ) {
				break;
			}
			
			str += input + "\n";
					
		} // while문 중괄호 닫는 것
		
		System.out.println("-----------");
		System.out.println(str);
		
	}
	
	public void ex3() {
		// continue : 다음 반복으로 넘어감
		  
		/*1 ~10까지 1씩 증가하며 출력
		 단, 3의 배수는 제외
		 1 2 4 5 7 8 10 */
		
		for (int i = 1; i <= 10; i++) {
			
			if (i % 3 == 0) {
				continue;
			}
			
			System.out.print(i + " ");
		
		}

	}
	
	public void ex4() {
		/* 1~100까지 1씩 증가하며 출력하는 반복문
		 단, 5의 배수는 건너뛰고
		 증가하는 값이 40이 되었을 때 반복 멈춤 */
		
		for (int i = 1; i <= 100; i++) {
			
			if (i == 40) {
				break;
			}
			
			if (i % 5 == 0) {
				continue;
			}
			
			System.out.println(i);
		}
	}
	
	public void RSPGame() {
		/* 가위바위보 게임
		 몇 판 할지 입력받음
		 입력받은 판 수 만큼 반복 */
		
		/* 컴퓨터 : Math.random() : 0.0 ~ 1.0 사이 난수 생성
		 1 ~ 3 사이 난수 생성하도록 변형
		 1이면 가위, 2이면 바위, 3이면 보 지정 
		 컴퓨터와 플레이어 가위바위보 판별
		 플레이어 승! / 졌습니다ㅠㅠ / 비겼습니다
		 매 판마다 - 현재기록 : *승 *무 *패 출력 */
		
		System.out.println("[가위 바위 보 게임~!]");
		System.out.print("몇 판? : ");
		int round = sc.nextInt();
		
		// 승패 기록용 변수
		int win = 0;
		int lose = 0;
		int draw = 0;
		
		for (int i = 1; i <= round; i++) { // 입력받은 판 수 만큼 반복
			
			System.out.println("\n" + i + "번째 게임");
			System.out.print("가위/바위/보 중 하나 입력 : ");
			String input = sc.next();
			
			int random = (int)(Math.random() * 3 + 1);
			/* Math.random() : 0.0 ~ 1.0 사이
			 0.0 <= x < 1.0
			 0.0 <= x * 3 < 3.0
			 1.0 <= x * 3 + 1 < 4.0
			 1 <= (int)x * 3 + 1 < 4 
			  -> 1 이상 4 미만 정수 랜덤 출력 ; 1 2 3 */
			
			
			/* String은 참조형!
			// 참조형 : 메모리(Heap)공간에 있는 값의 주소를 참조하는 것
			
			String com = null; // null : 아무것도 참조하고 있지 않음.
			null 값으로 초기화된 것
			-> System.out.println(com); 에러없이 null로 출력
			 
			String com2 = ""; // 빈 문자열 객체로 초기화된 상태.
			com2 변수에 "" 로 값이 실제 들어간 상태
			-> System.out.println(com2); 에러없이 빈 문자열로 출력
			
			String com3; // 선언만.
			따라서 com3라는 이름의 상자만 메모리에 생성되고 값이 없음
			(초기화 된 적 없는 상태) 
			-> System.out.println(com3); 이러면 컴파일 에러남 */
			
			String com = null;
			
			// switch로 random값을 문자열로 바꿔야 함
			
			switch(random) {
			case 1 : com = "가위"; break;
			case 2 : com = "바위"; break;
			case 3 : com = "보"; break;
			}
			
			System.out.printf("컴퓨터는 [%s]를 선택했습니다.\n", com);
			
			// 컴퓨터와 플레이어의 승패 판별
			if (input.equals(com)) { // 비긴 경우
				System.out.println("비겼습니다");
				draw ++; // 무승부 기록
			} else { // 이기거나 진 경우
				
				boolean win1 = input.equals("가위") &&
						com.equals("보");
				
				boolean win2 = input.equals("바위") &&
						com.equals("가위");
				
				boolean win3 = input.equals("보") &&
						com.equals("바위");
				if (win1 || win2 || win3) {
					System.out.println("플레이어 승!");
					win++;
				} else {
					System.out.println("졌습니다ㅜㅜ");
					lose++;
				}
				
			} // if 문의 끝
			
			System.out.printf("현재 기록 : %d승 %d무 %d패\n", win, draw, lose);
			
		} // for 문의 끝
		
		
	}
	
	
		
	
	
}	
