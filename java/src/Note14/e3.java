package Note14;

import java.util.Scanner;

public class e3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum =0;
		
		
		for (int i = 0; i < 5; i++) {
			int n = sc.nextInt();
			System.out.print("");
			
			if(n<0) 
				continue;
			sum += n;
			
		}
		System.out.println("양수의 합: " + sum);
	
		sc.close();
	}
}
