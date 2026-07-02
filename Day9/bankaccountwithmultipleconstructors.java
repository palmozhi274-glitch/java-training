package Day9;

class BankAccount {
    int balance;

    BankAccount() {
        this(1000);
    }

    BankAccount(int b) {
        balance = b;
    }

    void display() {
        System.out.println(balance);
    }

    public static void main(String[] args) {
        BankAccount a = new BankAccount();
        a.display();
    }
}
