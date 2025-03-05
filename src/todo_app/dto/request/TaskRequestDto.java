package todo_app.dto.request;

public class TaskRequestDto {
    private String description;
    private boolean isCompleted;

    // 생성자
    public TaskRequestDto(String description, boolean isCompleted) {
        this.description = description;
        this.isCompleted = isCompleted;
    }

    // Getter and Setter
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}
