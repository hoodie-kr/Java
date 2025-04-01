package Yeje.y1;

public class num4 {
// break문 없아 switch-case문 사용하기
	
	public static void main(String[] args) {
		String medal = "Gold";
		
		switch(medal) {
		case "Gold" -> System.out.println("금메달입니다.");
		case "Silver" -> System.out.println("은메달입니다.");
		case "Bronze" -> System.out.println("동메달입니다.");
		default -> System.out.println("노메달입니다.");
		}

	}

}
