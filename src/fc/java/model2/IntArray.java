package fc.java.model2;

import java.util.Arrays;

public class IntArray {
	private static final int DEFAULT_CAPACITY = 5; // static final은 나중에 변경 불가능(수정 불가) -> final을 붙이면 상수가 된다
	private int[] elements;
	private int size = 0;

	// 생성 동작
	public IntArray(){
		elements = new int[DEFAULT_CAPACITY]; // 5개 크기 배열
	}

	// 저장하는 동작
	public void add(int element){
		if (size == elements.length){
			// 크기를 2배로 늘리는 작업
			ensureCapacity();
		}
		// 크기 확인
		elements[size++] = element;
	}

	// 데이터를 얻는 동작
	public int get(int index){ // -1, 5~ 이면 에러 발생
		// index 체크
		return elements[index];
	}

	// 원소의 개수를 넘겨주는 동작
	public int size(){
		return size;
	}

	//
	public void ensureCapacity(){
		int newCapacity = elements.length * 2;
		elements = Arrays.copyOf(elements, newCapacity); // 복사 : Arrays.copyOf(); 복사한 배열은 elements로 초기화
	}

}
