package models.extend;

import models.User;
import models.auxilaryModels.MyDate;

public class Customer extends User {
    private String phoneNumber;
    private MyDate birthDay;
    private String address;

    public Customer(String firstName, String lastName, MyDate birthDay, String address, String phoneNumber) {
        super(firstName, lastName);
        this.birthDay = birthDay;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public MyDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(MyDate birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
