package models;

public class UserSL {
    private String name;
    private String password;

    public UserSL(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

}
