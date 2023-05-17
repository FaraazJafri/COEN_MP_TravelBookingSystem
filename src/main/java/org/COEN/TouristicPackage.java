/**
 * Represents a touristic package.
 */
package org.COEN;

import java.util.List;

public class TouristicPackage {
    private static int PackageIdIncrementer = 1;
    private int packageId;
    private String destinationCity;
    private String destinationCountry;
    private int numberOfDays;
    private int numberOfNights;
    private String hotelName;
    private double price;
    private List<String> activitiesIncluded;

    /**
     * Constructs a touristic package with the provided details.
     *
     * @param destinationCity    The destination city of the package.
     * @param destinationCountry The destination country of the package.
     * @param numberOfDays       The number of days for the package.
     * @param numberOfNights     The number of nights for the package.
     * @param hotelName          The hotel name for the package.
     * @param price              The price of the package.
     * @param activitiesIncluded The list of activities included in the package.
     */
    public TouristicPackage(String destinationCity, String destinationCountry, int numberOfDays, int numberOfNights, String hotelName, double price, List<String> activitiesIncluded) {
        this.packageId = this.PackageIdIncrementer;
        this.destinationCity = destinationCity;
        this.destinationCountry = destinationCountry;
        this.numberOfDays = numberOfDays;
        this.numberOfNights = numberOfNights;
        this.hotelName = hotelName;
        this.price = price;
        this.activitiesIncluded = activitiesIncluded;
        this.PackageIdIncrementer++;
    }

    /**
     * Resets the package ID counter to 1.
     */
    public static void resetCounter() {
        PackageIdIncrementer = 1;
    }

    /**
     * Returns the package ID.
     *
     * @return The package ID.
     */
    public int getPackageId() {
        return this.packageId;
    }

    /**
     * Returns the destination city of the package.
     *
     * @return The destination city of the package.
     */
    public String getDestinationCity() {
        return destinationCity;
    }

    /**
     * Sets the destination city of the package.
     *
     * @param destinationCity The destination city of the package.
     */
    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    /**
     * Returns the destination country of the package.
     *
     * @return The destination country of the package.
     */
    public String getDestinationCountry() {
        return destinationCountry;
    }

    /**
     * Sets the destination country of the package.
     *
     * @param destinationCountry The destination country of the package.
     */
    public void setDestinationCountry(String destinationCountry) {
        this.destinationCountry = destinationCountry;
    }

    /**
     * Returns the number of days for the package.
     *
     * @return The number of days for the package.
     */
    public int getNumberOfDays() {
        return numberOfDays;
    }

    /**
     * Sets the number of days for the package.
     *
     * @param numberOfDays The number of days for the package.
     */
    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    /**
     * Returns the number of nights for the package.
     *
     * @return The number of nights for the package.
     */
    public int getNumberOfNights() {
        return numberOfNights;
    }

    /**
     * Sets the number of nights for the package.
     *
     * @param numberOfNights The number of nights for the package.
     */
    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    /**
     * Returns the hotel name for the package.
     *
     * @return The hotel name for the package.
     */
    public String getHotelName() {
        return hotelName;
    }

    /**
     * Sets the hotel name for the package.
     *
     * @param hotelName The hotel name for the package.
     */
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    /**
     * Returns the price of the package.
     *
     * @return The price of the package.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the price of the package.
     *
     * @param price The price of the package.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Returns the list of activities included in the package.
     *
     * @return The list of activities included in the package.
     */
    public List<String> getActivitiesIncluded() {
        return activitiesIncluded;
    }

    /**
     * Sets the list of activities included in the package.
     *
     * @param activitiesIncluded The list of activities included in the package.
     */
    public void setActivitiesIncluded(List<String> activitiesIncluded) {
        this.activitiesIncluded = activitiesIncluded;
    }

    /**
     * Returns a string representation of the touristic package object.
     *
     * @return A string representation of the touristic package object.
     */
    @Override
    public String toString() {

        StringBuilder activitiesIncludedString = new StringBuilder();

        if (activitiesIncluded != null && activitiesIncluded.size() != 0) {
            for (int i = 0; i < activitiesIncluded.size(); i++) {
                if (i != activitiesIncluded.size() - 1) {
                    activitiesIncludedString.append(activitiesIncluded.get(i)).append(", ");
                } else {
                    activitiesIncludedString.append(activitiesIncluded.get(i));
                }
            }
        } else {
            activitiesIncludedString = new StringBuilder("None");
        }

        return "Package Id: " + getPackageId() + "  ||  " +
                "Destination City: " + getDestinationCity() + "  ||  " +
                "Destination Country: " + getDestinationCountry() + "  ||  " +
                "Number Of Days: " + getNumberOfDays() + "  ||  " +
                "Number Of Nights: " + getNumberOfNights() + "  ||  " +
                "Hotel Name: " + getHotelName() + "  ||  " +
                "Price: " + getPrice() + "  ||  " +
                "Activities Included: " + activitiesIncludedString;
    }
}
