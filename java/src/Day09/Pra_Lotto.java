package Day09;

import java.util.Scanner;

public class Pra_Lotto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1. 첫째 줄: 로또 당첨 번호 6개와 보너스 번호 1개
		int[] num = new int[6];
		for (int i = 0; i < 6; i++) {
			num[i] = sc.nextInt(); // 당첨 번호 입력 받기
		}
		int bonusNumber = sc.nextInt(); // 보너스 번호 입력 받기

		// 2. 둘째 줄: 지혜가 가지고 있는 로또 번호 6개
		int[] myNumbers = new int[6];
		for (int i = 0; i < 6; i++) {
			myNumbers[i] = sc.nextInt(); // 지혜의 로또 번호 입력 받기
		}

		// 3. 당첨된 번호 개수 계산
		int matchCount = 0;
		boolean bonusMatch = false;
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (myNumbers[i] == num[j]) {
					matchCount++;
					break; // 중복 계산 방지
				}
			}
		}

		// 4. 보너스 번호가 맞는지 확인
		boolean bonusMatch1 = false;
		for (int i = 0; i < 6; i++) {
			if (myNumbers[i] == bonusNumber) {
				bonusMatch1 = true;
				break;
			}
		}

		// 5. 결과 출력
		if (matchCount == 6) {
			System.out.println(1); // 1등
		} else if (matchCount == 5 && bonusMatch1) {
			System.out.println(2); // 2등
		} else if (matchCount == 5) {
			System.out.println(3); // 3등
		} else if (matchCount == 4) {
			System.out.println(4); // 4등
		} else if (matchCount == 3) {
			System.out.println(5); // 5등
		} else {
			System.out.println(0); // 꽝
		}

		sc.close();
	}
}