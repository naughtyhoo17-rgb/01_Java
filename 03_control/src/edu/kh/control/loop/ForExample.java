package edu.kh.control.loop;

import java.util.Scanner;

// 기능 제공용 클래스
public class ForExample {

	Scanner sc = new Scanner(System.in);

	public void ex1() {
		// 1 ~ 10까지 콘솔에 출력하기

		for (int i = 1; i <= 10; i++) {
			// 반복 수행될 코드
			System.out.println(i);
		}

	}

	public void ex2() {
		// 영어 알파벳 A부터 Z까지 한줄로 출력

		for (int i = 'A'; i <= 'Z'; i++) {
			System.out.print((char) i); // 강제형변환
		}

		System.out.println("\n==========================");

		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i);
		}

	}

	public void ex3() {
		// 1부터 입력받은 수까지 1씩 증가하며 출력

		System.out.print("번호 입력 : ");
		int input = sc.nextInt();

		for (int i = 1; i <= input; i++) {
			System.out.println(i);
		}
	}

	public void ex4() {
		// 정수 5개를 입력받아 합계 구하기

		// [실행화면]
		// 입력 1 : 10
		// 입력 2 : 20
		// 입력 3 : 30
		// 입력 4 : 40
		// 입력 5 : 50
		// 합계 : 150

		int sum = 0; // 합계 저장용 변수

		for (int i = 1; i <= 5; i++) {
			System.out.print("입력 " + i + ": ");
			int input = sc.nextInt();

			sum += input; // sum = sum + input;
		}

		System.out.println("합계 : " + sum);

	}
	
	public void ex5() {
		// 1부터 20까지 1씩 증가하면서 출력
		// 단, 입력받은 수의 배수는 양쪽에 () 표시 -> 조건문 필요!
		
		// [실행화면]
		// 괄호를 표시할 배수 : 3
		// 1 2 (3) 4 5 (6) 7 8 (9) ... 20
		
		System.out.print("괄호를 표시할 배수 : ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= 20; i++) {
			
			if (i % num ==  0) { // i가 num의 배수인 경우
				System.out.print("(" + i + ") ");
			} else {
				System.out.print(i + " ");
			}
		}
	
			
		
		
	
	}
	
	public void ex6() {
		// 구구단 출력
		// 2 ~ 9 사이 수를 하나 입력 받아 
		// 해당 단을 출력
		// 단, 입력받은 수가 2 ~ 9 사이 숫자가 아니면
		// "잘못 입력하셨습니다" 출력
		
		System.out.print("단 입력 : ");
		int input = sc.nextInt();
		
		if (input < 2 || input > 9) {
			System.out.println("잘못 입력하셨습니다");
		} else {
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d X %d = %d\n", input, i, input * i);
			}
		}
		
		
		
	}
	
	public void ex7() {
		// 숫자 세기 count
		
		// 1 ~ 20까지 1씩 증가하면서
		// 입력받은 수의 배수의 총 개수 출력
		// 입력받은 수의 배수의 합계 출력
		
		// [출력화면]
		// 배수 입력 : 3
		// 3 6 9 12 15 18 : 6개
		// 3의 배수 합계 63
		
		String result = ""; // 배수를 나열할 문자열 변수
		int count = 0; // 배수의 갯수를 세기 위한 변수
		int sum = 0; // 배수들의 합계를 구하기 위한 변수
		
		System.out.print("배수 입력 : ");
		int input = sc.nextInt();
		
		for (int i = 1; i <= 20; i++) {
			
			if (i % input == 0) {
				result += i + " "; // result = result + (i + " ")
				count++;
				sum += i;
			} // else 불필요한 상황
		}
		
		System.out.printf("%s: %d개\n", result, count);
		System.out.printf("%d의 배수 합계 : %d", input, sum);
		
		
	}
	
	public void ex8() {
		// 구구단 모두 출력하기
		
		for (int dan = 2; dan <= 9; dan++) { // 2~9단까지 차례대로 증가하며 반복
			
			for (int num = 1; num <= 9; num++) { // 각 단에 곱해질 수 1~9 차례대로 증가하며 반복
				System.out.printf("%d X %d = %2d  ", dan, num, dan * num);
			}
			
			System.out.println();
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
