package Yeje.Generics;

// 제네릭 클래스 정의하기
class Box<T>{
	private T content; 		// content의 타입이 아직 결정되지 않음

	// 생성자
	public Box(T content) {
		this.content = content;
	}

	// 값 반환 메소드
	public T getContent() {
		return content;
	}
    // 값 변경 메소드
	public void setContent(T content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Box contains: " + content;
	}
	
}

public class ex01 {

	public static void main(String[] args) {
	// 정수를 저장하는 제네릭 박스
		Box<Integer> intBox = new Box<>(100);
		System.out.println(intBox.getContent());  // 출력:100

	// 문자열을 저장하는 제네릭 박스
		Box<String> strBox = new Box<>("Hello Generics");
		System.out.println(strBox.getContent());   
		
	// 실수를 저장하는 제네릭 박스
		Box<Double> doubleBox = new Box<>(99.9);
		System.out.println(doubleBox.getContent());
	}

}
