package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() {

		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();

		if (input < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			for (int i = 1; i <= input; i++) {
				System.out.print(i + " ");
			}
		}
	}

	public void practice2() {

		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();

		if (input < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			for (int i = input; i >= 1; i--) {
				System.out.print(i + " ");
			}
		}
	}

	public void practice3() {

		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();

		String result = "";
		int sum = 0;

		for (int i = 1; i <= input; i++) {
			sum += i; // 합계
			
			if (i == input) { //마지막 턴
				result += i;
			} else { // 마지막 전까지의 모든 턴들
				result += i + " + ";
			}

		}
		System.out.printf("%s = %d", result, sum);
	}

	public void practice4() {

		System.out.print("첫 번째 숫자 : ");
		int input1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int input2 = sc.nextInt();

		if (input1 < 1 || input2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else { // 깃허브 풀이 확인!
			if (input1 > input2) {
				for (int i = input2; i <= input1; i++) {
					System.out.print(i + " ");
				}
			} else {
				for (int i = input1; i <= input2; i++) {
					System.out.print(i + " ");
				}
			}
		}

	}

	public void practice5() {

		System.out.print("숫자 : ");
		int input = sc.nextInt();
		System.out.printf("===== %d단 =====\n", input);

		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", input, i, input * i);
		}

	}

	public void practice6() {

		System.out.print("숫자 : ");
		int input = sc.nextInt();

		if (input < 2 || input > 9) {
			System.out.println("2~9 사이 숫자만 입력해주세요.");
		} else {
			for (int dan = input; dan <= 9; dan++) {
				System.out.printf("===== %d단 =====\n", dan);
				for (int i = 1; i <= 9; i++) {
					System.out.printf("%d * %d = %d\n", dan, i, dan * i);

				}
			}
		}
	}
	
	public void practice7() {
		
		System.out.print("자연수 하나를 입력하세요 : ");
		int input = sc.nextInt();
		int count = 0; // 공배수 갯수 세는 용도
		
		for (int i = 1; i <= input; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");
			} if(i % 6 == 0) {
				count++;
			}
		}
		System.out.println(); // 또는 밑에 줄에서 "\ncount : ~~
		System.out.println("count : " + count);
	}
	
	
	
	

}
