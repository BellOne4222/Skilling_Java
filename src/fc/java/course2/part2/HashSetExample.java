package fc.java.course2.part2;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();

		set.add("Apple");
		set.add("Banana");
		set.add("Cherry");
		set.add("Apple"); // 중복 x

		System.out.println(set.size()); // 3

		for(String str : set){
			System.out.println(str);
		}

		set.remove("Banana");
		for(String str : set){
			System.out.println(str);
		}

		boolean contains = set.contains("Cherry");
		System.out.println(contains); // true

		set.clear();
		boolean isEmpty = set.isEmpty();
		System.out.println(isEmpty); // true

	}
}
