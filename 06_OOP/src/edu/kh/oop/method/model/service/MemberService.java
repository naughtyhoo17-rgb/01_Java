package edu.kh.oop.method.model.service;

import java.util.Scanner;

import edu.kh.oop.method.model.vo.Member;

public class MemberService {
	
	// 속성 (필드)
	private Scanner sc = new Scanner(System.in);
	// MemberService 안에서만 유효한 스캐너 (여태는 안썼으므로 default)
	
	// 가입한 회원의 정보를 저장할 변수
	private Member memberInfo = null; // -> Member는 참조형이라 null
	
	// 로그인한 회원의 정보를 저장할 변수
	private Member loginMember = null;
	
	// 기능 (생성자 / 메서드)
	
	// 메뉴 화면 출력 기능
	public void displayMenu() {
		
		int menuNum = 0; // 입력한 메뉴 번호를 저장할 변수
		
		// 무조건 한 번은 수행하는 do-while문 활용
		do {
			System.out.println("======회원 정보 관리 프로그램======");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원 정보 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 입력 : ");
			menuNum = sc.nextInt();
			sc.nextLine(); // 입력 버퍼에 개행문자 제거 용도
			
			switch(menuNum) {
			// 내가 호출한 메서드가 return하는 값을 잘 생각하기!
			case 1 : System.out.println( signUp() );  break;
			case 2 : System.out.println( login() );  break;
			case 3 : System.out.println( selectMember() );  break;
			case 4 : int result = updateMember();
				
					if(result == -1) {
						System.out.println("로그인부터");
					} else if(result == 0) {
						System.out.println("수정 실패(비밀번호 불일치)");
					} else {
						System.out.println("수정 완료!");
					}
					break;
			case 0 : System.out.println("프로그램 종료..."); break;
			default : System.out.println("메뉴에 있는 번호 입력!");
			}
			
		} while(menuNum != 0); // menuNum이 0일 때 반복 종료
		
	}
	
	// 회원 가입 기능
	public String signUp() { // 여기서는 메서드 정의만, 따로 호출부 필요
		
		System.out.println("\n********회원 가입********");
		
		System.out.print("아이디 : ");
		String memberId = sc.next();
		
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		
		System.out.print("비밀번호 확인 : ");
		String memberPwCheck = sc.next();
		
		System.out.print("이름 : ");
		String memberName = sc.next();
		
		System.out.print("나이 : ");
		int memberAge = sc.nextInt();
		
		/* 비밀번호와 비밀번호 확인이 일치하면 회원가입 진행
		 일치하지 않은면 회원가입 실패 유도 */
		if(memberPw.equals(memberPwCheck)) { // 일치하는 경우
			
			/* 회원 가입 == 새로운 회원 객체가 생성
			 -> Member 클래스 이용해서 새로운 객체 생성
			 -> 매개변수 생성자 이용 */
			memberInfo = new Member(memberId, memberPw, memberName, memberAge);
			/* 회원가입한 정보를 가진 객체의 주소값을
			 memberInfo 필드변수에 참조시킴!
			 -> 회원가입 이후 memberInfo는 더이상 null 상태가 아님! */
			
			return "회원가입 성공!👌👌\n";
			
		} else { // 일치하지 않는 경우
			return "회원가입 실패! (비밀번호 불일치)";					
		}
		
		
	}
	
	// 로그인 기능
	public String login() {
		/* 회원가입 되어있는 사람 유무 여부 검사
		 내가 입력한 아이디와 비밀번호로 가입한 사람의 정보가
		 기존에 존재하는지 확인 */
		
		System.out.println("\n******** 로그인 ********");
		 /* 회원가입을 했는지부터 확인
		  == memberInfo가 객체를 참조하고 있는지 확인
		  == null 여부 확인 */
		if(memberInfo == null) { // 회원가입을 안 한 경우
			// null : 아무것도 참조하고 있지 않음을 의미
			return "회원가입부터 진행하세요!\n";
			/* return 값; -> "현재 메서드를 종료하고"
			 값을 가지고 해당 메서드를 호출한 쪽으로 되돌아 감 */
		}
		
		/* 회원가입을 했다면 해당 라인으로 도달 가능
		 -> 로그인 기능 수행 */
		System.out.print("아이디 : ");
		String memberId = sc.next();

		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		
		/* 회원가입 정보(memberInfo가 참조하는 Member 객체)에
		저장된 아이디, 비밀번호가 입력한 것들과 같으면 "로그인 성공"
		같이 않으면 "아이디 또는 비밀번호 불일치" 리턴 */
		
		if( memberId.equals(memberInfo.getMemberId())
		&& memberPw.equals(memberInfo.getMemberPw()) ) {
			
			/* 로그인한 사람의 정보를 기억시키기
			 loginMember에 현재 로그인한 사람의 정보를 기억시킴
			 == loginMember에 memberInfo가 참조하는 객체의 주소 대입 */
			loginMember = memberInfo; // -> 얕은 복사(주소값 대입)
			
			return "로그인 성공 " + loginMember.getMemberName()
					+ "님 환영합니다!\n";
			
		} else {
			return "아이디 또는 비밀번호가 일치하지 않습니다.\n";
			
		}
		
		
	}
	
	// 회원정보 조회 기능
	public String selectMember() {
		/* 조회하려면? 로그인 여부부터 확인
		 -> 로그인 O? 현재 로그인한 사람의 정보를 저장한 객체에서
		  정보 얻어오기 (이름, 아이디, 나이)
		 -> 로그인 X? 로그인 후 이용해주세요 */
		
		System.out.println("\n******** 회원정보 조회 ********");
		
		// 1) 로그인 여부 확인
		if(loginMember == null) {
			return "로그인 후 이용해주세요";
		}
		
		//2) 로그인 되어있는 경우
		String str = "이름 : " + loginMember.getMemberName();
		str += "\n아이디 : " + loginMember.getMemberId();
		str += "\n나이 : " + loginMember.getMemberAge() + "세";
		
		return str;
		
	}
	
	// 회원정보 수정 기능
	public int updateMember() {
		
		System.out.println("\n******** 회원정보 수정 ********");
		
		/* 1) 로그인 여부 확인
		 로그인이 되어있지 않으면 -1 반환 */
		if(loginMember == null) {
			return -1;
		}
		
		/* 2) 로그인이 되어 있을 때
		  2-1) 수정할 회원 정보 입력 받기 (이름, 나이) */
		System.out.println("수정할 이름 입력 : ");
		String inputName = sc.next();

		System.out.println("수정할 나이 입력 : ");
		int inputAge = sc.nextInt();
		
		/* 2-2) 비밀번호를 입력받아 현재 로그인한 회원의
		  그것과 일치하는지 확인 */
		System.out.println("비밀번호 입력 : ");
		String inputPw = sc.next();
		
		if( inputPw.equals(loginMember.getMemberPw()) ) {
			/* 비밀번호 일치하는 경우
			 로그인한 회원의 이름과 나이 정보를 수정하기 위해
			 입력받은 값으로 변경 후 1 반환 */
			loginMember.setMemberName(inputName);
			loginMember.setMemberAge(inputAge);
			
			return 1;
			
		} else {
			// 비밀번호가 다를 경우 0 반환
			return 0;
		}
		
		
		
	}
	
	
	
	
	
	

}
