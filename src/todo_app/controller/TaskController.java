package todo_app.controller;

import todo_app.dto.request.TaskRequestDto;
import todo_app.service.TaskService;
import todo_app.service.implement.TaskServiceImpl;

public class TaskController {
	private TaskService service;
	
	public TaskController() {
		this.service = new TaskServiceImpl();
	}
	
	public void createTask(TaskRequestDto dto) {
		service.createTask(dto);
	}
	
	
}