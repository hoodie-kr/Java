package Yeje.y1;

public class num2 {

//	switch-case문으로 메달 색 정하기
	public static void main(String[] args) {
		int ranking =1;
		char medalColor;
		
		switch(ranking) {
		case 1: medalColor = 'G';
				break;

		case 2: medalColor = 'S';
				break;
				
		case 3: medalColor = 'B';
				break;
		default:
				medalColor = 'A';
		}
		System.out.println(ranking + "등 메달의 색깔은" + medalColor + "입니다.");

	}

}
