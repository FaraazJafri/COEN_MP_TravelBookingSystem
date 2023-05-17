package org.COEN;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for Customer class.
 */
public class CustomerTest {

    private Customer customer;

    @After
    public void tearDown() {
        Booking.resetCounter();
        Customer.resetCounter();
        TouristicPackage.resetCounter();
    }

    @Before
    public void setUp() {
        if (customer == null) {
            customer = new Customer("Faraaz", "Jafri", "06/10/1998", "afj@abcd.com");
        }
    }

    @Test
    public void testGetCustomerId() {
        int expected = 1;
        int actual = customer.getCustomerId();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetFirstName() {
        String expected = "Faraaz";
        String actual = customer.getFirstName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetFirstName() {
        String expected = "Shivesh";
        customer.setFirstName("Shivesh");
        String actual = customer.getFirstName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetLastName() {
        String expected = "Jafri";
        String actual = customer.getLastName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetLastName() {
        String expected = "Chd";
        customer.setLastName("Chd");
        String actual = customer.getLastName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetDateOfBirth() {
        String expected = "06/10/1998";
        String actual = customer.getDateOfBirth();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetDateOfBirth() {
        String expected = "01/01/2000";
        customer.setDateOfBirth("01/01/2000");
        String actual = customer.getDateOfBirth();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetEmail() {
        String expected = "afj@abcd.com";
        String actual = customer.getEmail();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetEmail() {
        String expected = "shivesh@xyz.com";
        customer.setEmail("shivesh@xyz.com");
        String actual = customer.getEmail();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testToString() {
        String expected = "Customer Id: 1  ||  First Name: Faraaz  ||  Last Name: Jafri  ||  Date Of Birth: 06/10/1998  ||  Email Id: afj@abcd.com";
        String actual = customer.toString();
        Assert.assertEquals(expected, actual);
    }
}

