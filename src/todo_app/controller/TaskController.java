package todo_app.controller;

import java.util.Scanner;

public class TaskController {
    private TaskService taskService = new TaskServiceImpl();
    private Scanner scanner = new Scanner(System.in);

    public void createTask(String userId) {
        System.out.println("Enter task description: ");
        String description = scanner.nextLine();
        System.out.println("Is task completed? (true/false): ");
        boolean isCompleted = Boolean.parseBoolean(scanner.nextLine());

        TaskRequestDto requestDto = new TaskRequestDto(description, isCompleted);
        taskService.createTask(requestDto, userId);
        System.out.println("Task created successfully!");
    }

    public void updateTask() {
        System.out.println("Enter task ID to update: ");
        int taskId = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter new task description: ");
        String description = scanner.nextLine();
        System.out.println("Is task completed? (true/false): ");
        boolean isCompleted = Boolean.parseBoolean(scanner.nextLine());

        TaskRequestDto requestDto = new TaskRequestDto(description, isCompleted);
        taskService.updateTask(taskId, requestDto);
        System.out.println("Task updated successfully!");
    }

    public void deleteTask() {
        System.out.println("Enter task ID to delete: ");
        int taskId = Integer.parseInt(scanner.nextLine());
        taskService.deleteTask(taskId);
        System.out.println("Task deleted successfully!");
    }

    public void viewAllTasks() {
        for (TaskResponseDto task : taskService.getAllTasks()) {
            System.out.println("ID: " + task.getId() + ", Description: " + task.getDescription() + ", Completed: " + task.isCompleted());
        }
    }
}
