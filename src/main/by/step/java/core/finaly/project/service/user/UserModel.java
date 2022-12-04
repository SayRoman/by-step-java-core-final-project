package by.step.java.core.finaly.project.service.user;

public class UserModel {
    private int id;
    private String login;
    private String password;
    private TypeOfUser typeOfUser;

    public UserModel(int id, String login, String password, TypeOfUser typeOfUser) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.typeOfUser = typeOfUser;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public TypeOfUser getTypeOfUser() {
        return typeOfUser;
    }
}
