package models.extend;

import models.User;

public class Admin extends User {
    protected int password;

    public Admin(String firstName, String lastName, int password) {
        super(firstName, lastName);
        this.password = password;
    }
}
