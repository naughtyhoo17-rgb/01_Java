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
		int arr[] = new int[input];
		int sum = 0;
		
		for(int i = 0; i < input; i++) {
			
			System.out.printf("배열 %s번째 인덱스에 넣을 값 : ", i);
			int num = sc.nextInt();
			arr[i] = num;
			sum += num;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			
		}
		
		System.out.println("\n총 합 : " + sum);
	}
	
	public void practice7() {
		
		System.out.print("주민등록번호(-포함) : ");
		String input = sc.next();
		
		char[] arr = new char[input.length()]; 
		// 입력받은 문자열의 길이만큼 char배열 할당
		
		for(int i = 0; i < arr.length; i++) {
			
			if(i <= 7) {
				arr[i] = input.charAt(i);
				
			} else {
				arr[i] = '*';
			}
			
			System.out.print(arr[i]);
		}
		
	}
	
	public void practice8() {
		
		while(true) {
			/* 3 이상의 수가 입력될 때까지 무한반복
			 -> 3 이상 홀수가 입력되면 원하는 코드 수행 후
			  break 문으로 종료 예정 */
			System.out.print("정수 : ");
			int input = sc.nextInt();
			
			if(input < 3 || input % 2 == 0) { // 반복해야 하는 상황
				System.out.println("다시 입력하세요!");
			
			} else {
				// 입력받은 정수 만큼의 크기를 갖는 배열 생성
				int [] arr = new int[input];
				
				int num = 0; // arr배열에 대입될 값
				
				for(int i = 0; i < arr.length; i++) {
					
					if(i <= arr.length/2) { // 중간까지 -> 증가
						arr[i] = ++num;
						} else { // 중간 이후 -> 감소
						arr[i] = --num;
						}
					
					// 각 요소에 대입된 값 곧바로 출력
					// 출력 시 , 추가(마지막은 제외)
					if(i == arr.length - 1) { // 마지막 순서
						System.out.print(arr[i]);
					} else {
						System.out.print(arr[i] + ", " );
						}
				} // for 문 끝
				
				break; // while 반복 멈춤
			}
			
		}
	}
	
	public void practice9() {
		int arr[] = new int[10];
		
		for(int i = 0; i < 10; i++) {
		int num = (int)(Math.random() * 10 + 1);
		arr[i] = num;
		}
		System.out.print("발생한 난수 : ");
		for(int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
		
		}
	}
	
	public void practice10() {
		
		int arr[] = new int[10];
		
		System.out.print("발생한 난수 : ");
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");
		}
		
		System.out.println(); // 줄 바꿈
		
		int max = 1; // 최댓값을 담을 변수 (이거보다 크면 그걸로 하기 위함)
		int min = 10; // 최솟값을 담을 변수 (이거보다 작으면 그걸로 하기 위함)
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] > max) { // 해당 인덱스 값이 max 보다 큰 경우
				max = arr[i];
			}
			
			if(arr[i] < min) { // 해당 인덱스 값이 min 보다 작은 경우
				min = arr[i];
			}
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
	
	public void practice11() {
		
		int arr[] = new int[10];
		
		for(int i = 0; i < 10; i++) {
			int random = (int)(Math.random() *10 + 1);
			arr [i] = random;
			
			for(int x = 0; x < i; x++) {
				if(random == arr[x]) {
					i--;
					break;
					}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
		}
	}
	
	public void practice13() {
		System.out.print("문자열 : ");
		String input = sc.next();
		char arr[] = new char[input.length()];
		
		for(int i = 0; i < arr.length; i++) {
			arr [i] = input.charAt(i);
		}
		
		
	}
	public void practice14() {
		
		// 1.첫 배열의 크기 지정
		System.out.print("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt();
		
		sc.nextLine(); // 입력 버퍼에 남은 개행문자 제거
		
		String arr [] = new String[size];
		
		// 2. 첫 배열에 저장할 문자열 입력받기
		for(int i = 0; i < arr.length; i++) {
			System.out.print((i+1) + "번째 문자열 : ");
			arr[i] = sc.nextLine();
		}
		
		/* 3. 반복이 시작되는 구간부터 while 문 작성하여
		  내부에 종료조건 만들어 break 이용하여 멈춤 */
		while(true) {
			
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char ch = sc.next().charAt(0);
			
		// 4. 값을 더 입력하겠다는 경우
			if(ch == 'y' || ch == 'Y') {
				
				// 5. 더 입력받을 갯수 입력받기
				System.out.print("더 입력하고 싶은 갯수 : ");
				int addSize = sc.nextInt();
				
				sc.nextLine(); // 입력버퍼에 남은 개행문자 제거
				
				/* 6. 새로 값을 입력받을 배열을 생성
				  --> 기존 배열 크기 + 추가 입력 갯수 */
				String[] newArr = new String[arr.length + addSize];
				
				// 7. 배열 복사 + 새로운 문자열 입력받기
				for(int i = 0; i < newArr.length; i++) {
					
					if(i < arr.length) { // 인덱스의 값이 기존 배열보다 작을 경우 -> 깊은 복사
						newArr [i] = arr[i];
					
					} else { // 인덱스의 값이 기존 배열보다 클 경우 -> 새로운 값 입력
						System.out.print((i+1) + "번째 문자열 : ");
						newArr [i] = sc.nextLine();
					}
				}
				
				/* 8. 기존 배열 공간을 참조하던 변수 arr에
				  새로운 배열 공간의 주소를 가진 newArr 대입 (얕은 복사) */
				arr = newArr;
				
				
			} else if(ch == 'n' || ch == 'N') { // 값을 더 입력하지 않는 경우
				break; // while 반복문 종료
				
			} else { // 잘못 입력한 경우
				System.out.print("잘못 입력하셨습니다. 다시 입력하세요!");
			}
		} // while 문 끝
		
		// 9. 배열값 모두 출력
		System.out.println(Arrays.toString(arr));
		
	}

	
	
	
	
	

}
