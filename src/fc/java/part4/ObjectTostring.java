package fc.java.part4;

import fc.java.poly.Board;

public class ObjectTostring {
	public static void main(String[] args) {
		Board b = new Board();
		b.setTitle("게시글입니다");
		// System.out.println(b.getTitle());

		System.out.println(b.toString()); // Object를 상속 받았기 때문에 b의 번지가 나온다.
		// fc.java.poly.Board@776ec8df(재정의 하기 전)
		// 게시글입니다 -> 재정의 한 후(toString())
	}
}
