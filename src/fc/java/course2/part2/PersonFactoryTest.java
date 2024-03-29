package fc.java.course2.part2;

import fc.java.model2.Person;
import fc.java.model2.PersonFactory;

public class PersonFactoryTest{
	public static void main(String[] args) {
		
		// Person의 생성자 참조
		PersonFactory personFactory = Person::new;
		Person person = personFactory.create("홍길동", 40);
		System.out.println(person);

		// 익명 내부 클래스
		PersonFactory personFactory1 = new PersonFactory() {
			@Override
			public Person create(String name, int age) {
				return new Person(name, age);
			}
		};

		Person person1 = personFactory1.create("나길동", 32);
		System.out.println(person1);
	}
}
