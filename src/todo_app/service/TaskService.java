package todo_app.service;

public interface TaskService {
    void createTask(TaskRequestDto taskRequest, String userId);
    void updateTask(int taskId, TaskRequestDto taskRequest);
    void deleteTask(int taskId);
    List<TaskResponseDto> getAllTasks();
}
