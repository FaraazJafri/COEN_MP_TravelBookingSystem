package org.COEN;

/**
 * Represents a customer.
 */
public class Customer {
    private static int customerIdIncrementer = 1;
    private int customerId;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String email;

    /**
     * Constructs a customer object with the provided details.
     *
     * @param firstName   The first name of the customer.
     * @param lastName    The last name of the customer.
     * @param dateOfBirth The date of birth of the customer.
     * @param email       The email address of the customer.
     */
    public Customer(String firstName, String lastName, String dateOfBirth, String email) {
        this.customerId = this.customerIdIncrementer;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.customerIdIncrementer++;
    }

    /**
     * Resets the customer ID counter to 1.
     */
    public static void resetCounter() {
        customerIdIncrementer = 1;
    }

    /**
     * Returns the customer ID.
     *
     * @return The customer ID.
     */
    public int getCustomerId() {
        return this.customerId;
    }

    /**
     * Returns the first name of the customer.
     *
     * @return The first name of the customer.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of the customer.
     *
     * @param firstName The first name of the customer.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Returns the last name of the customer.
     *
     * @return The last name of the customer.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of the customer.
     *
     * @param lastName The last name of the customer.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Returns the date of birth of the customer.
     *
     * @return The date of birth of the customer.
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the date of birth of the customer.
     *
     * @param dateOfBirth The date of birth of the customer.
     */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Returns the email address of the customer.
     *
     * @return The email address of the customer.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email address of the customer.
     *
     * @param email The email address of the customer.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Returns a string representation of the customer object.
     *
     * @return A string representation of the customer object.
     */
    @Override
    public String toString() {
        return "Customer Id: " + getCustomerId() + "  ||  " +
                "First Name: " + getFirstName() + "  ||  " +
                "Last Name: " + getLastName() + "  ||  " +
                "Date Of Birth: " + getDateOfBirth() + "  ||  " +
                "Email Id: " + getEmail();
    }
}