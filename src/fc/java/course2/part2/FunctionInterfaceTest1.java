package fc.java.course2.part2;

import fc.java.model2.MathOperation;
import fc.java.model2.MathOperationImpl;

// 필요할 때마다 MathOperationImpl을 사용
public class FunctionInterfaceTest1 {
	public static void main(String[] args) {
		MathOperation mo = new MathOperationImpl();
		int result = mo.operation(10, 20);
		System.out.println(result);
	}
}
