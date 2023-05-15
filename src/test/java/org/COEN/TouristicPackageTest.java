package org.COEN;

import org.junit.After;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TouristicPackageTest {

    TouristicPackage touristicPackage;

    @After
    public void tearDown() {
        Booking.resetCounter();
        Customer.resetCounter();
        TouristicPackage.resetCounter();
    }

    @BeforeEach
    void setUp() {
        List<String> activitiesIncluded = new ArrayList<>();
        activitiesIncluded.add("City Tour");
        activitiesIncluded.add("Boat Ride");
        touristicPackage = new TouristicPackage("Boston", "US", 5, 4, "Eiffel Hotel", 1500.0, activitiesIncluded);
    }

    @Test
    void testConstructorAndGetters() {
        assertEquals(1, touristicPackage.getPackageId());
        assertEquals("Boston", touristicPackage.getDestinationCity());
        assertEquals("US", touristicPackage.getDestinationCountry());
        assertEquals(5, touristicPackage.getNumberOfDays());
        assertEquals(4, touristicPackage.getNumberOfNights());
        assertEquals("Eiffel Hotel", touristicPackage.getHotelName());
        assertEquals(1500.0, touristicPackage.getPrice());
        assertEquals(2, touristicPackage.getActivitiesIncluded().size());
        assertEquals("City Tour", touristicPackage.getActivitiesIncluded().get(0));
        assertEquals("Boat Ride", touristicPackage.getActivitiesIncluded().get(1));
    }

    @Test
    void testSetters() {
        touristicPackage.setDestinationCity("London");
        touristicPackage.setDestinationCountry("UK");
        touristicPackage.setNumberOfDays(7);
        touristicPackage.setNumberOfNights(6);
        touristicPackage.setHotelName("The Ritz");
        touristicPackage.setPrice(2500.0);

        assertEquals("London", touristicPackage.getDestinationCity());
        assertEquals("UK", touristicPackage.getDestinationCountry());
        assertEquals(7, touristicPackage.getNumberOfDays());
        assertEquals(6, touristicPackage.getNumberOfNights());
        assertEquals("The Ritz", touristicPackage.getHotelName());
        assertEquals(2500.0, touristicPackage.getPrice());
    }

    @Test
    void testSetActivitiesIncluded() {
        List<String> newActivities = new ArrayList<>();
        newActivities.add("Museum Visit");
        newActivities.add("Shopping");
        touristicPackage.setActivitiesIncluded(newActivities);

        assertEquals(2, touristicPackage.getActivitiesIncluded().size());
        assertEquals("Museum Visit", touristicPackage.getActivitiesIncluded().get(0));
        assertEquals("Shopping", touristicPackage.getActivitiesIncluded().get(1));
    }

    @Test
    void testResetCounter() {
        TouristicPackage.resetCounter();
        TouristicPackage newPackage = new TouristicPackage("Rome", "Italy", 3, 2, "Colosseum Hotel", 1000.0, new ArrayList<>());

        assertEquals(1, newPackage.getPackageId());
    }
}

