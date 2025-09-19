package edu.kh.op.practice;

import java.util.Scanner;

//기능 제공용 클래스
public class OperatorPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int input1 = sc.nextInt();
		System.out.print("사탕 개수 :");
		int input2 = sc.nextInt();
		
		System.out.printf("1인당 사탕 개수 : %d\n", input2 / input1);
		System.out.printf("남는 사탕 개수 : %d", input2 % input1);
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String word = sc.next();
		System.out.print("학년 : ");
		int iNum1 = sc.nextInt();
		System.out.print("반 : ");
		int iNum2 = sc.nextInt();
		System.out.print("번호 : ");
		int iNum3 = sc.nextInt();
		sc.nextLine(); // 개행문자 제거용도 (입력버퍼에 남은 개행문자 비우기)
		System.out.print("성별 : ");
		String word2 = sc.nextLine();
		System.out.print("성적 : ");
		double dNum1 = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.", iNum1, iNum2, iNum3, word, word2, dNum1);
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int input1 = sc.nextInt();
		System.out.print("영어 : ");
		int input2 = sc.nextInt();
		System.out.print("수학 : ");
		int input3 = sc.nextInt();
		System.out.println();
		
		int sum = input1 + input2 + input3;
		double avg = sum / 3.0;
		System.out.printf("합계 : %d\n", sum);
		System.out.printf("평균 : %.1f\n", avg);
		
		// 각 과목이 40점 이상이고 평균 60점 이상이어야 합격, 그 외 불합격 출력
		boolean result = (input1 >= 40) && (input2 >= 40) && (input3 >= 40) && (avg >= 60);
		
		System.out.println(result? "합격" : "불합격");
	}

}
