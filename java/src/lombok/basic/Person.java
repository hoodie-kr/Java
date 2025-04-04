package lombok.basic;

import lombok.*;

// 롬복
// : 롬복은 어노테이션을 이용하여 코드를 자동 생성해준다.

//@NoArgsConstructor			: 기본생성자
//@AllArgsConstructor			: 모든 매개변수 생성자
//@RequiredArgsConstructor 		: 필수 생성자
//@NonNull						: null 이 들어오지 못하도록 지정
//							 	: 필수 생성자의 매개변수로 지정


//@getter						: getter 메소드 자동생성
//@Setter						: setter 메소드 자동생성
//@ToString						: toString 메소드 자동생성
//@Data							: @getter, @setter, @Tostring
//							    :@RequiredArgsConstructor,@EqualsHashCode

@Getter

@Data
@ToString

public class Person {
	
	@NonNull private String name;
	@NonNull private int age;
	private double height;
	private double weight;

}
