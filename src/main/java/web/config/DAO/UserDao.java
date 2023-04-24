package web.config.DAO;


import web.config.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    void createUser(User user);

    void updateUser(User user);

    User deleteUser(long id);

    User getUser(long id);


}
