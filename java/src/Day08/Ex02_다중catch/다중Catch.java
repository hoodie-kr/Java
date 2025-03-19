package Day08.Ex02_다중catch;

import java.util.Scanner;

public class 다중Catch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		char[] char1 = str1.toCharArray();  // String --> char[] 변환
		char[] char2 = str2.toCharArray();  //"10"    --> [1][0]
		
		// char1   --> ['1']['0']
		// input1  --> ["1"]["0"]
		String[] input1 = new String[char1.length];
		String[] input2 = new String[char2.length];
		for (int i = 0; i<char1.length; i++) {
			input1[i] = char1[i] + "";
		}
		for(int i=0; i<char1.length; i++) {
			input2[i] = char2[i] + "";
		}
		// 다중 catch
		// : 여러 예외를 각각 다른 catch 블록으로 처리하는 것
		// * 상위 예외 클래스가 하위 예외 클래스보다 아래쪽에 위치해야 한다.
		try {
			System.out.println(input1[0] + input1[1]);
			System.out.println(input2[0] + input2[1]);
		
			int value1 = Integer.parseInt(str1);
			int value2 = Integer.parseInt(str1);
			int result = value1 + value2;
			System.out.println(str1 + " + " + str2 + " = " + result);
		} catch (Number )

	}

}
