package edu.kh.oop.cls.model.vo;

public class Student { // 클래스 선언부
// [접근제한자] [예약어] class 클래스명 {}
	
	/* 접근제한자 public : 같은 프로젝트 내부라면
	 어떤 클래스에서든 import 하여 사용할 수 있음 */
	
	//TestVO testvo = new TestVO (); -> 가능
	// (default) 클래스는 같은 패키지 내에서만 사용 가능
	
	/* 1. 필드(field) 
	  필드 접근제한자 뜻 : 직접 접근 가능한 범위를 나타냄 */
	  public int v1 = 10; // 전체에서 접근 가능
	  protected int v2 = 20; // 후손 클래스까지
	  int v3 = 30; // (default) 같은 패키지 내까지
	  private int v4 = 40; // 해당 클래스 내부에서만 
	  
	// static 예약어
	public static String schoolName = "KH고등학교";
	
	// final 예약어
	private final int TEMP1 = 100;
	/* getter만 만들어진 이유 : final 예약어가 붙은 상수는
	 재대입이 불가능해 setter를 굳이 만들어주지 않음. 
	 억지로 만들어도 에러 발생 */
	public int getTEMP1() {
		return TEMP1;
	}
	 
	// 2. 생성자 -> 다른 클래스에서
	// 3. 메서드 
	
	public void ex() {
		// 필드 접근제한자 확인하기
		// v1 ~ v4 모두 Student 클래스 내부에서 생성된 변수
		// thus 전부 직접 접근 가능
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		
	}
	
}
