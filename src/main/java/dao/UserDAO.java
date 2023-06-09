package dao;

import model.User;

import java.util.List;

public interface UserDAO {

    void createUserTable();

    void dropUserTable();

    void saveUser(String name, String lastName, byte age);

    void removeUserById(long id);

    List<User> getAllUsers();

    void clearUserTable();

}
