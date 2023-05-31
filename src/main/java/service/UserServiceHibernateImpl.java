package service;

import dao.UserDAO;
import dao.UserDAOHibernateImpl;
import model.User;

import java.util.List;

public class UserServiceHibernateImpl implements UserService {

    private UserDAO userDAO = new UserDAOHibernateImpl();


    @Override
    public void createUserTable() {
        userDAO.createUserTable();
    }

    @Override
    public void dropUserTable() {
        userDAO.dropUserTable();

    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
        userDAO.saveUser(name, lastName, age);
    }

    @Override
    public void removeUserById(long id) {
        userDAO.removeUserById(id);

    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    public void clearUserTable() {
        userDAO.clearUserTable();
    }
}
