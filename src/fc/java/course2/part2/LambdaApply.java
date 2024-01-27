package fc.java.course2.part2;

import fc.java.model2.StringOperation;

public class LambdaApply {
	public static void main(String[] args) {
		
		// 람다 표현식을 메서드 내에서 사용
		StringOperation toUpperCase = s -> s.toUpperCase();
		StringOperation toLowerCase = s -> s.toLowerCase();

		String input = "Lambda Expressions";
		System.out.println(processString(input, toUpperCase));
		System.out.println(processString(input, toLowerCase));
	}
	
	// 메서드의 매개변수로 전달
	public static String processString(String input, StringOperation operation){
		return operation.apply(input);
	}
}
