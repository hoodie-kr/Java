package Note14;

class Person {
    String name;
    int age = 10;
    
    void work() {
        System.out.println("일을 합니다.");
    }
}

class Student extends Person {
    String major;
    int age = 20;
    
    void work() {
        System.out.println("공부합니다.");
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Student();  // Person 타입으로 Student 객체 생성
        person.work();  // 동적 메서드 호출: Student 클래스의 work() 호출
        System.out.println(person.age);  // Person 클래스의 age 출력
    }
}