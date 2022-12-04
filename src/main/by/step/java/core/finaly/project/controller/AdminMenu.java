package by.step.java.core.finaly.project.controller;

public class AdminMenu extends Menu {

    private String[] adminMenu = {
            "1. Work with employees",
            "2. Relogin",
            "0. Exit"
    };

    private String[] employeeAdminMenu = {
            "1. Add new employee",
            "2. Edit details employee",
            "3. Delete employee",
            "4. Show all  employee's list",
            "5. Return to admin menu"
    };

    @Override
    public String[] getMenu() {
        return adminMenu;
    }

    public String[] getEmployeeAdminMenu() {
        return employeeAdminMenu;
    }

}
