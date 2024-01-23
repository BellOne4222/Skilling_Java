package fc.java.model2;

public class MinMaxFinder {

	private MinMaxFinder(){
		// 객체 생성을 막기 위해 private으로 생성자를 구현
	}

	public static int findMin(int[] arr){
		int min = arr[0]; // 초기값
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min){
				min = arr[i];
			}
		}
		return min;
	}

	public static int findMax(int[] arr){
		int max = arr[0]; // 초기값
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < max){
				max = arr[i];
			}
		}
		return max;
	}
}
