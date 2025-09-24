package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Hero;

public class HeroService {
	
	public void practice() {
		
		Hero p1 = new Hero("이구역짱", "전사", 200, 20, 1, 0);
		Hero p2 = new Hero("Zi존위자드", "마법사", 100, 100, 1, 0);

		System.out.println("========== 캐릭터 생성 ==========");
		System.out.printf("%s 직업으로 '%s'님이 생성되었습니다.\n", 
				p1.getJob(),p1.getNickname());
		System.out.println(p1.toString());
		
		System.out.println("========== 캐릭터 생성 ==========");
		System.out.printf("%s 직업으로 '%s'님이 생성되었습니다.\n",
				p2.getJob(),p2.getNickname());
		System.out.println(p2.toString());
		
		System.out.printf("========== %s 시점 ==========\n", p1.getNickname());
		p1.attack(100.0);
		p1.attack(50.5);
		p1.attack(49.5);
		p1.dash();
		p1.dash();
		p1.dash();
		
		System.out.printf("======== '%s'님의 정보 ========\n", p1.getNickname());
		System.out.println(p1.toString());
		
		System.out.printf("========== %s 시점 ==========\n", p2.getNickname());
		p2.attack(300.0);
		p2.dash();
		p2.attack(300.0);
		p2.attack(300.0);
		
		System.out.printf("======== '%s'님의 정보 ========\n", p2.getNickname());
		System.out.println(p2.toString());
		
		
		
	}

}
