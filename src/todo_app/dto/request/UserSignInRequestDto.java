package todo_app.dto.request;

public class UserSignInRequestDto {
    private String username;
    private String password;

    // 생성자
    public UserSignInRequestDto(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getter and Setter
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
