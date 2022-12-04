package by.step.java.core.finaly.project.controller;

import by.step.java.core.finaly.project.service.EmployeeService;
import by.step.java.core.finaly.project.service.employee.EmployeeModel;

import java.util.Scanner;

public class MenuController {

    private Scanner sc = new Scanner(System.in);
    private Menu menu;
    private LoginController loginController;

    public MenuController(Menu menu, LoginController loginController) {
        this.menu = menu;
        this.loginController = loginController;
    }

    private void showMenu(Menu menu) {
        for (String s : menu.getMenu()) {
            System.out.println(s);
        }
    }

    private void showSubMenu(String[] submenu) {
        for (String s : submenu) {
            System.out.println(s);
        }
    }

    public void workWithMenu() {
        if (menu instanceof AdminMenu) {
            workWithAdminMenu();
        } else {
            workWithUserMenu();
        }
    }

    private void workWithAdminMenu() {
        showMenu(menu);
        switch (sc.nextInt()) {
            case 1: {
                workWithEmployeeAdminMenu();
                break;
            }
            case 2: {
                loginController.login();
            }
            case 0: {
                return;
            }
            default: {
                showErrorMenuMessage();
                workWithAdminMenu();
            }
        }
    }

    private void showErrorMenuMessage() {
        System.out.println("Wrong menu point");
    }

    private EmployeeService employeeService = new EmployeeService();

    private void workWithEmployeeAdminMenu() {
        showSubMenu(((AdminMenu) menu).getEmployeeAdminMenu());
        switch (sc.nextInt()) {
            case 1: {
                EmployeeModel employeeModel = createNewEmployee();
                employeeService.addNewEmployee(employeeModel);
                workWithEmployeeAdminMenu();
                break;
            }
            case 2: {

            }
            case 3: {

            }
            case 4: {

            }
            case 5: {
                workWithAdminMenu();
            }
            default: {

            }

        }
    }

    private EmployeeModel createNewEmployee() {
        int id;
        String fio;
        int age;
        double salary;

        System.out.print("Input ID employee: ");
        id = sc.nextInt();
        System.out.print("Input FIO employee: ");
        fio = sc.next();
        System.out.print("Input age employee: ");
        age = sc.nextInt();
        System.out.print("Set salary employee: ");
        salary = sc.nextDouble();
        return new EmployeeModel(id, fio, age, salary);
    }

    private void workWithUserMenu() {
        showMenu(menu);
    }
}
