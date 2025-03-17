package todo_app.service.implement;

import java.util.List;

import todo_app.dto.request.UserSignInRequestDto;
import todo_app.dto.request.UserSignUpRequestDto;
import todo_app.dto.response.UserResponseDto;
import todo_app.repository.UserRepository;
import todo_app.service.UserService;

public class UserServiceImpl implements UserService {
	private final UserRepository repository;

	@Override
	public void registerUser(UserSignUpRequestDto dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<UserResponseDto> listAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserResponseDto getUserById(String userId, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void signInUser(Long id, UserSignInRequestDto dto) {
		// TODO Auto-generated method stub
		
	}
}