package service;

import model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceHibernateImplTest {

    private UserService userService = new UserServiceHibernateImpl();
    private String testName = "Сергей";
    private String testLastName = "Петров";
    private byte testAge = 37;

    @BeforeEach
    public void partTest() {
        userService.dropUserTable();
        userService.createUserTable();
        userService.saveUser(testName, testLastName, testAge);
    }

    @Test
    public void createUserTable() {
        try {
            userService.dropUserTable();
            userService.createUserTable();
        } catch (Exception e) {
            fail("При тестировании создания таблицы произошла ошибка \n" + e.getMessage());
        }
    }

    @Test
    public void dropUserTable() {
        try {
            userService.dropUserTable();
        } catch (Exception e) {
            fail("При удалении таблицы произошла ошибка \n" + e.getMessage());
        }
    }

    @Test
    public void saveUser() {
        try {
            User user = userService.getAllUsers().get(0);
            if (!testName.equals(user.getName()) || !testLastName.equals(user.getLastName()) || testAge != user.getAge()) {
                fail("User был некорректно сохранен в базу");
            }
        } catch (Exception e) {
            fail("Во время тестирования создания User произошла ошибка \n" + e.getMessage());
        }
    }

    @Test
    public void removeUserById() {
        try {
            userService.removeUserById(1);
        } catch (Exception e) {
            fail("При тестировании удаления произошла ошибка \n" + e.getMessage());
        }
    }

    @Test
    public void getAllUsers() {
        try {
            List<User> allUsers = userService.getAllUsers();
            if (allUsers.size() != 1) {
                fail("Некорректно работает метод сохранения пользователей в таблицу");
            }
        } catch (Exception e) {
            fail("При попытке извлечения пользователей из базы произошла ошибка \n" + e.getMessage());
        }
    }

    @Test
    public void clearUserTable() {
        try {

            userService.clearUserTable();
            if (userService.getAllUsers().size() != 0) {
                fail("Метод очистки реализован не корректно");
            }
        } catch (Exception e) {
            fail("При очистке таблицы произошла ошибка \n" + e.getMessage());
        }
    }
}