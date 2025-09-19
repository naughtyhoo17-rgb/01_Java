package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {

	Scanner sc = new Scanner(System.in); // 필드
	
	// 코드 자동 정렬 : ctrl + shift + f

	public void practice1() {

		System.out.print("숫자를 한 개 입력하세요 : ");
		int input = sc.nextInt();
		String result; // 결과값(문자열) 저장할 수 있는 변수 선언

		if (input <= 0) {
			result = "양수만 입력해주세요.";
		} else if (input % 2 == 0) {
			result = "짝수입니다.";
		} else {
			result = "홀수입니다.";
		}

		System.out.println(result);
	}

	public void practice2() {

		System.out.print("국어점수 : ");
		int Kor = sc.nextInt();
		System.out.print("수학점수 : ");
		int mat = sc.nextInt();
		System.out.print("영어점수 : ");
		int Eng = sc.nextInt();

		int sum = Kor + mat + Eng;
		double avg = sum / 3.0;

		if (Kor >= 40 && mat >= 40 && Eng >= 40 && avg >= 60) {
			System.out.println("국어 : " + Kor);
			System.out.println("수학 : " + mat);
			System.out.println("영어 : " + Eng);
			System.out.println("합계 : " + sum);
			System.out.printf("평균 : %.1f\n" , avg);
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("국어 : " + Kor);
			System.out.println("수학 : " + mat);
			System.out.println("영어 : " + Eng);
			System.out.println("불합격입니다.");
		}

	}

	public void practice3() {

		System.out.print("1~12 사이의 정수 입력 : ");
		int num = sc.nextInt();
		String result;

		switch (num) {
		case 1, 3, 5, 7, 8, 10, 12:
			result = num + "월은 31일까지 있습니다.";
			break;
		case 2:
			result = num + "월은 28일까지 있습니다.";
			break;
		case 4, 6, 9, 11:
			result = num + "월은 30일까지 있습니다.";
			break;
		default:
			result = num + "월은 잘못 입력된 달입니다.";
		}

		System.out.println(result);
	}

	public void practice4() {

		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		double bmi = weight / (height * height);
		System.out.println("BMI 지수 : " + bmi);

		String result; // 결과값(문자열) 저장할 변수 선언
		if (bmi < 18.5) result = "저체중";
		else if (bmi < 23) result = "정상체중";
		else if (bmi < 25) result = "과체중";
		else if (bmi < 30) result = "비만";
		else result = "고도 비만";

		System.out.println(result);

	}

	public void practice5() {

		System.out.print("중간 고사 점수 : ");
		double mid = sc.nextDouble();
		System.out.print("기말 고사 점수 : ");
		double fin = sc.nextDouble();
		System.out.print("과제 점수 : ");
		double hw = sc.nextDouble();
		System.out.print("출석 횟수 : ");
		double att = sc.nextDouble();
		
		mid *= 0.2; //재대입
		fin *= 0.3;
		hw *= 0.3;
		
		System.out.println("================= 결과 =================");
		
		if(att < 15) {
			System.out.printf("Fail [출석 횟수 부족 (%d/20)]" , (int)att);
		} else {
			System.out.printf("중간 고사 점수(20) : %.1f\n", mid);
			System.out.printf("기말 고사 점수(30) : %.1f\n", fin);
			System.out.printf("과제 점수(30) : %.1f\n", hw);
			System.out.printf("출석 점수(20) : %.1f\n", att);
			
			double sum = mid + fin + hw + att;
			
			System.out.printf("총점 : %.1f\n", sum);
			
			if(sum >= 70) {
				System.out.println("PASS");
			} else {
				System.out.println("Fail [점수 미달]");
			}
		}
		
	}	
	
}
