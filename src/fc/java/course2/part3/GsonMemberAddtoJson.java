package fc.java.course2.part3;

import com.google.gson.Gson;

import fc.java.model3.Address;
import fc.java.model3.Person;

public class GsonMemberAddtoJson {
	public static void main(String[] args) {
		Address address = new Address("서울", "대한민국"); // Address 클래스가 중첩
		Person member = new Person("홍길동", 30, "bit@empas.com", address);

		// Person -> JSON
		Gson gson = new Gson();
		String json = gson.toJson(member);
		System.out.println(json); // {"name":"홍길동","age":30,"email":"bit@empas.com","address":{"city":"서울","country":"대한민국"}}
	}
}
