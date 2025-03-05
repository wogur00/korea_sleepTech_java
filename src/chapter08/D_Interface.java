package chapter08;

// 인터페이스의 (멤버) 변수의 특성
// : 자동으로 public static final 특성
// > 어디서든 접근 가능 + 모두 같은 값 공유(인스턴스화 없이 인터페이스에서 접근) + 불변성

// cf) 클래스 || 인터페이스의 '멤버': 해당 구조의 내부 '구성 요소'

// == 다중 인터페이스 구현 == //
interface Example1 {
	int EXAMPLE_VARIABLE = 10;
	
	void printVar1();
	
	default void method() {
		System.out.println("예시 1");
	}
}

interface Example2 {
	void printVar1();
	void printVar2();
	
	default void method() {
		System.out.println("예시 2");
	}
}

// 여러 개의 인터페이스를 구현하는 클래스
// : implements 키워드 뒤에 여러 개의 인터페이스를 ,로 구분하여 나열
class ExampleClass implements Example1, Example2 {
	
	// 다중 구현의 인터페이스에서 동일한 추상 메서드명을 가져도 가능!
	public void printVar1() {
		System.out.println(EXAMPLE_VARIABLE);
	}
	
	public void printVar2() {
		System.out.println("다중 인터페이스 구현");
	}
	
	// @Override 
	@Override
	// 다중 인터페이스 구현 시 같은 시그니처를 가진 디폴트 메서드가 존재할 경우
	//	- 반드시 오버라이드 어노테이션을 작성!
	public void method() {
		System.out.println("Method, 중복되는 디폴트 메서드");
	}
}

public class D_Interface {
	public static void main(String[] args) {
		ExampleClass exampleClass = new ExampleClass();
		exampleClass.printVar1();
		exampleClass.printVar2();
		exampleClass.method();
		
		Example1 example1 = exampleClass;
		example1.printVar1();
		// example1.printVar2(); - Example1에 정의되지 X
		
		example1.method();
		
		// cf) 인터페이스의 다형성
		// : 인터페이스로 구현한 클래스의 객체는 해당 인터페이스의 타입으로 동작 가능
		// >> 업캐스팅의 일부
		// - 해당 인터페이스 내의 구조만 가짐: 추가 구현된 기능은 읽히지 X
		// - 재정의 된 메서드는 유지
		
		
	}
}