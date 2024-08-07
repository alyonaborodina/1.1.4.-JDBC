package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Mark", "levin", (byte) 22);
        userService.saveUser("Ivan", "Kirov", (byte) 14);
        userService.saveUser("Leonid", "Petrov", (byte) 45);
        userService.saveUser("Mike", "Ivanov", (byte) 33);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
