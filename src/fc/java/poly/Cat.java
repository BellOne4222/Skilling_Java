package fc.java.poly;

public class Cat extends Animal { // Animal->eat();
	// 재정의를 하지 않음(x) --->오류입니다(재정의를 하세요)
	// 부모가 추상적이기 때문에 재정의를 반드시 해야한다.-> 구현해야한다. 바디({   })를 만들면된다.
	public void night(){
		System.out.println("밤에 눈에서 빛이난다");
	}
	@Override
	public void eat() {
		System.out.println("고양이처럼먹다.");
	}
}