package Project;

import util.FileManager;
import model.Booking;
import model.Customer;
import model.RestaurantTable;


import java.util.ArrayList;

public class BookingService {

    private ArrayList<RestaurantTable> tables = new ArrayList<>();
    private ArrayList<Booking> bookings = new ArrayList<>();

    public BookingService() {

        tables.add(new RestaurantTable(1,101,2));
        tables.add(new RestaurantTable(2,102,2));
        tables.add(new RestaurantTable(3,103,4));
        tables.add(new RestaurantTable(4,104,4));
        tables.add(new RestaurantTable(5,105,6));
        tables.add(new RestaurantTable(6,106,6));
        tables.add(new RestaurantTable(7,107,8));
        tables.add(new RestaurantTable(8,108,8));
        tables.add(new RestaurantTable(9,109,10));
        tables.add(new RestaurantTable(10,110,10));
    }


    public void viewAllTables() {

        System.out.println("\n--------------------------------------------");
        System.out.println("Table\tCapacity\tStatus");
        System.out.println("--------------------------------------------");

        for (RestaurantTable t : tables) {

            String status = t.isBooked() ? "Booked" : "Available";

            System.out.println(
                    t.getTableNumber() + "\t"
                            + t.getCapacity() + "\t\t"
                            + status
            );
        }
    }


    public void viewAvailableTables() {

        System.out.println("\nAvailable Tables");

        for (RestaurantTable t : tables) {

            if (!t.isBooked()) {

                System.out.println(
                        "Table : "
                                + t.getTableNumber()
                                + " Capacity : "
                                + t.getCapacity()
                );
            }
        }
    }


    public void searchTable(int tableNumber) {

        for (RestaurantTable t : tables) {

            if (t.getTableNumber() == tableNumber) {

                System.out.println("\nTable Found");

                System.out.println("Table Number : " + t.getTableNumber());
                System.out.println("Capacity : " + t.getCapacity());

                if (t.isBooked())
                    System.out.println("Status : Booked");
                else
                    System.out.println("Status : Available");

                return;
            }
        }

        System.out.println("Table Not Found");
    }


    public void bookTable(String name,
                          String phone,
                          int tableNumber,
                          String date,
                          String time,
                          int persons) {

        for (RestaurantTable t : tables) {

            if (t.getTableNumber() == tableNumber) {

                if (t.isBooked()) {
                    System.out.println("Table Already Booked");
                    return;
                }

                if (persons > t.getCapacity()) {
                    System.out.println("Table Capacity Exceeded");
                    return;
                }

                Customer customer = new Customer(name, phone);

                Booking booking = new Booking(
                        customer,
                        t,
                        date,
                        time,
                        persons
                );


                bookings.add(booking);


                FileManager.save(
                        name + "," +
                                phone + "," +
                                tableNumber + "," +
                                persons + "," +
                                date + "," +
                                time
                );

                t.setBooked(true);

                System.out.println("Booking Successful");

                return;
            }
        }

        System.out.println("Invalid Table Number");
    }


    public void cancelBooking(int tableNumber) {

        for (Booking b : bookings) {

            if (b.getTable().getTableNumber() == tableNumber) {

                b.getTable().setBooked(false);

                bookings.remove(b);

                System.out.println("Booking Cancelled");

                return;
            }
        }

        System.out.println("Booking Not Found");
    }


    public void viewBookings() {

        if (bookings.isEmpty()) {

            System.out.println("No Bookings Available");
            return;
        }

        System.out.println("\n-----------------------------------------------------------");

        System.out.println("Customer\tTable\tPersons\tDate\tTime");

        System.out.println("-----------------------------------------------------------");

        for (Booking b : bookings) {

            System.out.println(
                    b.getCustomer().getName()
                            + "\t\t"
                            + b.getTable().getTableNumber()
                            + "\t"
                            + b.getPersons()
                            + "\t"
                            + b.getDate()
                            + "\t"
                            + b.getTime()
            );
        }
    }


    public void searchBooking(String phone) {

        for (Booking b : bookings) {

            if (b.getCustomer().getPhone().equals(phone)) {

                System.out.println("\nBooking Found");

                System.out.println("Customer : "
                        + b.getCustomer().getName());

                System.out.println("Phone : "
                        + b.getCustomer().getPhone());

                System.out.println("Table : "
                        + b.getTable().getTableNumber());

                System.out.println("Date : "
                        + b.getDate());

                System.out.println("Time : "
                        + b.getTime());

                return;
            }
        }

        System.out.println("Booking Not Found");
    }


    public void deleteBooking(String phone) {

        for (Booking b : bookings) {

            if (b.getCustomer().getPhone().equals(phone)) {

                b.getTable().setBooked(false);

                bookings.remove(b);

                System.out.println("Booking Deleted");

                return;
            }
        }

        System.out.println("Booking Not Found");
    }
    public void dashboard() {

        int booked = 0;

        for (RestaurantTable t : tables) {

            if (t.isBooked())
                booked++;
        }

        System.out.println("\n========= Dashboard =========");

        System.out.println("Total Tables      : " + tables.size());

        System.out.println("Booked Tables     : " + booked);

        System.out.println("Available Tables  : " + (tables.size() - booked));

        System.out.println("Total Bookings    : " + bookings.size());

        System.out.println("=============================");
    }
    public void generateReceipt(String phone) {

        for (Booking b : bookings) {

            if (b.getCustomer().getPhone().equals(phone)) {

                double bookingCharge = 200.0;
                double gst = bookingCharge * 0.18;
                double total = bookingCharge + gst;

                System.out.println("\n==========================================");
                System.out.println("        RESTAURANT BOOKING RECEIPT");
                System.out.println("==========================================");
                System.out.println("Customer Name : " + b.getCustomer().getName());
                System.out.println("Phone Number  : " + b.getCustomer().getPhone());
                System.out.println("Table Number  : " + b.getTable().getTableNumber());
                System.out.println("Capacity      : " + b.getTable().getCapacity());
                System.out.println("Persons       : " + b.getPersons());
                System.out.println("Booking Date  : " + b.getDate());
                System.out.println("Booking Time  : " + b.getTime());
                System.out.println("------------------------------------------");
                System.out.println("Booking Charge : ₹200.0");
                System.out.println("GST (18%)      : ₹36.0");
                System.out.println("Total Amount   : ₹236.0");
                System.out.println("------------------------------------------");
                System.out.println("Status         : CONFIRMED");
                System.out.println("==========================================");
                System.out.println("      Thank You! Visit Again.");
                System.out.println("==========================================");

                return;
            }
        }

        System.out.println("Booking Not Found.");
    }

}
