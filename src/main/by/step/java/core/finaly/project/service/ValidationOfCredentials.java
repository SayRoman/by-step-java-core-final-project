package by.step.java.core.finaly.project.service;



import by.step.java.core.finaly.project.dao.FileDAO;
import by.step.java.core.finaly.project.dao.UsersFile;
import by.step.java.core.finaly.project.service.user.TypeOfUser;
import by.step.java.core.finaly.project.service.user.UserModel;

import java.util.ArrayList;

public class ValidationOfCredentials {

    private FileDAO usersFile = new UsersFile();

    private boolean existVerification (String login, String password) {
        ArrayList<UserModel> users = (ArrayList<UserModel>) usersFile.readFile();
        for (UserModel user: users) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public TypeOfUser getTypeOfUser (String login, String password) throws ClassNotFoundException {
        if (existVerification(login, password)) {
            ArrayList<UserModel> users = (ArrayList<UserModel>) usersFile.readFile();
            for (UserModel user: users) {
                if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                    return user.getTypeOfUser();
                }
            }
        }
        throw new ClassNotFoundException("Cant find TypeOfUser");
    }
}
