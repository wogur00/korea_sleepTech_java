package todo_app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
	private Long id;
	private String userId;
	private String userName;
	private String password;
	private String email;
	private String nickName;
}