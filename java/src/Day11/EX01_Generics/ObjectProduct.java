package Day11.EX01_Generics;

class Student {}
class Developer {}

class Person {
	private Object object = new Object();
	
	public Object getObject() {
		return object;
	}
	
	public void setObject(Object object) {
		this.object = object;
	}
}
public class ObjectProduct {
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.setObject( new Student() );
		// 단점 : 다시 Student 타입으로 변환해서 사용해야한다.
		Student student = (Student) person1.getObject();
		
		Person person2 = new Person();
		person2.setObject( new Developer() );
		Developer developer = (Developer) person2.getObject();
		
		// 단점2
		// : 타입 변환이 불가능한 상황이 발생할 수 있다.
		Student student2 = (Student) person2.getObject();	
		}

}
