package todo_app.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TaskRequestDto {
	private Long Id;
	private String task;
	private String date;
}
