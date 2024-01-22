package fc.java.part4;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

public class PolyArrayTest {
	public static void main(String[] args) {
		Dog d=new Dog();
		Cat c=new Cat();


		// Dog, Cat 을 저장할 배열을 생성하시오.
		// Animal[] ani={new Dog(), new Cat()};
		// 다형성 배열
		Animal[] ani = new Animal[2];
		ani[0] = d;
		ani[1] = c;
		display(ani);
	}

	public static void display(Animal[] ani){ // 다형성 인수
		for (int i = 0; i < ani.length; i++) {
			ani[i].eat();
			if(ani[i] instanceof Cat){ // Cat 타입 일때만 night 실행
				((Cat)ani[i]).night();
			}
		}
	}
}
