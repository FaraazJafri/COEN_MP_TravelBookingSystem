/**
 * Represents a booking for a touristic package made by a customer.
 */
package org.COEN;

public class Booking {
    private static int BookingIdIncrementer = 1;
    private int bookingId;
    private Customer customer;
    private TouristicPackage touristPackage;
    private String departureDate;

    /**
     * Returns the booking ID.
     *
     * @return The booking ID.
     */
    public int getBookingId() {
        return bookingId;
    }

    /**
     * Returns the customer associated with the booking.
     *
     * @return The customer associated with the booking.
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Sets the customer associated with the booking.
     *
     * @param customer The customer associated with the booking.
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * Returns the touristic package associated with the booking.
     *
     * @return The touristic package associated with the booking.
     */
    public TouristicPackage getTouristPackage() {
        return touristPackage;
    }

    /**
     * Sets the touristic package associated with the booking.
     *
     * @param touristPackage The touristic package associated with the booking.
     */
    public void setTouristPackage(TouristicPackage touristPackage) {
        this.touristPackage = touristPackage;
    }

    /**
     * Returns the departure date for the booking.
     *
     * @return The departure date for the booking.
     */
    public String getDepartureDate() {
        return departureDate;
    }

    /**
     * Sets the departure date for the booking.
     *
     * @param departureDate The departure date for the booking.
     */
    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    /**
     * Constructs a booking with the provided customer, touristic package, and departure date.
     *
     * @param customer         The customer making the booking.
     * @param touristicPackage The touristic package being booked.
     * @param departureDate    The departure date for the booking.
     */
    public Booking(Customer customer, TouristicPackage touristicPackage, String departureDate) {
        this.bookingId = this.BookingIdIncrementer;
        this.BookingIdIncrementer++;
        this.customer = customer;
        this.touristPackage = touristicPackage;
        this.departureDate = departureDate;
    }

    /**
     * Resets the booking ID counter to 1.
     */
    public static void resetCounter() {
        BookingIdIncrementer = 1;
    }

    /**
     * Returns a string representation of the booking object.
     *
     * @return A string representation of the booking object.
     */
    @Override
    public String toString() {
        return "Booking Id: " + getBookingId() + "  ||||  " +
                "Customer: " + getCustomer() + "  ||||  " +
                "Tourist Package: " + getTouristPackage() + "  ||||  " +
                "Departure Date: " + getDepartureDate();
    }
}