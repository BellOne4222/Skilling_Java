public class CallByReferenceExam {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		int result = addArray(a);
		System.out.println(result);
	}

	// 매개변수로 정수형 배열을 받아서 배열의 총합을 구하여 리턴하는 메서드를 정의 하세요

	public static int addArray(int[] a){
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
}
