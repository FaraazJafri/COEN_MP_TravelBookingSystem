package org.COEN;

public class Booking {


    private static int BookingIdIncrementer = 1;

    private int bookingId;

    private Customer customer;

    private TouristicPackage touristPackage;

    private String departureDate;

    public int getBookingId() {
        return bookingId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public TouristicPackage getTouristPackage() {
        return touristPackage;
    }

    public void setTouristPackage(TouristicPackage touristPackage) {
        this.touristPackage = touristPackage;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public Booking(Customer customer, TouristicPackage touristicPackage, String departureDate){
        this.bookingId = this.BookingIdIncrementer;
        this.BookingIdIncrementer++;
        this.customer = customer;
        this.touristPackage = touristicPackage;
        this.departureDate = departureDate;
    }

    @Override
    public String toString(){
        return "Booking Id: " +getBookingId()+ "  ||||  "+
                "Customer: " +getCustomer() + "  ||||  " +
                "Tourist Package: " + getTouristPackage() + "  ||||  " +
                "Departure Date: " +getDepartureDate();
    }
}
