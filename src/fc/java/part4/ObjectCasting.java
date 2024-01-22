package fc.java.part4;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

public class ObjectCasting {
	public static void main(String[] args) {
		// Animal-->Dog, Cat
		Animal ani=new Dog(); // 업케스팅(Upcasting)
		ani.eat();

		ani=new Cat(); // 업케스팅(Upcasting)
		ani.eat();
	}
}
