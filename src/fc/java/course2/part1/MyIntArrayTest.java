package fc.java.course2.part1;

import fc.java.model2.IntArray;

public class MyIntArrayTest {
	public static void main(String[] args) {
		// 정수 3개를 배열에 저장하고 출력하세요
		IntArray list = new IntArray(); // 5 크기의 정수형 배열
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6); // 에러 발생(리스트의 크기는 5이므로) -> 예외 발생(ArrayIndexOutOfBoundsException) -> 배열의 길이를 2배로 늘려주어야 한다.(ensureCapacity)

		System.out.println(list.get(0)); // 1
		System.out.println(list.get(1)); // 2
		System.out.println(list.get(2)); // 3

		System.out.println(list.size()); // 3

		for (int i = 0; i < list.size(); i++) { // 123
			System.out.println(list.get(i));
		}
	}
}
