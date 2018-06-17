package Entity;

import java.io.Serializable;

public class Contact implements Serializable {
    String fname, Lname, mobile, email, uname, password;

    public Contact() {
    }

    public Contact(String fname, String lname, String mobile, String email, String uname, String password) {
        this.fname = fname;
        Lname = lname;
        this.mobile = mobile;
        this.email = email;
        this.uname = uname;
        this.password = password;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
