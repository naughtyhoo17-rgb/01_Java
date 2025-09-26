package com.kh.inheritance.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;
import com.kh.inheritance.model.dto.BasicPhone;
import com.kh.inheritance.model.dto.SmartPhone;

public class Run {

	public static void main(String[] args) {

		/*
		  SmartPhone sp = new SmartPhone("Samsung", "Galaxy S20", 2020, 1200000,
		  "Android", 128); sp.printInfo();
		  
		  System.out.println("========================================");
		  
		  BasicPhone bp = new BasicPhone("Nokia", "3310", 2000, 100000, true);
		  bp.printInfo(); bp.checkKeyboard();
		 */

		Student[] studentArr = new Student[3];
		studentArr[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		studentArr[1] = new Student("김말동", 21, 187.3, 80.0, 2, "경영학과");
		studentArr[2] = new Student("강계순", 23, 167.0, 45.0, 4, "정보통신공학과");
		
		/* 향상된 for 문
		 ; 자바에서 배열, 컬렉션과 같은 데이터를 순차적으로
		 간단하게 반복할 수 있는 구조 제공
		 -> 일반 for 문보다 코드가 간결하고 가독성이 좋아
		 반복 작업을 더 쉽게 작성할 수 있다.
		 
		 for(자료형 변수명 : 배열 또는 컬렉션) {
		 	반복해서 실행할 코드 
		 }
		  */

		for (Student std : studentArr) {
			System.out.println(std.information());
		}

		Scanner sc = new Scanner(System.in);

		Employee[] empArr = new Employee[10];

		int count = 0;

		while (true) {
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			System.out.print("신장 : ");
			double height = sc.nextDouble();
			System.out.print("몸무게 : ");
			double weight = sc.nextDouble();
			System.out.print("급여 : ");
			int salary = sc.nextInt();
			System.out.print("부서 : ");
			String dept = sc.next();

			empArr[count] = new Employee(name, age, height, weight, salary, dept);
			count++;
			
			if(count == empArr.length) { // 배열이 꽉 차면 반복 종료
				break;
			}
			
			// 추가 여부 확인
			System.out.print("\n계속? ");
			char ans = sc.next().charAt(0);

			if (ans != 'y' && ans != 'Y') {
				break;
			}

		}
		
		// 현재까지 기록된 사원들의 정보 출력
		for (Employee emp : empArr) {
			if(emp == null) break; // Null Pointer Exception 방지
			System.out.println(emp.information());
		}
	} 
 
}
