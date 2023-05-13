package org.COEN;

import java.util.List;

public class TouristicPackage {
    private String destinationCity;
    private String destinationCountry;
    private int numberOfDays;
    private int numberOfNights;
    private String hotelName;
    private double price;
    private List<String> activitiesIncluded;

    public TouristicPackage(String destinationCity, String destinationCountry, int numberOfDays, int numberOfNights, String hotelName, double price, List<String> activitiesIncluded) {
        this.destinationCity = destinationCity;
        this.destinationCountry = destinationCountry;
        this.numberOfDays = numberOfDays;
        this.numberOfNights = numberOfNights;
        this.hotelName = hotelName;
        this.price = price;
        this.activitiesIncluded = activitiesIncluded;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    public String getDestinationCountry() {
        return destinationCountry;
    }

    public void setDestinationCountry(String destinationCountry) {
        this.destinationCountry = destinationCountry;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<String> getActivitiesIncluded() {
        return activitiesIncluded;
    }

    public void setActivitiesIncluded(List<String> activitiesIncluded) {
        this.activitiesIncluded = activitiesIncluded;
    }
}
