package fc.java.course2.part2;

import java.util.ArrayList;

public class CollectionBasic {
	public static void main(String[] args) {
		// ArratList에 10,20,30,40,50 5개의 정수(int)를 저장하고 출력하세요
		// ArrayList는 클래스만 넣을 수 있기 때문에 int 저장은 불가 -> Wrapper 클래스를 통해 Integer로 저장해야한다
		// 지금은 Auto boxing을 통해서 int를 자동으로 Integer타입으로 저장
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10); // auto boxing으로 원래 new Integer(10)으로 넣어야하지만 자동으로 Integer로 변환해서 저장 가능
		list.add(20); // auto boxing으로 원래 new Integer(10)으로 넣어야하지만 자동으로 Integer로 변환해서 저장 가능
		list.add(30); // auto boxing으로 원래 new Integer(10)으로 넣어야하지만 자동으로 Integer로 변환해서 저장 가능
		list.add(40); // auto boxing으로 원래 new Integer(10)으로 넣어야하지만 자동으로 Integer로 변환해서 저장 가능
		list.add(50); // auto boxing으로 원래 new Integer(10)으로 넣어야하지만 자동으로 Integer로 변환해서 저장 가능

		// int형으로 바로 값이 나올 수 있는 이유는 auto unboxing이 내부에서 작동하기 때문이다
		for (int data : list){
			System.out.println(data);
		}
	}
}
