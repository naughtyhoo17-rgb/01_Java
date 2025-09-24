package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Book;

public class BookService {
	
	public void practice() {
		
		Book book = new Book();
		Book book2 = new Book("자바의 정석", 30000, 0.2, "남궁성");
		
		System.out.println(book.toString());
		System.out.println(book2.toString());
		
		System.out.println("===================================");
		System.out.println("수정된 결과 확인");
		
		book.setTitle("C언어");
		book.setPrice(30000);
		book.setDiscountRate(0.1);
		book.setAuthor("홍길동");
		
		System.out.println(book.toString());
		
		System.out.println("===================================");
				
		System.out.println("도서명 = " + book.getTitle());
		System.out.printf("할인된 가격 = %d원\n",
				(book.getPrice() - (book.getPrice() * (int)book.getDiscountRate())));
		System.out.println("도서명 = " + book2.getTitle());
		System.out.printf("할인된 가격 = %d원\n",
				(book2.getPrice() - (book2.getPrice() * (int)book2.getDiscountRate())));
				
	}

}
