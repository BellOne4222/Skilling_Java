package fc.java.model;

public class Cat extends Animal{

	public Cat(){
		super(); // new animal;
	}

	public void night(){
		System.out.println("밤에 눈에서 빛이 난다.");
	}

	// 부모가 가진 eat를 재정의(Override)
	public void eat(){
		System.out.println("고양이처럼 먹다");
	}
}
