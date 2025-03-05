package todo_app.repository;

import java.util.ArrayList;
import java.util.List;

import todo_app.entity.User;

public class UserRepository {
    private List<User> users = new ArrayList<>();

    public void save(User user) {
        users.add(user);
    }

    public User findById(String id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }

    public List<User> findAll() {
        return users;
    }

    public void deleteById(String id) {
        users.removeIf(user -> user.getId().equals(id));
    }
}
