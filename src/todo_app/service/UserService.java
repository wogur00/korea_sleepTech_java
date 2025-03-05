package todo_app.service;

public interface UserService {
    void signUp(UserSignUpRequestDto signUpRequest);
    UserResponseDto signIn(UserSignInRequestDto signInRequest);
    void deleteUser(String id);
}
