package fc.java.part4;

// 사원
public class Employee{ // object 클래스 -> 최상위 클래스 ( extends Object)
	private String name;
	private int age;
	private String phone;
	private String empDate;
	private String dept;
	private boolean marriage;
	
	public Employee(){
		super(); // 상위 클래스의 생성자를 호출 -> new Object()에 의해서 객체가 생성된다.
	}

	public Employee(String name, int age, String phone, String empDate, String dept, boolean marriage) {
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.empDate = empDate;
		this.dept = dept;
		this.marriage = marriage;
	}

	// toString
	@Override
	public String toString() {
		return "Employee{" +
			"name='" + name + '\'' +
			", age=" + age +
			", phone='" + phone + '\'' +
			", empDate='" + empDate + '\'' +
			", dept='" + dept + '\'' +
			", marriage=" + marriage +
			'}';
	}
}
