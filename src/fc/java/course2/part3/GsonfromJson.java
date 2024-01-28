package fc.java.course2.part3;

import com.google.gson.Gson;

import fc.java.model3.Member;

public class GsonfromJson {
	public static void main(String[] args) {
		String json = "{\"name\":\"홍길동\",\"age\":30,\"email\":\"bit@empas.com\"}";
		// JSON -> Object(Member)
		Gson gson = new Gson();
		Member mvo = gson.fromJson(json, Member.class); // fromJson(문자열, 클래스명) : 문자열을 클래스 객체로 변환
		System.out.println(mvo); // Member{name='홍길동', age=30, email='bit@empas.com'}
	}
}
