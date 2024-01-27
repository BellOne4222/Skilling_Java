package fc.java.course2.part2;

import java.util.ArrayList;

public class ListExample {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(); // 중복이 가능하고 순서가 있는 ArrayList
		list.add("apple"); // new String("apple") 객체가 내부에서 만들어진다., 추가
		list.add("banana"); // new String("apple") 객체가 내부에서 만들어진다.
		list.add("cherry"); // new String("apple") 객체가 내부에서 만들어진다.
		list.add("banana"); // new String("apple") 객체가 내부에서 만들어진다.

		System.out.println(list.get(0)); // 정보 조회
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(list.size()-1) );

		list.remove(0); // 삭제
		list.set(1, "orange"); // 수정

		for(String str : list){
			System.out.println(str);
		}
	}
}
