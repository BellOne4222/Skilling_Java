package fc.java.model;

public class MemberDTO { // class는 private 선언 불가
	public String name;
	private int age; // 정보은닉
	public String phone;
	public void play() {
		System.out.println("운동을 한다.");
	}
}
