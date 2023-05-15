package org.COEN;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Customer customer;
    private TouristicPackage touristicPackage;
    private String departureDate;
    private Booking booking;

    @After
    public void tearDown() {
        Booking.resetCounter();
        Customer.resetCounter();
        TouristicPackage.resetCounter();
    }

    @Before
    public void setUp() {
        customer = new Customer("Man", "Som", "man@som.com", "123-456-7890");
        touristicPackage = new TouristicPackage("Delhi", "India", 5, 4, "Marriott", 1000.0, null);
        departureDate = "2024-06-01";
        booking = new Booking(customer, touristicPackage, departureDate);
    }

    @Test
    public void testGetBookingId() {
        assertEquals(1, booking.getBookingId());
    }

    @Test
    public void testGetCustomer() {
        assertEquals(customer, booking.getCustomer());
    }

    @Test
    public void testSetCustomer() {
        Customer newCustomer = new Customer("Pra", "Xyz", "pra@gmail.com", "987-654-3210");
        booking.setCustomer(newCustomer);
        assertEquals(newCustomer, booking.getCustomer());
    }

    @Test
    public void testGetTouristPackage() {
        assertEquals(touristicPackage, booking.getTouristPackage());
    }

    @Test
    public void testSetTouristPackage() {
        TouristicPackage newPackage = new TouristicPackage("New York City", "USA", 3, 2, "Hilton", 500.0, null);
        booking.setTouristPackage(newPackage);
        assertEquals(newPackage, booking.getTouristPackage());
    }

    @Test
    public void testGetDepartureDate() {
        assertEquals(departureDate, booking.getDepartureDate());
    }

    @Test
    public void testSetDepartureDate() {
        String newDate = "2023-07-01";
        booking.setDepartureDate(newDate);
        assertEquals(newDate, booking.getDepartureDate());
    }

    @Test
    public void testToString() {
        String expected = "Booking Id: 1  ||||  Customer: Customer Id: 1  ||  First Name: Man  ||  Last Name: Som  ||  Date Of Birth: man@som.com  ||  Email Id: 123-456-7890  ||||  Tourist Package: Package Id: 1  ||  Destination City: Delhi  ||  Destination Country: India  ||  Number Of Days: 5  ||  Number Of Nights: 4  ||  Hotel Name: Marriott  ||  Price: 1000.0  ||  Activities Included: None  ||||  Departure Date: 2024-06-01";
        assertEquals(expected, booking.toString());
    }
}
