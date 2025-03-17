
package todo_app.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TaskResponseDto {
	private Long Id;
	private String task;
	private String date;
}
