package Day05_Ex03_메소드;

public class CarTest {

	public static void main(String[] args) {
		// 객체 생성
		Car car = new Car();
		car.model = "제네시스";
		car.speed = 130;
		
		System.out.println("model : " + car.model);
		System.out.println("speed : " + car.speed);
	}

}
