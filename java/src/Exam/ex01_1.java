package Exam;

class Student{
	String name;
	int age;
	int num;
	
	public void setStudentInfo(String name, int age, int num) {
		this.name = name;
		this.age = age;
		this.num = num;
	}
	
	public void getStudentInfo() {
		System.out.println("이름:" + name);
		System.out.println("나이:" + age);
		System.out.println("학번:" + num);
	}
	
	
	
}
public class ex01_1 {

	public static void main(String[] args) {
		Student student = new Student();
		
		student.setStudentInfo("홍길동", 29, 20250001);
		student.getStudentInfo();
	}

}
