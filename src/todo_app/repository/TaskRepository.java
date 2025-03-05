package todo_app.repository;

import java.util.ArrayList;
import java.util.List;

import todo_app.dto.request.TaskRequestDto;
import todo_app.entity.Task;

public class TaskRepository {
    private List<Task> tasks = new ArrayList<>();

    public void save(Task task) {
        tasks.add(task);
    }

    public Task findById(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null;
    }

    public List<Task> findAll() {
        return tasks;
    }

    public void update(int id, TaskRequestDto taskRequestDto) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setDescription(taskRequestDto.getDescription());
                task.setCompleted(taskRequestDto.isCompleted());
            }
        }
    }

    public void delete(int id) {
        tasks.removeIf(task -> task.getId() == id);
    }
}
