package chapter14;

// == 내부(중첩) 클래스(Inner Class, Nested Class) == //
// : 다른 클래스 내부에 선언된 클래스를 의미

// == 장점 ==
// : 코드의 가독성 향상 - 코드의 구조 파악 용이
// : 클래스 간의 관계를 명확하게 표현 - 내부 클래스는 외부 클래스의 멤버(필드, 메서드)에 접근 가능

// == 종류 ==
/* 1. (비정적) 내부 클래스
 * 		: "외부 클래스의 인스턴스"에 속함
 * 			>> 외부 클래스의 인스턴스 변수 및 메서드에 직접 접근 O
 * 
 * 2. 정적(static) 내부 클래스
 * 		: "외부 클래스의 정적 멤버"에 속함
 * 			>> 외부 클래스의 인스턴스 변수에 접근 X
 * 			>> 외부 클래스의 정적 멤버에만 접근 O (외부 클래스의 인스턴스 생성 없이 인스턴스화 가능)
 * 
 * 3. 메서드 내부 클래스 (지역 클래스)
 * 		: "메서드 내에서 정의된 내부 클래스"
 * 			>> 해당 메서드 내에서만! 사용 가능
 * 			>> 메서드의 지역 변수에만 접근 가능
 * 			cf) 로컬 변수(외부 클래스 멤버 변수)가 final인 경우에만 접근 가능
 * 
 * 4. 익명 (내부) 클래스
 * 		: 이름이 없는 내부 클래스
 * 		: 주로 인터페이스나 추상 클래스의 구현에 사용
 * 			>> 즉시 객체 생성 가능
 * 			>> 주로 클래스를 일회성으로 사용하는 경우
 * 
 * */
class OuterClass {
	private String outerField = "외부 클래스의 (인스턴스) 필드";
	static String staticField = "외부 클래스의 정적 필드";
	
	// 1. (비정적) 내부 클래스 - 인스턴스 멤버처럼 사용
	class InnerClass {
		void display() {
			System.out.println("외부 클래스 필드에 접근: " + outerField);
		}
	}
	
	// 2. 정적 내부 클래스 - 인스턴스화 없이 사용 가능
	static class StaticClass {
		void display() {
			// 외부 클래스의 인스턴스 멤버에 접근 X
			// System.out.println("외부 클래스 필드에 접근: " + outerField);
			
			// 외부 클래스의 정적 멤버 사용 시: 클래스명. 생략 가능
			System.out.println("외부 클래스 정적 필드에 접근: " + staticField);
		}
	}
	
	// 3. 메서드 내부 클래스 (지역 클래스)
	void outerMethod() {
		String localVar = "메서드 로컬 변수";
		// localVar = "메서드 로컬 변수 값 변경"; - 지역 변수는 암묵적으로 final로 간주 (생략 가능)
		final String localFinalVar = "메서드 로컬 변수 (Final)";
		// localFinalVar = "메서드 로컬 변수 값 변경";
		
		class MethodClass {
			void display() {
				System.out.println("로컬 변수에 접근(Final X): " + localVar);
				System.out.println("로컬 변수에 접근(Final O): " + localFinalVar);
			}
		}
		
		System.out.println("외부 클래스의 메서드를 호출");
		
		// 로컬 클래스의 인스턴스화
		// : 메서드 내부에서만 쓰이기 때문에 인스턴스화도 내부에서 일어남
		MethodClass methodClass = new MethodClass();
		methodClass.display();
	}
}

// 추상 클래스: 하나 이상의 추상 메서드를 포함
abstract class AbstractClass {
	// cf) 추상 클래스는 구현 클래스를 가질 수 있음
	//		>> 추상 메서드에 abstract 키워드 생략 X
	abstract void display(); // 추상 메서드: 구현부 {}가 없는 메서드
}

// 인터페이스
interface InterfaceClass {
	// cf) 필드는 public static final 생략
	
	// cf) 인터페이스는 일반 구현 클래스를 가질 수 없음
	//		>> static 메서드, default 메서드 가능 (예외)
	void something(); // public abstract 생략
}


public class A_Inner {
	public static void main(String[] args) {
		System.out.println("=== 비정적 내부 클래스 ===");
		// 1) 외부 클래스 인스턴스화
		OuterClass outerClass1 = new OuterClass();
		
		// 2) 외부클래스.내부클래스 형식으로 내부 클래스 인스턴스를 생성
		// : 외부클래스타입	.내부클래스타입 변수명 = 외부인스턴스.new 내부클래스(); 
		OuterClass.InnerClass innerClass = outerClass1.new InnerClass();
		
		innerClass.display(); // 외부 클래스 필드에 접근
		
		System.out.println("=== 정적 내부 클래스 ===");
		// 1) 외부 클래스 인스턴스화 필요 X, 클래스를 사용한 내부 클래스 생성 가능
		// : 외부클래스타입.내부클래스타입 변수명 = new 외부클래스명.내부클래스();
		OuterClass.StaticClass staticClass = new OuterClass.StaticClass();
		
		staticClass.display(); // 외부 클래스의 정적 필드에 접근
		
		System.out.println("=== 메서드 내부 클래스 (지역 클래스) ===");
		OuterClass outerClass2 = new OuterClass();
		outerClass2.outerMethod();
		
		System.out.println("=== 익명 (내부) 클래스 ===");
		// 클래스타입 변수명 = new 클래스명() { 메서드 구현 - 추상클래스/인터페이스의 추상 메서드 }
		AbstractClass abstractClass1 = new AbstractClass() {
			@Override
			void display() {
				System.out.println("익명 내부 클래스 - 추상 클래스1");
			}
		};
		
		abstractClass1.display();
		
		AbstractClass abstractClass2 = new AbstractClass() {
			@Override
			void display() {
				System.out.println("익명 내부 클래스 - 추상 클래스2");
			}
		};
		
		abstractClass2.display();
		
		System.out.println(abstractClass1 == abstractClass2); // false
		
		// >> 재사용될 필요가 없거나, 단 한번의 사용 목적에 유용
		
		InterfaceClass interfaceClass = new InterfaceClass() {
			@Override
			public void something() {
				System.out.println("안녕하세요! 익명 클래스입니다 :)");
			}
		};
		
		interfaceClass.something();		
	}
}