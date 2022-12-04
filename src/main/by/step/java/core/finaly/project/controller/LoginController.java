package by.step.java.core.finaly.project.controller;

import by.step.java.core.finaly.project.service.ValidationOfCredentials;
import by.step.java.core.finaly.project.service.user.TypeOfUser;

import java.util.Scanner;

public class LoginController {

    private ValidationOfCredentials validationOfCredentials = new ValidationOfCredentials();

    public void login () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Login: ");
        String login = sc.nextLine();
        System.out.print("Password: ");
        String password = sc.nextLine();

        Menu menu = tryLogin(login,password);
        MenuController menuController = new MenuController(menu, this);
        menuController.workWithMenu();
    }

    private Menu tryLogin(String login, String password) {
        TypeOfUser typeOfUser = null;
        try {
            typeOfUser = validationOfCredentials.getTypeOfUser(login, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        if (typeOfUser.equals(TypeOfUser.ACCOUNTANT)){
            return new AdminMenu();
        } else {
            return new UserMenu();
        }
    }
}
