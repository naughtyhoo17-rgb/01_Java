package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice3 {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.print("가격을 입력 하세요 : ");
		int price = sc.nextInt();
		System.out.print("멤버쉽 있으세요? : ");
		boolean isMember = sc.nextBoolean();
		// true / false
		double discount = isMember ? price * 0.10 : price * 0.05;
		double totalPrice = price - discount;
		System.out.println("할인율 : " + discount);
		System.out.println("할인을 포함한 최종 금액 : " + totalPrice + "원");
		
	}

	public void practice2() {
		
		System.out.print("출금할 금액 입력 : ");
		int amount = sc.nextInt();
		int fiftyTh = amount / 50000; // 5만원짜리 지폐 개수
		amount %= 50000; // 복합대입연산자
		// amount = amount % 50000; -> 재대입 (50000으로 나눈 값의 나머지로)
		// 5만원짜리 지폐를 거르고 난 뒤 나머지 금액
		// 아래 다음 지폐 계산에서 재사용하기 위해.
		int tenTh = amount / 10000; // 만원짜리 지폐 개수
		amount %= 10000;
		int fiveTh = amount / 5000; // 5천원짜리 지폐 개수
		amount %= 5000;
		int oneTh = amount / 1000; // 천원짜리 지폐 개수
		
		System.out.println("50000원 : " + fiftyTh);
		System.out.println("10000원 : " + tenTh);
		System.out.println("5000원 : " + fiveTh);
		System.out.println("1000원 : " + oneTh);
		
		
	}
	
	public void practice3() {
		
		System.out.print("첫 번째 수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 수 : ");
		int num2 = sc.nextInt();
		// 첫 번째 수가 두 번째 수의 배수
		// == num1이 num2로 나누어 떨어진다
		// == num1을 num2로 나누었을 때 나머지가 0
		String result = num1 % num2 == 0 ? "배수입니다" : "배수가 아닙니다";
		
		System.out.println(result);
		
	}
}
