package fc.java.course2.part2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamApiTest {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};

		// IntStream stream = Arrays.stream(numbers);
		int sumOfEvens = Arrays.stream(numbers) // 배열을 스트림을 변환
			.filter(n -> n % 2 == 0)
			.sum();

		System.out.println(sumOfEvens);

		int[] evenNumbers = Arrays.stream(numbers)
			.filter(n -> n % 2 == 0)
			.toArray(); // 스트림을 배열로 변환

		for(int even : evenNumbers){
			System.out.println(even);
		}
	}

}
