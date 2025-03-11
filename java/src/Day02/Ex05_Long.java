package Day02;

public class Ex05_Long {

	public static void main(String[] args) {
		// int (4byte : 32bits) : 2^32개 : 약 42억 개
		// int 수 표현 범위 				: -21억xxx ~ 21억 xxx
		
		// long (8bytes : 64bits) : 2^64 개
		long ln1 = 1000;
		long ln2 = 2100000000;
		long ln3 = 2200000000L;
		
		System.out.println("ln1 : " + ln1);
		System.out.println("ln2 : " + ln2);
		System.out.println("ln3 : " + ln3);
		
	}
}
