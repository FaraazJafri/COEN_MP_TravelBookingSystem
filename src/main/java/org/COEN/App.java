package org.COEN;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {

    List<TouristicPackage> packages;

    List<Customer> customers;

    List<Booking> bookings;

    public App() {
        packages = new ArrayList<>();
        customers = new ArrayList<>();
        bookings = new ArrayList<>();
    }

    public static void main(String[] args) {

        System.out.println("------------------------Welcome to Travel Booking System-----------------------");
        App obj = new App();

        obj.mainMenu();

    }

    public void mainMenu() {


        Scanner sc = new Scanner(System.in);

        System.out.println("Please select a option from below:");
        System.out.println("1. Create a Package");
        System.out.println("2. Create a Customer");
        System.out.println("3. Book a Package");
        System.out.println("4. Modify Booking");
        System.out.println("5. Booking Report");
        System.out.println("6. List of Customers/Packages/Booking");
        System.out.println("7. Exit");
        System.out.println("-------------------------------------------------------------------------------");

        int option = sc.nextInt();
        sc.nextLine();

        if (option == 1) {
            System.out.println("-----------------------------Create Package---------------------------------");

            System.out.println("Please enter destination city:");
            String destionationCity = sc.nextLine();

            System.out.println("Please enter destination country:");
            String destinationCountry = sc.nextLine();

            System.out.println("Please enter number of days:");
            int noOfDays = sc.nextInt();

            System.out.println("Please enter number of nights");
            int noOfNights = sc.nextInt();
            sc.nextLine();

            System.out.println("Please enter hotel name:");
            String hotelName = sc.nextLine();

            System.out.println("Please enter the price of the package:");
            int price = sc.nextInt();

            System.out.println("Please enter the number of activities included:");
            int activitiesNumber = sc.nextInt();
            sc.nextLine();

            List<String> activitesIncluded = new ArrayList<>();

            for (int i = 0; i < activitiesNumber; i++) {
                System.out.println("Enter " + (i + 1) + " activity:");
                String activity = sc.nextLine();
                activitesIncluded.add(activity);
            }

            TouristicPackage newPackage = new TouristicPackage(destionationCity, destinationCountry, noOfDays, noOfNights, hotelName, price, activitesIncluded);

            packages.add(newPackage);

            System.out.println("Package Successfully Added!!!");
            System.out.println("-------------------------------------------------------------------------------------------------");


            mainMenu();
        } else if (option == 2) {
            createCustomer();
            mainMenu();
        } else if (option == 3) {

            System.out.println("------------------------------------------Book Package-----------------------------------------");

            System.out.println("List of Packages are below, please select one:");

            for (int i = 0; i < packages.size(); i++) {
                System.out.println(packages.get(i));
            }

            System.out.println("-------------------------------------------------------------------------------------------------");
            int packageSelectedId = sc.nextInt();
            sc.nextLine();

            TouristicPackage packageSelected = null;

            for (int i = 0; i < packages.size(); i++) {
                if (packageSelectedId == packages.get(i).getPackageId()) {
                    packageSelected = packages.get(i);
                }
            }

            System.out.println("You Selected this package:");
            System.out.println(packageSelected);
            System.out.println("-------------------------------------------------------------------------------------------------");

            System.out.println();
            System.out.println("Please select one option below:");
            System.out.println("1. Existing Customer");
            System.out.println("2. New Customer");

            int op = sc.nextInt();
            sc.nextLine();


            if (op == 1) {
                System.out.println("List of Customers are below, please select one:");

                for (int i = 0; i < customers.size(); i++) {
                    System.out.println(customers.get(i));
                }

                System.out.println("-------------------------------------------------------------------------------------------------");
                int customerSelectedId = sc.nextInt();
                sc.nextLine();

                Customer customerSelected = null;

                for (int i = 0; i < customers.size(); i++) {
                    if (customerSelectedId == customers.get(i).getCustomerId()) {
                        customerSelected = customers.get(i);
                    }
                }


                System.out.println("You Selected this customer:");
                System.out.println(customerSelected);
                System.out.println("-------------------------------------------------------------------------------------------------");

                System.out.println("Please enter the departure date (DD/MM/YYYY):");
                String departureDate = sc.nextLine();

                Booking newBooking = new Booking(customerSelected, packageSelected, departureDate);

                bookings.add(newBooking);

                System.out.println("Booking Added Successfully!!!");
                System.out.println("-------------------------------------------------------------------------------------------------");
                mainMenu();
            } else if (op == 2) {
                Customer newCustomer = createCustomer();
                System.out.println("Please enter the departure date (DD/MM/YYYY):");
                String departureDate = sc.nextLine();

                Booking newBooking = new Booking(newCustomer, packageSelected, departureDate);

                bookings.add(newBooking);

                System.out.println("Booking Added Successfully!!!");
                System.out.println("-------------------------------------------------------------------------------------------------");
                mainMenu();
            }
        } else if (option == 4) {
            modifyBooking();
        } else if (option == 5) {
            bookingReports();
            mainMenu();
        } else if (option == 6) {
            listMenu();
        } else if (option == 7) {
            System.out.println("-----------------------Thank You for using the Travel Booking System------------------------------------------");
            System.exit(0);
        }
    }

    public void modifyBooking() {
        System.out.println("--------------------------Modify Booking--------------------------------------------------");

        System.out.println("Please enter an option from below:");
        System.out.println("1. Make changes to booking");
        System.out.println("2. Cancel booking");
        System.out.println("3. Exit to Main Menu");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        sc.nextLine();


        if (option == 1) {

            System.out.println();
            System.out.println("List of Customers are below, please select one:");

            for (int i = 0; i < customers.size(); i++) {
                System.out.println(customers.get(i));
            }

            System.out.println("-------------------------------------------------------------------------------------------------");
            int customerSelectedId = sc.nextInt();
            sc.nextLine();

            Customer customerSelected = null;

            for (int i = 0; i < customers.size(); i++) {
                if (customerSelectedId == customers.get(i).getCustomerId()) {
                    customerSelected = customers.get(i);
                }
            }


            System.out.println("You Selected this customer:");
            System.out.println(customerSelected);
            System.out.println("-------------------------------------------------------------------------------------------------");
            System.out.println();
            System.out.println("Bookings for this customer are, please select the one you wish to modify: ");


            for (int i = 0; i < bookings.size(); i++) {
                if (customerSelectedId == bookings.get(i).getCustomer().getCustomerId()) {
                    System.out.println(bookings.get(i));
                }
            }

            System.out.println("-------------------------------------------------------------------------------------------------");
            int bookingSelectedId = sc.nextInt();
            sc.nextLine();

            Booking bookingSelected = null;

            for (int i = 0; i < bookings.size(); i++) {
                if (bookingSelectedId == bookings.get(i).getBookingId()) {
                    bookingSelected = bookings.get(i);
                }
            }

            System.out.println("You Selected this booking:");
            System.out.println(bookingSelected);
            System.out.println("-------------------------------------------------------------------------------------------------");

            System.out.println("Please enter the new departure date (DD/MM/YYYY):");
            String departureDate = sc.nextLine();

            bookings.remove(bookingSelected);
            bookingSelected.setDepartureDate(departureDate);

            bookings.add(bookingSelected);

            System.out.println("Booking Modified Successfully!!!");
            System.out.println("-------------------------------------------------------------------------------------------------");
            modifyBooking();
        } else if (option == 2) {
            System.out.println();
            System.out.println("List of Customers are below, please select one:");

            for (int i = 0; i < customers.size(); i++) {
                System.out.println(customers.get(i));
            }

            System.out.println("-------------------------------------------------------------------------------------------------");
            int customerSelectedId = sc.nextInt();
            sc.nextLine();

            Customer customerSelected = null;

            for (int i = 0; i < customers.size(); i++) {
                if (customerSelectedId == customers.get(i).getCustomerId()) {
                    customerSelected = customers.get(i);
                }
            }


            System.out.println("You Selected this customer:");
            System.out.println(customerSelected);
            System.out.println("-------------------------------------------------------------------------------------------------");
            System.out.println();
            System.out.println("Bookings for this customer are, please select the one you wish to delete: ");


            for (int i = 0; i < bookings.size(); i++) {
                if (customerSelectedId == bookings.get(i).getCustomer().getCustomerId()) {
                    System.out.println(bookings.get(i));
                }
            }

            System.out.println("-------------------------------------------------------------------------------------------------");
            int bookingSelectedId = sc.nextInt();
            sc.nextLine();

            Booking bookingSelected = null;

            for (int i = 0; i < bookings.size(); i++) {
                if (bookingSelectedId == bookings.get(i).getBookingId()) {
                    bookingSelected = bookings.get(i);
                }
            }

            System.out.println("You Selected this booking:");
            System.out.println(bookingSelected);
            System.out.println("-------------------------------------------------------------------------------------------------");

            bookings.remove(bookingSelected);

            System.out.println("Booking Modified Successfully!!!");
            System.out.println("-------------------------------------------------------------------------------------------------");
            modifyBooking();
        } else if (option == 3) {
            mainMenu();
        }

    }

    public Customer createCustomer() {

        Scanner sc = new Scanner(System.in);

        System.out.println("--------------------------------Create Customer-------------------------------------");

        System.out.println("Please enter your first name:");
        String firstName = sc.nextLine();

        System.out.println("Please enter your last name:");
        String lastName = sc.nextLine();

        System.out.println("Please enter your date of birth (DD/MM/YYYY)");
        String dob = sc.nextLine();

        System.out.println("Please enter your email:");
        String email = sc.nextLine();

        Customer newCustomer = new Customer(firstName, lastName, dob, email);

        customers.add(newCustomer);

        System.out.println("Customer Added Successfully!!!");
        System.out.println("-------------------------------------------------------------------------------------------------");
        return newCustomer;
    }

    public void listMenu() {
        System.out.println("------------------------------------------List-----------------------------------------");

        System.out.println("Please select the option:");
        System.out.println("1. List of Packages");
        System.out.println("2. List of Customers");
        System.out.println("3. List of Bookings");
        System.out.println("4. Return to Main Menu");

        Scanner sc = new Scanner(System.in);

        int option = sc.nextInt();
        sc.nextLine();

        if (option == 1) {
            for (int i = 0; i < packages.size(); i++) {
                System.out.println(packages.get(i));
            }
            System.out.println("-------------------------------------------------------------------------------------------------");
            listMenu();
        } else if (option == 2) {
            for (int i = 0; i < customers.size(); i++) {
                System.out.println(customers.get(i));
            }
            System.out.println("-------------------------------------------------------------------------------------------------");
            listMenu();
        } else if (option == 3) {
            for (int i = 0; i < bookings.size(); i++) {
                System.out.println(bookings.get(i));
            }
            System.out.println("-------------------------------------------------------------------------------------------------");
            listMenu();
        } else if (option == 4) {
            System.out.println("-------------------------------------------------------------------------------------------------");
            mainMenu();
        }
    }

    public void bookingReports() {
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------------------------------Booking Report-----------------------------------------");


        System.out.println("Please select one option below:");
        System.out.println("1. Report of all packages");
        System.out.println("2. Report of particular package");
        System.out.println("3. Return to Main Menu");


        int op = sc.nextInt();
        sc.nextLine();


        if(op == 1){
            System.out.println("Below is the information of all packages:");
            System.out.println();
            System.out.println("-------------------------------------------------------------------------------------------------");

            for (int i = 0; i < packages.size(); i++) {
                int numberOfBookings = 0;
                double revenue = 0;
                for (int j = 0; j < bookings.size(); j++) {
                    if(packages.get(i).getPackageId() == bookings.get(j).getTouristPackage().getPackageId()){
                        numberOfBookings++;
                    }
                }

                revenue = packages.get(i).getPrice() * numberOfBookings;

                System.out.println("-------------------------------------------------------------------------------------------------");
                System.out.println("For this package:");
                System.out.println(packages.get(i));
                System.out.println("The number of bookings are: " + numberOfBookings + " and the total revenue is: " + revenue);
                System.out.println("-------------------------------------------------------------------------------------------------");
                System.out.println();

            }
            bookingReports();
        }else if (op == 2) {
            System.out.println("List of Packages are below, please select one:");

            for (int i = 0; i < packages.size(); i++) {
                System.out.println(packages.get(i));
            }

            System.out.println("-------------------------------------------------------------------------------------------------");
            int packageSelectedId = sc.nextInt();
            sc.nextLine();

            TouristicPackage packageSelected = null;

            for (int i = 0; i < packages.size(); i++) {
                if (packageSelectedId == packages.get(i).getPackageId()) {
                    packageSelected = packages.get(i);
                }
            }

            double revenue = 0;
            int numberOfBookings = 0;

            for (int i = 0; i < bookings.size(); i++) {
                if (packageSelected.getPackageId() == bookings.get(i).getTouristPackage().getPackageId()) {
                    numberOfBookings++;
                }
            }

            revenue = packageSelected.getPrice() * numberOfBookings;

            System.out.println("-------------------------------------------------------------------------------------------------");
            System.out.println("For this package:");
            System.out.println(packageSelected);
            System.out.println("The number of bookings are: " + numberOfBookings + " and the total revenue is: " + revenue);
            System.out.println("-------------------------------------------------------------------------------------------------");
            System.out.println();
            bookingReports();
        }else if(op == 3){
            System.out.println("-------------------------------------------------------------------------------------------------");
            mainMenu();
        }

    }
}
