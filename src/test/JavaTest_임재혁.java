package test;

import java.util.Scanner;

// 1. src 폴더 내에 test 패키지 생성
// 2. JavaTest_본명 class 파일 생성
// 3. main 메서드 내에 문제 답안 작성

// cf) 구글링, AI Tool 사용 금지
//		: 아는 내용만 작성, 없을 경우 문제 번호만 작성하고 공란 제출 
public class JavaTest_임재혁 {
	public static void main(String[] args) {
		// 1. 서술형
		
		// 기본 데이터 타입(크기)
		// : byte(1), short(2), int(4), long(8), float(4), double(8), char(2), boolean(1)
		// 실질적인 데이터가 메모리에 저장된다.
		int age = 26;
		
		// 참조 데이터 타입
		// : Class
		// : String
		// : Array 
		// - 실제 데이터 값은 x 데이터를 저장하고 있는 메모리의 주소값을 가진다.
		String name = "임재혁";
		
		// 2. 코드 구현 문제
		int num1 = 10;
		double num2 = 3.5;
		double result = num1 + num2;
		
		System.out.println("result: " + result);
	
		// 3. 코드 구현 문제
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("해당 숫자는 짝수입니다.");
		} else {
			System.out.println("해당 숫자는 홀수입니다.");
		}
		sc.close();
	
		// 4. 코드 구현 문제
		
		// 5. 코드 구현 문제
		
		// 6. 자바에서 모든 클래스의 최상위 부모 클래스는 무엇입니까?
		// : Object
		
		// 7. ArrayList와 같은 컬렉션에서 요소의 개수를 반환하는 메서드는 무엇입니까?
		// : 
		
		// 8. 자바에서 if-else 문 대신 간결하게 조건에 따라 값을 반환할 수 있는 연산자는 무엇입니까?
		// : 
		
		// 9. 다음 중 인터페이스에서 사용할 수 없는 것은 무엇입니까?
		// : 4
		
		// 10. 다음 중 @FunctionalInterface에 해당하는 조건으로 올바른 것은 무엇입니까?
		// : 
		
		// 11.
		// : child
		
		// 12. 
		// : 1
		
		// 13.
		// : 아니오
		
		// 14.
		// : 
		
		// 15.
		// :
		
		// 16.
		// : Controller
		
		// 17.
		// : public
		
		// 18.
		// : 3
		
		
	}
}