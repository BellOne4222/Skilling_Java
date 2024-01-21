package fc.java.part3;

import fc.java.model.AllStatic;

public class AllStaticTest {
	public static void main(String[] args) {

		// 메서드가 전부 static으로 설정되어 있지 않을 때
		// AllStatic의 생성자를 private으로 만들면 불가능
		//AllStatic st=new AllStatic();
		//System.out.println(st.hap(10,20)); // 30
		//System.out.println(st.max(10,20)); // 20
		//System.out.println(st.min(10,20)); // 10

		// 메서드가 전부 static으로 설정되었을 때, 생성자를 private으로도 선언 할 수 있다.
		// 모든 멤버가 static 일 때, 메서드를 모두 static으로 만들어서 객체 생성을 못하게 만들 수 있다.
		// 아래 방식으로 코드를 구현해야 한다.
		System.out.println(AllStatic.hap(10,20));
		System.out.println(AllStatic.max(10,20));
		System.out.println(AllStatic.min(10,20));

		//System sys=new System(); // private
		//System.
		//Math m=new Math(); // private
		System.out.println(Math.max(30,60)); // 60
		System.out.println(Math.min(40,10)); // 10
	}
}
