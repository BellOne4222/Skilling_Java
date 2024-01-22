package fc.java.part4;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

public class OverrideTest {
	public static void main(String[] args) {

		// Upcasting : Dog의 소스코드를 주지 않고 Dog의 클래스와 상속 관계인 것만 알면 Animal 부모 클래스로 Dog 자식 클래스를 사용하기 위해서 사용
		Animal ani = new Dog(); // 부모 클래스로 Dog 자식 클래스 사용
		ani.eat(); // Animal---(동적바인딩)-->Dog

		ani=new Cat(); // 같은 부모 클래스를 사용하기 때문에 Animal 선언 x
		ani.eat();// Animal---(동적바인딩)-->Cat
		// ani.night(); // Downcasting(다운캐스팅)
		// Cat c = (Cat)ani;
		// c.night();
		((Cat)ani).night(); // Downcasting
	}
}
