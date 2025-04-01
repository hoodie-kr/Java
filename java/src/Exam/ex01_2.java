package Exam;

class Calculator{
	int a;
	int b;
	
	public int add(int a, int b) {
		return a+b;
	}
	public int minus(int a, int b) {
		return a-b;
	}
	public int multply(int a, int b) {
		return a*b;
	}
	public int devide(int a, int b) {
		if(b==0) {
			System.out.println("0으로 나눌수 없습니다.");
			return 0;
		}
		return a/b;
	}
}
public class ex01_2 {

	public static void main(String[] args) {
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

	}

}
