package model;

public abstract class User {
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        //this.phoneNumber = phoneNumber.length() != 8 ? phoneNumber : this.phoneNumber;
        if (phoneNumber.length() != 8) {
            System.out.println("El numero debe tener 8 digitos");
        }else {
            this.phoneNumber = phoneNumber;
        }
    }

    @Override
    public String toString() {
        return "User: " + name + ", email: " + email + "\nAddress: " + address + " phone: " + phoneNumber;
    }

    public  abstract void showDataUser();

}
