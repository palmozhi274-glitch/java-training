package Day9;

class Book {
    String title;

    Book(String t) {
        title = t;
    }

    void display() {
        System.out.println(title);
    }

    public static void main(String[] args) {
        Book b = new Book("Java Programming");
        b.display();
    }
}
