package Day05_Ex03_메소드;

import java.util.Scanner;

public class CalulatorTest {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		Scanner  sc = new Scanner(System.in);
		
		System.out.print("a : ");
		int a = sc.nextInt();
		System.out.print("b : ");
		int b = sc.nextInt();
		
		// 덧셈 메소드 호출
		int result1 = calculator.plus(a, b);
		System.out.println("a + b = " + result1);
		// 뺄셈 메소드 호출
		int result2 = calculator.minus(a, b);
		System.out.println("a - b = " + result2);
		
		//
		
		System.out.print("x : ");
		double x = sc.nextDouble();
		System.out.print("y : ");
		double y = sc.nextDouble();
		
		// 곱셈 메소드 호출
		double result3 = calculator.multiple(x, y);
		System.out.println("x * y = " + result3);
		System.out.printf("x * y = %5.2f \n", result3);
	
		// 나눗셈 메소드 호출
		double result4 = calculator.multiple(x, y);
		System.out.println("x / y = " + result4);
		System.out.printf("x / y = %5.2f \n", result4);
		
		// 나머지 메소드 호출
		int result5 = calculator.remain(a, b);
		System.out.println("x%y =" + result5);
		
		
		int arr[] = {10,20,30,40,50};
		System.out.println("합계 : " + calculator.sum(arr));
		System.out.println("합계 : " + calculator.avg(arr));
		sc.close();
	}

}
