package Day06;

import Day06.Ex03_중첩클래스.A;

public class NestedClass {
	public static void main(String[] args) {
		// 아우터 클래스인 A 객체 생성
		A a = new A();
		a.a= 10;
		a.b = 20;
		System.out.println("A의 b : " + a.b);
		System.out.println("A의 a : " + a.a);
		a.aMethod();
		
		// 이너 클래스인 B 객체 생성
		// * 이너 객체 생성시, 아우터 객체를 통하여 객체를 생성할 수 있다.
		A.B b = a.new B();
		b.x = 30;
		b.y = 40;
		System.out.println("B의 x : " + b.x);
		System.out.println("B의 y : " + b.y);
		b.bMethod();
	}
}
