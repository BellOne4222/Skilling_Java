package fc.java.course2.part2;

public class WrapperTest {
	public static void main(String[] args) {
		// 정수형 변수에 10을 저장하세요
		int a = 10; // 기본 자료형
		// Integer aa = new Integer(10); // 사용자 정의 자료형
		Integer aa = 10; // Integer는 클래스 -> auto-boxing, 메모리에 Integer 객체가 생성되고 10이 저장됨
		System.out.println(aa.intValue()); // intValue() : Unboxing(Integer -> Int) : 메모리의 10이라는 Int값을 하나 꺼내는 함수

		Integer bb = 20; // auto-boxing
		int b = bb; // Integer 안의 Int의 20을 자동으로 b에 할당 가능 -> auto-unboxing

		float f = 10.5f;
		Float ff = 45.6f; // auto-boxing
		System.out.println(ff.floatValue()); // auto-unboxing
		float aff = ff; // auto-unboxing
		System.out.println(aff);

	}
}
