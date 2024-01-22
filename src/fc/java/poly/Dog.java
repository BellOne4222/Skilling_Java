package fc.java.poly;

public class Dog extends Animal { // Animal->eat(); 추상메서드
	// 재정의를 하지 안음(x) --->오류입니다(재정의를 하세요)
	// 부모가 추상적이기 때문에 재정의를 반드시 해야한다.-> 구현해야한다. 바디({   })를 만들면된다.
	public void eat(){
		System.out.println("개처럼먹다");
	}
}