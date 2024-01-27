package fc.java.course2.part2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamExample {

	public static boolean isEven(int number){
		return number % 2 == 0;
	}

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); // asList로 배열로 변환
		// Predicate : 함수형 인터페이스 정의
		Predicate<Integer> isEven = n -> n % 2 == 0;
		int sumOfSquares = numbers.stream() // 배열을 스트림으로 변환
			// .filter(isEven) // 짝수로 필터링
			.filter(StreamExample::isEven) // 메서드 참조
			.sorted() // 정렬
			.map(n -> n * n) // 각 원소를 제곱해서 저장
			.reduce(0, Integer::sum); // 0을 초기값으로 sum메서드 참조해서 모두 더하기
		System.out.println(sumOfSquares);

	}
}
