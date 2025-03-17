package todo_app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Task {
	private Long Id;
	private String task;
	private String date;
}