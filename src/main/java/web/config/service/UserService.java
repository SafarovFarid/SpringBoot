package web.config.service;


import web.config.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void createUser(User user);

    User deleteUser(long id);
    User getUser(long id);
}
