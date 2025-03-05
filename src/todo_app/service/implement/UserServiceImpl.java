package todo_app.service.implement;

public class UserServiceImpl implements UserService {
    private UserRepository userRepository = new UserRepository();

    @Override
    public void signUp(UserSignUpRequestDto signUpRequest) {
        User newUser = new User("1", signUpRequest.getUsername(), signUpRequest.getPassword(), signUpRequest.getEmail(), true);
        userRepository.save(newUser);
    }

    @Override
    public UserResponseDto signIn(UserSignInRequestDto signInRequest) {
        for (User user : userRepository.findAll()) {
            if (user.getUsername().equals(signInRequest.getUsername()) && user.getPassword().equals(signInRequest.getPassword())) {
                return new UserResponseDto(user.getId(), user.getUsername(), user.getEmail());
            }
        }
        return null;
    }

    @Override
    public void deleteUser(String id) {
        userRepository.delete
