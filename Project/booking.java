package Project;

public class booking {

    private Customer customer;
    private RestaurantTable table;
    private String date;
    private String time;
    private int persons;

    public booking(Customer customer,
                   RestaurantTable table,
                   String date,
                   String time,
                   int persons) {

        this.customer = customer;
        this.table = table;
        this.date = date;
        this.time = time;
        this.persons = persons;
    }

    public Customer getCustomer() {
        return customer;
    }

    public RestaurantTable getTable() {
        return table;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public int getPersons() {
        return persons;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
