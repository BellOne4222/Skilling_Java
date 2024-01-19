package fc.java.part3;

public class PersonAccessTest {

	public static void main(String[] args) {
		// Q. Person 클래스에 이름, 나이, 전화번호를 저장하고 출력하세요.

		Person p = new Person(); // 객체 생성, p를 통해서 Person 클래스 접근
		p.name="홍길동"; // Person에서 public으로 선언되어 있으므로 외부에서 접근 가능
		p.age=1000; // ? public으로 선언을 해서 잘못된 값을 넣어도 상관없다. (잘못된 정보 변경 가능성 있음)
		p.phone="010-1111-1111";
		System.out.println(p.name+"\t"+p.age+"\t"+p.phone);

	}
}
