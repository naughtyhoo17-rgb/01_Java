package edu.kh.oop.abstraction.model.service;

import edu.kh.oop.abstraction.model.vo.People;

/* service : 특정 기능(비즈니스 로직)을 제공하는 패키지
  ex) 비밀번호 암호화, 파일 검사 etc */

public class AbstractionService {
	
	// 속성 -> 딱히 따질 거 없음, thus 패스
	// 기능
	public void ex1() {
		// People 클래스를 이용해 국민 객체 만들기
		People p1 = new People();
		/* People p1 : People 객체의 주소를 저장하여 참조하는 변수 p1(==참조변수)
		   new People() : 새로운 People 객체를 Heap 영역에 생성 */
		
		/*
		p1.name = "홍길동";
		p1.gender = '남';
		p1.pNo = "123456-1234567";
		p1.address = "서울시 중구 남대문로 120";
		p1.phone = "010-1234-1234";
		p1.age = 20;
		
		p1.tax();
		p1.vote();
		
		System.out.println("p1의 name : " + p1.name);
		System.out.println("p1의 gender : " + p1.gender);
		System.out.println("p1의 pNo : " + p1.pNo);
		System.out.println("p1의 address : " + p1.address);
		System.out.println("p1의 phone : " + p1.phone);
		System.out.println("p1의 age : " + p1.age);
		*/
		
		
		
		
	}
}
