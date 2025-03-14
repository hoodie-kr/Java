package Day05_Ex03_메소드;

public class Car {
	
	// 모델명, 속도
	String model;
	int speed;
	
	// - 기본 생성자
	public Car() {
		this("모델명 없음", 0);
	}

	// - model 매개변수 생성자
	public Car(String model) {
		this.model = model;
	}
	
	// - 전체 매개변수 생성자
	public Car(String model, int speed) {
		this.model = model;
		this.speed = speed;
	}
	
	// getter & setter
	// - getter : 변수의 값을 가져오는 메소드
	// - setter : 변수의 값을 지정하는 메소드
	// 게터/세터 이름 : getXXX(), setXXX()
	
	
	
	
}
