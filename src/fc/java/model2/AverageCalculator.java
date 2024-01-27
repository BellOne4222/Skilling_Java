package fc.java.model2;

public class AverageCalculator<T extends Number> {
	private T[] numbers; // Number를 상속하여서 Number의 타입밖에 올 수 없다.

	public AverageCalculator(T[] numbers){
		this.numbers = numbers;
	}

	public double calculateAverage() {
		double sum = 0.0;
		for(T number : numbers){
			sum += number.doubleValue();
		}

		return sum / numbers.length;
	}
}
