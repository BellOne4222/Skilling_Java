package fc.java.part2;

public class CallByReference {
	public static void main(String[] args) {
		float a = 56.7f;
		float b = 78.9f;

		floatAdd(a, b);
	}

	// 매개변수로 2개의 실수를 받아서 총합을 구하여 출력하는 메서드를 정의
	public static void floatAdd(float a, float b){
		float hap = a + b;
		System.out.println(hap);
	}
}
