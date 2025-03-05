package chapter10;

// == 자바 컬렉션 프레임워크 == //

// cf) 프레임워크(framework)
// : frame(틀) + work(일하다)
// - 제공받은 일정한 요소와 틀, 규약을 가지고 무언가를 만드는 일

// 1. 컬렉션 프레임워크
// : 데이터를 저장하고 처리하는 자료구조의 표준화 된 설계
// - 다양한 자료구조를 제공, 데이터의 효율적인 관리를 지원

// 2. 컬렉션 프레임워크의 주요 '인터페이스'와 특성
// 1) Collection
//	- 자바 컬렉션 프레임워크의 최상위 인터페이스 (List, Set 등이 하위 인터페이스)
//	- 데이터의 집합을 다룸

// 2) List
//	- 데이터의 순서 유지 (Index 번호)
//  - 중복 가능
//  - 주요 구현체: ArrayList, LinkedList, Vector 등

// 3) Set
//	- 데이터의 순서 유지 X (cf. 특정 구현체는 정렬 | 순서 제공 가능*)
//  - 중복 불가능
//  - 주요 구현체: HashSet, TreeSet*, LinkedHashSet*

// 4) Map
//  - 키(Key) - 값(Value) 쌍으로 이루어진 데이터를 다룸
//  - 키: 중복 허용 / 값: 중복 허용 X
//  - 주요 구현체: HashMap, TreeMap, LinkedHashMap

// cf) Queue(큐): FIFO(First In First Out)
//		Stack(스택): LIFO(Last In First Out)
public class A_Collection {
	// 컬렉션 프레임 워크 사용 방법
	// - 데이터의 특성에 맞는 클래스 선택
	// : 중복에 대한 필요성, 순서 유지에 대한 필요성 점검
	// : 키-값 쌍의 데이터에 대한 필요성
}