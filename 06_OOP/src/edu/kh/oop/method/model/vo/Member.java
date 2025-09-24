package edu.kh.oop.method.model.vo;

public class Member { // 회원 클래스
	
	// 속성 + 기능 
	 //필드 (== 속성)
	 private String memberId;  // 아이디
	 private String memberPw;  // 비밀번호
	 private String memberName; // 이름
	 private int memberAge; 	// 나이
	 
	 
	 
	 
	 //기능 (== 메서드/생성자)
	 
	 public Member() {}
	 
	 public Member(String memberId, String memberPw,
			 	String memberName, int memberAge) {
	
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAge = memberAge;
	}



	 public String getMemberId() {
		 return memberId;
	 }
	 public void setMemberId(String memberId) {
		 this.memberId = memberId;
	 }
	 public String getMemberPw() {
		 return memberPw;
	 }
	 public void setMemberPw(String memberPw) {
		 this.memberPw = memberPw;
	 }
	 public String getMemberName() {
		 return memberName;
	 }
	 public void setMemberName(String memberName) {
		 this.memberName = memberName;
	 }
	 public int getMemberAge() {
		 return memberAge;
	 }
	 public void setMemberAge(int memberAge) {
		 this.memberAge = memberAge;
	 }
	 
	 /* Object 클래스 : 모든 클래스의 최상위 부모
	  Object.toString() : 객체의 위치 + 주소값을 해시코드 형태로 반환 */
	 
	 // Override : 부모가 가진 메서드를 자식이 재정의
	 
	 /* 어노테이션(@) : 컴파일러 인식용 주석
	 	@Override : 메서드가 부모 클래스의 메서드를 "정확히"
	  			   문법에 맞게 재정의(오버라이딩) 했는지 검사하는 것 */
	 @Override 
		public String toString() {
		 	return memberId + " / " + memberName + " / " 
		 			+ memberAge + "세";
			// 객체의 주소값을 리턴하는 구문
		}
	 
	 /* toString() 메서드 : 객체가 문자열로 변환되어야 할 때 사용
	  -> 보통 객체의 필드값을 출력하는 용도로 오버라이딩하여 사용 */
	 
	 
	 
	 
	 
}
