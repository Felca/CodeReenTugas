package solution;

public class Account {
	String name, creationDate;
    int number, balance;
    Account (String n, int num, String date, int bal) {
        name = n;
        number = num;
        creationDate = date;
        balance = bal;
    }
    void display() {
        System.out.println("Salary Account - Name: " + name + ", Account Number: " + number +
                ", Creation Date: " + creationDate + ", Balance: " + balance);
    }
    void updateBalance(int amount) {
        balance += amount;
    }
}
