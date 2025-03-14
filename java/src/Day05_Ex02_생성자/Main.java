package Day05_Ex02_생성자;

public class Main {

	public static void main(String[] args) {
		// Student 객체 생성
	    Student student = new Student();
	    student.name = "고건우";
	    student.age = 22;
	    student.major = "컴퓨터공학과";
	    student.stdNo = "20250001";
	    
	    System.out.println(":::::::::::::::학생1 ::::::::::::::::");
	    System.out.println("학생1 - 이름 : " + student.name);
	    System.out.println("학생1 - 나이 : " + student.age);
	    System.out.println("학생1 - 전공 : " + student.major);
	    System.out.println("학생1 - 학번 : " + student.stdNo);
	    student.study("임베디드 시스템");
	    
	    System.out.println("학생1 - 중간고사 점수 : " + student.getAverage(100, 90));
	    
	    Student student2 = new Student();
	    student2.name = "고건우";
	    student2.age = 22;
	    student2.major = "컴퓨터공학과";
	    student2.stdNo = "20250001";
	    
	    System.out.println(":::::::::::::::학생1 ::::::::::::::::");
	    System.out.println("학생1 - 이름 : " + student2.name);
	    System.out.println("학생1 - 나이 : " + student2.age);
	    System.out.println("학생1 - 전공 : " + student2.major);
	    System.out.println("학생1 - 학번 : " + student2.stdNo);
	    student2.study("임베디드 시스템");
	    
	    System.out.println("학생1 - 중간고사 점수 : " + student2.getAverage(100, 90));

	}

}
