package fc.java.part4;

import fc.java.poly.A;
import fc.java.poly.B;

public class ObjectPolyArg {
	public static void main(String[] args) {
		A a = new A();
		display(a);
		B b = new B(); // Upcasting
		display(b);
	}

	// Upcasting을 하면 Downcasting을 해야한다.
	private static void display(Object obj) { // 다형성 인수 활용
		if (obj instanceof A){
			((A)obj).printGo(); // Downcasting
		}
		else{
			((B)obj).printGo();
		}

	}

}
