package fc.java.model;

public class CarUtility {

	// 매개변수로 자동차의 정보를 입력받아서 출력하는 메서드를 정의하세요.
	public static void carPrint(CarDTO car){
		System.out.println(car.carSn+"\t"+car.carName+"\t"+car.carPrice+"\t"+car.carOwner+"\t"+car.carYear+"\t"+car.carType);
	}
}
