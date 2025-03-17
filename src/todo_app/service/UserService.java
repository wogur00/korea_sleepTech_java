package todo_app.service;

import java.util.List;

import todo_app.dto.request.UserSignInRequestDto;
import todo_app.dto.request.UserSignUpRequestDto;
import todo_app.dto.response.UserResponseDto;

public interface UserService {
	void registerUser(UserSignUpRequestDto dto);

	List<UserResponseDto> listAllUsers();

	UserResponseDto getUserById(String userId, String password);

	void signInUser(Long id, UserSignInRequestDto dto);
}