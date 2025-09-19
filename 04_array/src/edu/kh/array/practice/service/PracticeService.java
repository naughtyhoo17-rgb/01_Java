package edu.kh.array.practice.service;

import java.util.Arrays;

import java.util.Scanner;

public class PracticeService {

	Scanner sc = new Scanner(System.in);

	public void practice1() {

		int[] arr = new int[9];
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1);
			if (i % 2 == 0) {
				sum += i + 1;
			}

		}

		System.out.println(Arrays.toString(arr));
		System.out.println("짝수 번 째 인덱스 합 : " + sum);

	}

	public void practice2() {

		int[] arr = new int[9];
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (arr.length - i);
			if (i % 2 != 0) {
				sum += i + 1;
			}

		}

		System.out.println(Arrays.toString(arr));
		System.out.println("홀수 번 째 인덱스 합 : " + sum);

	}

	public void practice3() {

		System.out.print("양의 정수 : ");
		int input = sc.nextInt();

		int[] arr = new int[input];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1);
		}

		System.out.println(Arrays.toString(arr));

	}

	public void practice4() {

		int[] arr = new int[5];
		boolean flag = false;

		for (int i = 0; i < arr.length; i++) {
			System.out.print("입력 " + i + " : ");
			arr[i] = sc.nextInt();
		}
		System.out.print("검색할 값 : ");
		int input = sc.nextInt();

		for (int x = 0; x < arr.length; x++) {
			if (input == arr[x]) {
				System.out.println("인덱스 : " + x);
				flag = true;
			}
		}

		if (!flag) {
			System.out.println("일치하는 값이 존재하지 않습니다.");

		}

	}

	public void practice5() {

		System.out.print("문자열 : ");
		String input = sc.nextLine();

		char[] arr = new char[input.length()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.charAt(i);
		}

		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (ch == arr[i]) {
				count++;
			}
		}

	int arr1[] = new int[count];
	for (int x = 0; x < arr.length; x++) {
		
		if(ch == arr[x]) {
		}
	}

	if(count>0)
	{
		System.out.print(ch + "개수 : " + count);
	}
}
	
	public void practice6() {
		
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		for(int i = 0; i < input; i++) {
			
			System.out.printf("배열 %s번째 인덱스에 넣을 값 : ", i);
			int num = sc.nextInt();
			
		}
		
		int arr[] = new int[input];
		for(int i = 0; i < arr.length; i++) {
			
		}
	}


}
