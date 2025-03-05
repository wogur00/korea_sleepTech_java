package todo_app.controller;

import java.util.Scanner;

public class UserController {
    private UserService userService = new UserServiceImpl();
    private Scanner scanner = new Scanner(System.in);

    public void signUp() {
        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        System.out.println("Enter email: ");
        String email = scanner.nextLine();

        UserSignUpRequestDto requestDto = new UserSignUpRequestDto(username, password, email);
        userService.signUp(requestDto);
        System.out.println("User signed up successfully!");
    }

    public void signIn() {
        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();

        UserSignInRequestDto requestDto = new UserSignInRequestDto(username, password);
        UserResponseDto response = userService.signIn(requestDto);
        if (response != null) {
            System.out.println("User signed in: " + response.getUsername());
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    public void deleteUser() {
        System.out.println("Enter user ID to delete: ");
        String id = scanner.nextLine();
        userService.deleteUser(id);
        System.out.println("User deleted successfully!");
    }
}
