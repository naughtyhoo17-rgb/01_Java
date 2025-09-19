package edu.kh.control.project;

import java.util.Scanner;

public class TeamProject {

	Scanner sc = new Scanner(System.in);

	public void pr1() {

		System.out.println("=== ATM 프로그램 시작 ===");

		int money = 10000;
		System.out.printf("현재 잔액: %d원\n", money);
		System.out.println();
		int input;
		do {

			System.out.println("메뉴를 선택하세요: ");
			System.out.println("1. 입금하기");
			System.out.println("2. 출금하기");
			System.out.println("3. 잔액조회");
			System.out.println("4. 종료");
			System.out.print(">> ");
			input = sc.nextInt();
			System.out.println();

			switch (input) {
			case 1:
				System.out.print("입금할 금액을 입력하세요: ");
				int in = sc.nextInt();
				money += in;

				System.out.printf("입금 완료! 현재 잔액: %d원\n", money);
				System.out.println();
				break;

			case 2:
				System.out.print("출금할 금액을 입력하세요: ");
				int out = sc.nextInt();
				if (out > money) {
					System.out.printf("잔액 부족! 현재 잔액은 %d원입니다.\n", money);
					System.out.println();
				} else {
					money -= out;
					System.out.printf("출금 완료! 현재 잔액: %d원\n", money);
					System.out.println();
				}
				break;
			case 3:
				System.out.printf("현재 잔액은 %d원입니다.\n", money);
				System.out.println();
				break;
			case 4:
				System.out.println("프로그램을 종료합니다. 이용해주셔서 감사합니다!");
				break;
			default:
				System.out.println("잘못된 입력입니다. 1~4번 중에서 선택하세요.");
				System.out.println();
			}

		} while (input != 4);

	}

	public void pr2() {

		System.out.println("=== ATM 프로그램 시작 ===");
		int money = 10000;
		System.out.printf("현재 잔액: %d원\n", money);
		System.out.println();
		int input = 0;
		while (input != 4) {

			System.out.println("메뉴를 선택하세요: ");
			System.out.println("1. 입금하기");
			System.out.println("2. 출금하기");
			System.out.println("3. 잔액조회");
			System.out.println("4. 종료");
			System.out.print(">> ");
			input = sc.nextInt();
			System.out.println();

			switch (input) {
			case 1:
				System.out.print("입금할 금액을 입력하세요: ");
				int in = sc.nextInt();
				money += in;

				System.out.printf("입금 완료! 현재 잔액: %d원\n", money);
				System.out.println();
				break;

			case 2:
				System.out.print("출금할 금액을 입력하세요: ");
				int out = sc.nextInt();
				if (out > money) {
					System.out.printf("잔액 부족! 현재 잔액은 %d원입니다.\n", money);
					System.out.println();
				} else {
					money -= out;
					System.out.printf("출금 완료! 현재 잔액: %d원\n", money);
					System.out.println();
				}
				break;
			case 3:
				System.out.printf("현재 잔액은 %d원입니다.\n", money);
				System.out.println();
				break;
			case 4:
				System.out.println("프로그램을 종료합니다. 이용해주셔서 감사합니다!");
				break;
			default:
				System.out.println("잘못된 입력입니다. 1~4번 중에서 선택하세요.");
				System.out.println();
			}

		}

	}

	public void pr3() {
		System.out.println("=== 주사위 맞히기 게임 시작 ===");
		System.out.println("1~6 사이 숫자를 맞혀보세요. (종료를 원하면 \"종료\" 입력)");
		int trial = 0;
		int count = 0;

		while (true) {
			int random = (int) (Math.random() * 6 + 1);
			System.out.println("새로운 주사위 숫자가 생성되었습니다.\n");
			while (true) {
				System.out.print("숫자 입력 >> ");
				int input = sc.nextInt();
				trial++;
				if (random == input) {
					System.out.println("정답입니다!");
					count++;
					break;
				} else if (random != input) {
					if (random > input) {
						System.out.println("틀렸습니다. 더 큰 수를 입력하세요.\n");
					} else {
						System.out.println("틀렸습니다. 더 작은 수를 입력하세요.\n");
					}
				} else { // 종료 누른 경우
					System.out.println("게임을 종료합니다.");
					System.out.printf("총 시도 횟수: %d번\n정답 횟수: %d번\n정답률: %d%", trial, count, (count / trial) * 100);
				}
			}
		}
	}
}
