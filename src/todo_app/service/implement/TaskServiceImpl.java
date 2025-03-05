package todo_app.service.implement;

public class TaskServiceImpl implements TaskService {
    private TaskRepository taskRepository = new TaskRepository();

    @Override
    public void createTask(TaskRequestDto taskRequest, String userId) {
        Task newTask = new Task(1, taskRequest.getDescription(), taskRequest.isCompleted(), "2025-03-04", "2025-03-04", userId);
        taskRepository.save(newTask);
    }

    @Override
    public void updateTask(int taskId, TaskRequestDto taskRequest) {
        taskRepository.update(taskId, taskRequest);
    }

    @Override
    public void deleteTask(int taskId) {
        taskRepository.delete(taskId);
    }

    @Override
    public List<TaskResponseDto> getAllTasks() {
        List<TaskResponseDto> taskDtos = new ArrayList<>();
        for (Task task : taskRepository.findAll()) {
            taskDtos.add(new TaskResponseDto(task.getId(), task.getDescription(), task.isCompleted()));
        }
        return taskDtos;
    }
}
