package Day08.Ex01_TryCatch;

import java.util.Scanner;

/**
 * 예외 처리
 * ClassCastException
 * : 클래스 간의 타입 변환 시, 올바르지 않은 변환으로 인해 발생하는 예외
 * - 업캐스팅이 전제되지 않은 다운 캐스팅을 하는 경우
 * - 부모/자식 관계가 아닌 클래스로 캐스팅 하는 경우
 */

class Animal {}

class Dog extends Animal{}

class Cat extends Animal {}

public class ClassCast {
	// (부모 클래스) 			(자식 클래스)
	// Animal      <---    	Dog, Cat
	// Animal = Cat					[업캐스팅]
	// Dog = (Dog) Animal<Cat> 		[다운 캐스팅] (불가)
	// cat 에서 업캐스팅한 Animal을 Dog로 다운 캐스팅 할수 없다.
	// -cat을 Dog로 타입 변환 할수 없다.
	
	public static void changeToDog(Animal animal) { // 매개변수를 받는 과정에서 업캐스팅
		
		// 예외 메시지 : java.lang.ClassCastException
		// 예외 상황 : 타입을 변환할 수 없는 클래스로 변환 시도 시 발생하는 예외
		
		Dog dog = (Dog) animal;
	}

	public static void main(String[] args) {
		Dog dog = (Dog) animal;
	}
	
}
