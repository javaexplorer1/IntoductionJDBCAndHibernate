import dao.UserDAO;
import dao.UserDAOJDBCImpl;
import model.User;
import service.UserService;
import service.UserServiceJDBCImpl;
import util.Util;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        scryptJDBC();

    }

    private static void scryptJDBC() {
        Util.getJDBCConnection();
        UserService userService = new UserServiceJDBCImpl();
        userService.createUserTable();
        userService.saveUser("Андрей", "Иванов", (byte) 25);
        userService.saveUser("name1", "lastName1", (byte) 35);
        userService.saveUser("name2", "lastName2", (byte) 45);
        userService.saveUser("name3", "lastName3", (byte) 65);
        List<User> allUsers = userService.getAllUsers();
        allUsers.forEach(System.out::println);
        userService.clearUserTable();
        userService.dropUserTable();
    }

}
