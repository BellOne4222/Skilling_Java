package fc.java.course2.part2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortCompareTest {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("홍", "김", "이");

		// String::compareTo -> 특정 객체의 메서드를 참조
		Collections.sort(names, String::compareTo);
		System.out.println(names);
	}
}
