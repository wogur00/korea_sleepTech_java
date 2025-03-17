package todo_app.controller;

import todo_app.dto.request.UserSignUpRequestDto;
import todo_app.service.UserService;
import todo_app.service.implement.UserServiceImpl;

public class UserController {
	private UserService service;

	public UserController() {
		this.service = new UserServiceImpl();
	}

	public void registerUser(UserSignUpRequestDto dto) {
		service.registerUser(dto);
	}
	
}