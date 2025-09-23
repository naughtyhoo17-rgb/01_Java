package edu.kh.oop.cls.model.vo;

public class User {
	
	/* 속성 (필드 영역에 변수로 정의) 
	 아이디, 비밀번호, 이름, 나이, 성별 -> 추상화 진행
	 클래스 외부에서 데이터에 직접 접근 불가 원칙
	  ; 필드의 접근제한자를 모두 private 작성 -> 캡슐화 진행 */
	private String userId;
	private String userPw;
	private String userName;
	private int userAge;
	private char userGender;
	
	// 기본생성자 (== 매개변수가 없는 생성자) / 자동완성 ctrl+space+enter
	public User() {
		System.out.println("기본생성자로 User 객체 생성");
		
			// 필드 초기화
			userId = "user01";
			userPw = "pass01";
			userName = "홍길동";
			userAge = 20;
			userGender = '남';
	}
	
	/* 매개변수 생성자
	 ** 매개변수 : 생성자나 메서드 호출 시 () 안에 작성되어
		 전달되는 값을 저장하고 있는 변수
	 -> 호출과 전달의 매개체 역할*/
	public User(String userId, String userPw) { 
		
		// 필드 초기화
		this.userId = userId;
		this.userPw = userPw;
		
		/* this 참조변수 
		 ; 객체가 자기 자신을 참조할 수 있도록 하는 변수
		 -> 왜 사용? 필드명과 매개변수명이 같은 경우
		 이를 구분하기 위해 사용 */
		
	}
	
	/* 매개변수 생성자 자동완성
	 alt + s -> Generate constructor using fields...
	 -> generate 클릭 */
	// 필드를 전부 초기화하는 목적의 매개변수 생성자	
	public User(String userId, String userPw,
			String userName, int userAge, char userGender) {
		
		/* this() 생성자
		 같은 클래스의 다른 생성자를 호출할 때 사용
		 왜 사용? -> 중복 코드 제거, 코드 길이 감소, 재사용성 증가
		 단점 : 가독성 bad
		 주의사항 : 반드시 생성자 내에서 첫 번째 줄에 작성해야 함 */
		this(userId, userPw);
	//	super(); // 여기선 없어도 되고 상속 파트에서 배움
		
		//this.userId = userId;
		//this.userPw = userPw;
		this.userName = userName;
		this.userAge = userAge;
		this.userGender = userGender;
		
	}

	// 기능 (메서드)
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public char getUserGender() {
		return userGender;
	}
	public void setUserGender(char userGender) {
		this.userGender = userGender;
	}
	
	/* 자바는 기본적으로 필드명, 생성자명, 메서드명, 변수명의
	 중복을 허용하지 않음. 
	 
	 ** 오버로딩 (Overloading)
	 : 클래스 내에 동일한 이름의 메서드(생성자 포함)를
	 여러개 작성하는 기법 
	 
	  [오버로딩 조건]
	  1) 메서드(생성자)명 동일
	  2) 매개변수의 개수/ 타입(자료형)/ 순서 하나라도 달라야 */
	
	/* 생성자(Constructor)
	 - new 연산자를 통해서 객체를 생성할 때
	 생성된 객체의 필드값 초기화 & 지정된 기능 수행
	 
	 - 생성자 작성 규칙
	 1) 생성자의 이름은 반드시 클래스명과 같아야
	 2) 반환형이 존재하지 않음
	 
	 - 생성자 종류
	  1) 기본 생성자
	  2) 매개변수 생성자
	  
	 생성자가 하나도 없을 때 컴파일러가 기본생성자 생성해 줌 */
	
	
	
	

}
