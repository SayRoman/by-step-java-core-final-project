package by.step.java.core.finaly.project.controller;

public class UserMenu extends Menu{

    private String[] userMenu = {
            "1. Show employee's list",
            "2. Searching",
            "3. Profile user",
            "4. Relogin",
            "0. Exit",
    };

    @Override
    public String[] getMenu() {
        return userMenu;
    }
}
