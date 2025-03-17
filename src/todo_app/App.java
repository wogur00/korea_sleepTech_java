package todo_app;

import java.util.Scanner;

import todo_app.controller.TaskController;
import todo_app.controller.UserController;
import todo_app.dto.request.UserSignUpRequestDto;

/*
 * === TODO(할 일) 프로그램 ===
 * 1. 프로젝트 개요
 * : 할 일(Todo)에 대한 콘솔 기반 응용 프로그램
 * - 두 도메인(사용자, 할 일)을 대상으로 회원가입, 로그인, 로그아웃, 회원 탈퇴 기능
 *  	할 일에 대한 추가, 조회(단건,전체), 수정, 삭제 기능을 제공
 *  
 *  +) 할 일의 활성화 여부(할 일 완료 여부)에 따른 필터링
 *  
 * 2. 주요 기능 및 비즈니스 로직
 * : 회원 정보 관리 - CR(단건)D (+ 로그인, 로그아웃)
 * : 할 일 기록 관리 - CR(단건/전체)UD (+ 필터링)
 * 
 * 3. 비즈니스 로직 구조
 * - Controller: 사용자의 입력을 처리하고 적절한 서비스 메소드를 호출
 * - Service: 핵심 비즈니스 로직을 수행
 * - Repository: 데이터 저장소와의 상호 작용을 담당
 * - DTO: 계층 간 데이터 전송을 위한 객체
 * - Entity: 데이터베이스 테이블과 매핑되는 도메인 객체
 * 
 * 4. 실행 및 관리
 * - Main Class (App.java): 프로그램의 실행 진입점, 사용자와의 상호작용을 관리하고 전체 흐름을 제어
*/

public class App {
	private static final Scanner sc = new Scanner(System.in);
	
	private static final UserController userController = new UserController();
	private static final TaskController taskController = new TaskController();
	
	private static void displayMenu() {
		System.out.println("[메뉴선택]");
		
		System.out.println("1. 사용자 등록");
		System.out.println("2. 사용자 조회(전체)");
		System.out.println("3. 사용자 조회(단건)");
		System.out.println("4. 사용자 삭제");
		
		System.out.println("5. 할 일 추가");
		System.out.println("6. 할 일 조회(전체)");
		System.out.println("7. 할 일 조회(단건)");
		System.out.println("8. 할 일 삭제");
		
		System.out.println("0. 프로그램 종료");
		System.out.println("메뉴를 선택하세요: ");
	}
	
}