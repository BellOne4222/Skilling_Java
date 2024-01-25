package fc.java.course2.part1;

import fc.java.model2.A;
import fc.java.model2.B;
import fc.java.model2.C;
import fc.java.model2.ObjectArray;

public class MyObjectArrayTest {
	public static void main(String[] args) {
		// A, B, C 객체를 배열(서로 다른 객체를 저장하는 다형성 배열 사용)에 저장하고 출력하세요

		ObjectArray list = new ObjectArray();
		list.add(new A()); // Upcasting -> Object element = new A(); 형식으로 메모리에 들어간다.
		list.add(new B()); // Upcasting -> Object element = new B(); 형식으로 메모리에 들어간다.
		list.add(new C()); // Upcasting -> Object element = new C(); 형식으로 메모리에 들어간다.

		A a = (A)list.get(0); // 다운캐스팅을 해야 get사용 가능 A <= Object
		a.display();

		B b = (B)list.get(1); // 다운캐스팅을 해야 get사용 가능 B <= Object
		b.display();

		C c = (C)list.get(2); // 다운캐스팅을 해야 get사용 가능 C <= Object
		c.display();

		for (int i = 0; i < list.size(); i++) {
			if(list.get(i) instanceof A){
				((A)list.get(i)).display();
			}else if(list.get(i) instanceof B){
				((B)list.get(i)).display();
			}else{
				((C)list.get(i)).display();
			}
		}
	}
}
