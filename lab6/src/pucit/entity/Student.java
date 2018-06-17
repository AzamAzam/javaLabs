package pucit.entity;

import java.io.Serializable;

public class Student implements Serializable {
	public Student() {

	}

	private String name,Address,phone,email;

    public String getName() {
        return name;
    }

    public void setValues(String n,String add,String ph,String em){
        setName(n);
        setAddress(add);
        setPhone(ph);
        setEmail(em);
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

   @Override
	public String toString() {
		return ("Name:" + name + "\n" + //
				"Address:" + Address + "\n" + //
				"phone:" + phone + "\n" + //
				"Email:" + email);
	}

}
