package entities;

import utils.Major;
import utils.Role;

public class Teacher extends User{
    private Major major;
    private int count = 0;

    public Teacher(String username, String password, String email, String address, int phone, Role role, Major major, int count) {
        super(username, password, email, address, phone, role);
        this.major = major;
        this.count = 0;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
