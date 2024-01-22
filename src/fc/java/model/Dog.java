package fc.java.model;

public class Dog extends Animal{

	public Dog(){
		super(); // new Animal()
	}
	
	// 부모가 가진 eat를 재정의(Override)
	public void eat(){
		System.out.println("개처럼먹다");
	}
}
