package edu.kh.basic;

// 한 줄 주석 : 개발자 눈에만 보이고 컴파일러가 해석x(메모용)

/*범위주석
 * 처음 별, 닫을 때 별만 있으면 ok
 * 

 * */

public class JavaTest {

	//main 메서드 : 자바 프로그램(애플리케이션)을 실행하기 위해서 반드시 필요한 구문(함수식)
	// main 작성 후 ctrl + space -> Enter 자동완성
	public static void main(String[] args) {
		
		// main 메서드 안에 작성한 코드를 실행시키는 방법
		// 단축키 :  ctrl + F11
		// 상단에 초록색 재생버튼
		System.out.println("Hello World!!");
		// syso 작성 후 ctrl + space -> Enter 자동완성
		
		// 저장 단축키 ctrl + s (저장여부는 탭에 * 유무)
		System.out.println("Hi");
		System.out.println(); // 개행만
		System.out.println("저녁 뭐먹지");
		System.out.println("1234"); // 따옴표 안에 것을 단순 문자열로 인식
		System.out.println(1234); // 따옴표 없이 숫자만 쓰면 숫자나 변수로 인식
		
		// ctrl + alt + 위아래 방향키 : 방향키 방향으로 해당 줄 복사
		System.out.println();
		System.out.println();
		
		System.out.println("1 + 2");
		System.out.println(1 + 2);
		
		System.out.println(50 - 23);
		System.out.println(12 * 13);
		System.out.println(300 / 5);
		System.out.println(12 % 2); // % : 모듈러(modulo) : 나머지를 구할 때
		
		// "" (문자열) + 숫자 함께 작성 : 이어쓰기
		// 숫자 + 숫자 : 더하기 연산
		System.out.println("14 * 19 = " + 14 * 19);
		
		// 자바는 사칙연산의 우선 순위를 그대로 따름
		// -> 우선 계산을 원하면 () 괄호 사용
		
		System.out.println("90+70+65="+(90+70+65));
		
		System.out.println("A" + "B" + "형"); // AB (문자가 합쳐지는 것)
		
	}
}