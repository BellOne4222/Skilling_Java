package fc.java.model2;

public class ObjectArr<T> { // <T>는 가변 타입 나중에 재정의로 타입 결정
	private T[] array;
	private int size;

	public ObjectArr(int size){
		array = (T[])new Object[size]; // 어떤 타입이 올지 모르기 때문에 일단 T[] 타입으로 캐스팅해서 생성
	}

	public void set(int index, T value){
		array[index] = value;
		size++;
	}

	public T get(int index){
		return array[index];
	}

	public int size(){
		return size;
	}
}
