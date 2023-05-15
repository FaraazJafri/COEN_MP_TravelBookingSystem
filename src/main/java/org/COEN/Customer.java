package org.COEN;

public class Customer {

    private static int customerIdIncrementer = 1;
    private int customerId;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String email;

    public Customer(String name, String lastName, String dateOfBirth, String email) {
        this.customerId = this.customerIdIncrementer;
        this.firstName = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.customerIdIncrementer++;
    }

    public static void resetCounter() {
        customerIdIncrementer = 1;
    }


    public int getCustomerId() {
        return this.customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer Id: " + getCustomerId() + "  ||  " +
                "First Name: " + getFirstName() + "  ||  " +
                "Last Name: " + getLastName() + "  ||  " +
                "Date Of Birth: " + getDateOfBirth() + "  ||  " +
                "Email Id: " + getEmail();
    }
}

