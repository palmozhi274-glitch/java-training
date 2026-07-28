package Project;

public class restauranttable {

    private int tableId;
    private int tableNumber;
    private int capacity;
    private boolean booked;

    public restauranttable(int tableId, int tableNumber, int capacity) {
        this.tableId = tableId;
        this.tableNumber = tableNumber;
        this.capacity = capacity;
        this.booked = false;
    }

    public int getTableId() {
        return tableId;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }
}