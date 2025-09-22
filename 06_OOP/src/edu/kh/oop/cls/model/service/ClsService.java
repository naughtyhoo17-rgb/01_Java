package edu.kh.oop.cls.model.service;

import edu.kh.oop.cls.model.vo.Student;

// ClsService와 Student/TestVO는 패키지가 다름
public class ClsService /* extends Student */{
	/* 부모로 Student 클래스를 상속 받음
	 ClsService -> 자식, Student -> 부모 */
	
	public void ex1() {
	// 클래스 접근제한자 확인하기
		Student std = new Student();
		//TestVO test = new TestVO();
		// (default) 클래스는 같은 패키지 내에서만 사용 가능
		
		/* 필드 접근제한자 확인하기
		  상속 관계에서 직접 접근 가능 범위 테스트
		  * 상속 받으면 부모의 것도 마치 내 것처럼 사용 가능!*
		*/
		//System.out.println(v1); // public이라 가능
		//System.out.println(v2); // protected도 가능 (ClsService가 Student의 후손이므로)
		//System.out.println(v3); // (default) 다른 패키지 불가능
		//System.out.println(v4); // private은 다른 클래스에서 불가능
		
		System.out.println(std.v1); // public이라 가능 -> 전체에서 직접 접근 가능하기에 에러x
		//System.out.println(std.v2); // 
		//System.out.println(std.v3);
		//System.out.println(std.v4);
		
		
	}
}
