package Day09;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        String str = sc.next(); // 사용자로부터 입력 받은 문자열

	        StringBuilder result = new StringBuilder(); // 결과를 저장할 StringBuilder

	        // 문자열을 하나씩 확인하면서 대소문자를 반전시킴
	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i); // 각 문자를 가져옴
	            if (Character.isLowerCase(c)) {
	                result.append(Character.toUpperCase(c)); // 소문자는 대문자로 변환
	            } else {
	                result.append(Character.toLowerCase(c)); // 대문자는 소문자로 변환
	            }
	        }

	        // 변환된 문자열 출력
	        System.out.println(result.toString());
	}

}