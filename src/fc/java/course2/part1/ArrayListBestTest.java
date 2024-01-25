package fc.java.course2.part1;

import java.util.ArrayList;

import fc.java.model2.Book;

public class ArrayListBestTest {
	public static void main(String[] args) {
		// Book 3권을 배열에 저장하고 출력하세요
		// Book[], Object[]
		ArrayList<Book> list = new ArrayList<Book>(); // 기본크기 : 10, 내부에 Object 배열을 가지고 있다.
		list.add(new Book("자바",15000, "한빛","홍길동"));
		list.add(new Book("C++",17000, "대림","이길동"));
		list.add(new Book("Python",16000, "정보","나길동"));

		System.out.println(list.get(0));

		Book vo = list.get(0); // Book
		System.out.println(vo.toString());

		vo = list.get(1); // Book <-- (Book)Object : 내부에 Object배열을 가지고 있기 때문에 다운캐스팅 해야한다.
		System.out.println(vo.toString());

		vo = list.get(2); // Book <-- (Book)Object : 내부에 Object배열을 가지고 있기 때문에 다운캐스팅 해야한다.
		System.out.println(vo.toString());

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)); // 자체가 Object -> Book(JVM에서 자동으로 Book의 toString을 호출해주기 때문에 가능 -> 동적 바인딩)
			// Book b = (Book)list.get(i); // 바로 값을 빼는 경우는 다운캐스팅을 해줘야한다.
		}
	}
}
