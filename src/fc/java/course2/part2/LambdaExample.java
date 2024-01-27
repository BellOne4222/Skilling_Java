package fc.java.course2.part2;

import fc.java.model2.MathOperation;

public class LambdaExample {
	public static void main(String[] args) {
		/*MathOperation add = new MathOperation() {
			@Override
			public int operation(int x, int y) {
				return x+y;
			}
		};*/

		// 람다식 : 코드가 간결 -> 구현이 쉽다
		MathOperation add = (x, y) -> x+y;
		MathOperation multi = (x, y) -> x*y;
		int result = add.operation(10,20);
		int result1 = multi.operation(10,20);
		System.out.println(result);
		System.out.println(result1);
	}
}
