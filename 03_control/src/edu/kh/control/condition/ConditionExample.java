package edu.kh.control.condition;

import java.util.Scanner;

public class ConditionExample { // 기능 제공용 클래스
	
	Scanner sc = new Scanner(System.in); // 필드 -> 클래스 안에 들어오자마자 선언

		// 메서드 (+생성자)
	public void ex1() {
		
		// 단일 if 문
		// 조건식이 true 일 때만 내부 코드 수행
		
		// 입력받은 정수가 양수인지 검사
		// 양수라면 "양수입니다" 출력
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		if(input > 0) {
			System.out.println("양수입니다");
		}
		
		if(input <=  0) {
			System.out.println("양수가 아니올시다");
		}
		
	}
	
	public void ex2() {
		// if - else 문
		// 조건식 결과가 true 면 if 구문,
		// false 면 else 구문 실행
		
		// 홀짝 검사
		// 입력받은 정수값이 홀수이면
		// "홀수입니다" 출력
		// 짝수이면 "짝수입니다" 출력
		// 0 이면 "0입니다" 출력
		// -> 중첩 if 문 필요
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		if(input % 2 != 0) { // 홀수인 경우
			System.out.println("홀수입니다");
		} else { // 짝수거나 0인 경우
			//중첩 if 문 (else 블록 안에 if-else 한번 더)
			if(input == 0) {
				System.out.println("0 입니다");
			} else {
			System.out.println("짝수입니다");
			}
		}
	}
	
	public void ex3() {
		// if(조건식) - else if(조건식) - else
		
		// 양수, 음수, 0 판별
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		if(input > 0) {
			System.out.println("양수입니다");
		} else if(input < 0) {
			System.out.println("음수입니다");
		} else {
			System.out.println("0입니다");
		}
		
	}
	
	public void ex4() {
		// 달(month)을 입력받아 해당 달에 맞는 계절 출력
		// 겨울,여름에는 온도(temperature) 입력받기
		// 1,2,12 겨울 (-15도 이하 : "겨울 한파 경보"
		// / -12도 이하 : "겨울 한파 주의보")
		// 3~5 봄
		// 6~8 여름 (35도 이상 : "여름 폭염 경보"
		// / 33도 이상 : "여름 폭염 주의보")
		// 9~11 가을
		// 1~12 아닐 땐 "해당하는 계절이 없습니다" 출력
		
		System.out.print("달 입력 : ");
		int month = sc.nextInt();
		
		String season; // 계절명을 저장할 변수(선언만 한 것)
		
		if(month == 1 || month == 2 || month == 12) {
			season = "겨울";
			
			System.out.print("온도 입력 : ");
			int temp = sc.nextInt();
			
			if(temp <= -15) {
				season += " 한파 경보"; // 재대입
				// season = season + " 한파 경보"; 
			} else if(temp <= -12) {
				season += " 한파 주의보";
			}
			
		} else if(month >= 3 && month <= 5) {
			season = "봄";
		} else if(month >= 6 && month <= 8) {
			season = "여름";
			
			System.out.print("온도 입력 : ");
			int temp = sc.nextInt();
			
			if(temp >= 35) {
				season += " 폭염 경보";
			} else if(temp >= 33) {
				season += " 폭염 주의보";
			}
		} else if(month >= 9 && month <= 11) {
			season = "가을";
		} else {
			season = "해당하는 계절이 없습니다";
		}
		
		System.out.println(season);
		
		
		}
	
	public void ex5() {
		
		// 나이를 입력받아
		// 13세 이하면 "어린이 입니다"
		// 13세 초과 19세 이하면 "청소년 입니다"
		// 19세 초과 시 "성인 입니다" 출력
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String gen; // 결과값 담을 변수 선언
		
		if(age <= 13) {
			gen = "어린이";
		}
		else if(age > 13 && age <= 19) {
			gen = "청소년";
		} else {
			gen = "성인";
		}
		// 블록 안에서 하나의 코드만 실행하는 경우, 블록 생략 가능
		// if(age <= 13) gen = "어린이"; 이런 식
		
		System.out.println(gen + " 입니다");
		
		
	}
	
	public void ex6() {
		// 점수(100점 만점)를 입력받아
		// 90점 이상 : A
		// 80점 이상 90점 미만 : B
		// 70점 이상 80점 미만 : C
		// 60점 이상 70점 미만 : D
		// 60점 미만 : F
		// 0점 미만, 100점 초과 : "잘못 입력하셨습니다" 출력
		
		System.out.print("점수 입력 : ");
		int point = sc.nextInt();
		
		String grade;
		
		if(point >= 90 && point <= 100) grade = "A";
		else if(point >= 80 && point < 90) grade = "B";
		else if(point >= 70 && point < 80) grade = "C";
		else if(point >= 60 && point < 70) grade = "D";
		else if(point >= 0 && point < 60) grade = "F";
		else grade = "잘못 입력하셨습니다";
		
		System.out.println(grade);
		
		// if(point < 0 || point > 100) grade = "잘못 입력하셨습니다";
		// -> 범위에서 벗어난 예외를 먼저 적어 조건의 범위를 한정하면 편함.
		// else if(point >= 90) grade = "A";
		// else if(point >= 80) grade = "B";
		// else if(point >= 70) grade = "C";
		// else if(point >= 60) grade = "D";
		// else grade = "F"; -> 0에서 59점까지
	
	}
	
	public void ex7() {
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		String result; //결과 저장용 변수 선언
		if(age < 0 || age > 100) {result = "잘못 입력하셨습니다";}
		else if(age < 12) {result = "적정 연령이 아닙니다";}
		else {
			System.out.print("키 입력 : ");
			double height = sc.nextDouble();
			if(height < 140.0) {result =  "적정 키가 아닙니다";}
			else {result = "탑승 가능";}
		}
		
		System.out.println(result);
	
	}
	
	public void ex8() {
				
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		String result;
		
		if(age < 0 || age > 100) {
			result = "나이를 잘못 입력 하셨습니다.";
		} else { 
			System.out.print("키 입력 : "); 
			double height = sc.nextDouble();
				if(height < 0 || height > 250.0) {
					result = "키를 잘못 입력 하셨습니다.";
				} else if(age < 12 && height < 140.0 ) {
					result = "나이와 키 모두 적절치 않음";
				} else if(age >= 12 && height < 140) { 
					result = "나이는 적절하나, 키가 적절치 않음";
					} else if(age < 12 && height >=140.0) {
						result = "키는 적절하나, 나이는 적절치 않음";
					} else {
						result = "탑승 가능";
					}
		
		}
		
		System.out.println(result);
		
	}
	
	public void ex9() {
		// switch 문
		// 여러 case 중 하나를 선택하여 수행하는 조건문
		
		// 요일 번호 입력 (1 ~ 7) : 3
		// 수요일
		
		System.out.print("요일 번호 입력 : ");
		int day = sc.nextInt();
		String result;
		
		switch(day) {
		case 1 : result = "월요일"; break;
		case 2 : result = "화요일"; break;
		case 3 : result = "수요일"; break;
		case 4 : result = "목요일"; break;
		case 5 : result = "금요일"; break;
		case 6 : result = "토요일"; break;
		case 7 : result = "일요일"; break;
		default : result = "잘못된 입력";
		}
		
		System.out.println(result);
	}
	
	public void ex10() {
		// 0 ~ 100 사이 점수를 입력받아
		// 10으로 나눈 몫이
		// 10, 9 라면 A
		// 8이면 B, 7이면 C, 6이면 D, 그 외 F 출력
		
		System.out.print("점수 입력(0 ~ 100) : ");
		int score = sc.nextInt();
		String result;
		
		switch(score / 10) {
		case 10 : case 9 : result = "A"; break;
		// case 10, 9 : 라고 써도 되고 두 줄로 각각 써도 됨
		case 8 : result = "B"; break;
		case 7 : result = "C"; break;
		case 6 : result = "D"; break;
		case 5, 4, 3, 2, 1 : result = "F"; break;
		default : result = "잘못된 점수";
		}
		
		System.out.println(result);
	}

}