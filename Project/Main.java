package Project;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BookingService service = new BookingService();

        System.out.println("====================================");
        System.out.println(" RESTAURANT TABLE BOOKING SYSTEM");
        System.out.println("====================================");

        System.out.print("Username : ");
        String username = sc.nextLine();

        System.out.print("Password : ");
        String password = sc.nextLine();

        if (!username.equals("palmozhi") || !password.equals("051123")) {
            System.out.println("Invalid Username or Password");
            return;
        }

        System.out.println("\nLogin Successful!");

        int choice;

        do {

            System.out.println("\n====================================");
            System.out.println("Restaurant Booking Menu");
            System.out.println("====================================");
            System.out.println("1. View All Tables");
            System.out.println("2. View Available Tables");
            System.out.println("3. Search Table");
            System.out.println("4. Book Table");
            System.out.println("5. Cancel Booking");
            System.out.println("6. Search Booking");
            System.out.println("7. View All Bookings");
            System.out.println("8. Delete Booking");
            System.out.println("9. Dashboard");
            System.out.println("10. Generate Receipt");
            System.out.println("11. View Saved File");
            System.out.println("12. Exit");
            System.out.print("Enter your choice : ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    service.viewAllTables();
                    break;

                case 2:
                    service.viewAvailableTables();
                    break;

                case 3:
                    System.out.print("Enter Table Number : ");
                    int tableNo = sc.nextInt();
                    service.searchTable(tableNo);
                    break;

                case 4:

                    sc.nextLine();

                    String name;
                    do {
                        System.out.print("Customer Name : ");
                        name = sc.nextLine();

                        if (name.trim().isEmpty()) {
                            System.out.println("Name cannot be empty.");
                        }

                    } while (name.trim().isEmpty());


                    String phone;
                    do {
                        System.out.print("Phone Number : ");
                        phone = sc.nextLine();

                        if (!phone.matches("\\d{10}")) {
                            System.out.println("Phone number must contain exactly 10 digits.");
                        }

                    } while (!phone.matches("\\d{10}"));


                    int table;
                    do {
                        System.out.print("Table Number (101-110): ");
                        table = sc.nextInt();

                        if (table < 101 || table > 110) {
                            System.out.println("Invalid Table Number.");
                        }

                    } while (table < 101 || table > 110);

                    int persons;
                    do {
                        System.out.print("Number of Persons : ");
                        persons = sc.nextInt();

                        if (persons <= 0) {
                            System.out.println("Persons must be greater than 0.");
                        }

                    } while (persons <= 0);

                    sc.nextLine();

                    System.out.print("Booking Date : ");
                    String date = sc.nextLine();

                    System.out.print("Booking Time : ");
                    String time = sc.nextLine();

                    service.bookTable(
                            name,
                            phone,
                            table,
                            date,
                            time,
                            persons
                    );

                    break;

                case 5:

                    System.out.print("Enter Table Number : ");
                    int cancelTable = sc.nextInt();

                    service.cancelBooking(cancelTable);

                    break;

                case 6:

                    sc.nextLine();

                    System.out.print("Enter Phone Number : ");
                    String searchPhone = sc.nextLine();

                    service.searchBooking(searchPhone);

                    break;

                case 7:

                    service.viewBookings();

                    break;

                case 8:

                    sc.nextLine();

                    System.out.print("Enter Phone Number : ");
                    String deletePhone = sc.nextLine();

                    service.deleteBooking(deletePhone);

                    break;

                case 9:

                    service.dashboard();

                    break;

                case 10:

                    sc.nextLine();

                    System.out.print("Enter Phone Number : ");
                    String receiptPhone = sc.nextLine();

                    service.generateReceipt(receiptPhone);

                    break;

                case 11:

                    FileManager.displayFile();

                    break;

                case 12:

                    System.out.println("Thank You! Visit Again.");

                    break;

                default:

                    System.out.println("Invalid Choice.");

            }

        } while (choice != 12);

        sc.close();
    }
}
