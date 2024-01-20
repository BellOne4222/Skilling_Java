package fc.java.part3;

import fc.java.model.PersonVO;

public class ToStringPrint {
	public static void main(String[] args) {
		PersonVO vo = new PersonVO("홍길동", 34,"010-5555-5555");
		System.out.println(vo.toString());
		System.out.println(vo); // toString() 생략가능(객체가 가진 전체 데이터를 출력하라는 것으로 컴파일러가 인식)
	}
}
