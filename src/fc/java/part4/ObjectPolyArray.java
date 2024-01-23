package fc.java.part4;

import fc.java.poly.A;
import fc.java.poly.B;

public class ObjectPolyArray {
	public static void main(String[] args) {
		// A, B 클래스를 저장할 배열을 생성하세요
		Object[] obj = new Object[2]; // 다형성 배열
		obj[0] = new A();
		// ((A)obj[0]).printGo();

		obj[1] = new B();
		// ((B)obj[1]).printGo();

		display(obj);

	}

	private static void display(Object[] obj) {
		for (int i = 0; i < obj.length; i++) {
			if (obj[i] instanceof A){
				((A)obj[i]).printGo();
			}else{
				((B)obj[i]).printGo();
			}

		}
	}
}
