package edu.kh.variable.practice;

public class FinalPractice {

	public static void main(String[] args) {
		int age = 35;
		System.out.println("나는 " + age + "살입니다.");
		
		int score = 90;
		score = score + 10; // 재대입 (= score += 10)
		System.out.println("최종 점수 : " + score);
		
		int a = 10;
		double b = a; // 자동형변환 (대입도 연산)
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		double pi = 3.14159;
		int num = (int)pi; // 강제형변환
		System.out.printf("pi = %.2f, num = %d\n", pi, num);
		
		char ch = 'A';
		int code = ch; // 자동형변환 (char -> int)
		System.out.printf("문자: %c, 코드값: %d\n", ch, code);
		
		final int PRICE = 5000;
		int count = 3;
		int total = PRICE * count;
		System.out.printf("물건 가격: %d원, 갯수: %d개, 총액: %d원\n",
				                     PRICE,       count,      total);
		
		int Kor = 95;
		int Eng = 87;
		int Mat = 90;
		// int Kor = 95, Eng = 87, Mat = 90; 이런 식으로 써도 됨 (모두 int니까 한번에)
		int sum = Kor + Eng + Mat;
		double avg = sum / 3.0; // 자동형변환
		System.out.printf("국어: %d, 영어: %d, 수학: %d\n", Kor, Eng, Mat );
		System.out.printf("총점: %d, 평균: %.2f\n", sum, avg);
		
		String name = "영숙";
		int age2 = 28;
		double height = 165.7;
		System.out.printf("출연자 이름: %s\n" , name);
		System.out.printf("나이: %d 세\n" , age2);
		System.out.printf("키: %.1f cm\n" , height); //%f는 소숫점 아래 6자리까지 기본 출력
		// System.out.printf("출연자 이름: %s\n나이: %d 세\n키: %.1f cm\n", name, age2, height); 이렇게도 가능
		double age3 = age2; // 자동형변환
		System.out.println("자동 형변환된 나이(double): " + age3);
		int intHeight = (int)height; // 강제형변환
		System.out.println("강제 형변환된 키(int): " + intHeight);
		int score1 = 87;
		int score2 = 92;
		double avgScore = (score1 + score2) / 2.0;
		System.out.printf("%s님의 매칭 점수 평균은 %.1f점입니다.", name, avgScore);
		
		
	}

}
