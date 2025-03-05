package todo_app;

/*
 * === TODO(할 일) 프로그램 ===
 * 
 * 1. 프로젝트 개요
 * : 할 일(Todo)에 대한 콘솔 기반 응용 프로그램
 * - 두 도메인(사용자, 할일)을 대상으로 회원가입, 로그인, 로그아웃, 회원 탈퇴 기능
 * 		할일에 대한 추가, 조회(단건/전체), 수정, 삭제 기능을 제공
 * 
 * +) 할일의 활성화 여부(할일 완료 여부)에 따른 필터링
 * 
 * 2. 주요 기능 및 비즈니스 로직
 * : 회원 정보 관리 - CR(단건)D (+ 로그인, 로그아웃)
 * : 할일 기록 관리 - CR(단건/전체)UD (+ 필터링)
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
 * */
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserController userController = new UserController();
        TaskController taskController = new TaskController();

        while (true) {
            System.out.println("1. Sign Up");
            System.out.println("2. Sign In");
            System.out.println("3. Delete User");
            System.out.println("4. Create Task");
            System.out.println("5. Update Task");
            System.out.println("6. Delete Task");
            System.out.println("7. View All Tasks");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    userController.signUp();
                    break;
                case 2:
                    userController.signIn();
                    break;
                case 3:
                    userController.deleteUser();
                    break;
                case 4:
                    System.out.print("Enter your user ID: ");
                    String userId = scanner.nextLine();
                    taskController.createTask(userId);
                    break;
                case 5:
                    taskController.updateTask();
                    break;
                case 6:
                    taskController.deleteTask();
                    break;
                case 7:
                    taskController.viewAllTasks();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    return;
            }
        }
    }
}
