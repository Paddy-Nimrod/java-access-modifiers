import java.util.ArrayList;

public class Account {
    public String accountName;
    public int Balance = 0;
    public ArrayList<Integer> transactions;

    public Account(String accountName) {
        this.accountName = accountName;
        this.transactions = new ArrayList<>();
    }

    public int getBalance() {
        return Balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            this.transactions.add(amount);
            this.Balance += amount;
            System.out.println(amount + " added to your account. New account balance is: " + this.Balance);
        } else {
            System.out.println("cannot do a deposit of negative sums");
        }
    }

    public void withdraw(int amount) {
        int withdrawal = -amount;
        if (withdrawal < 0) {
            this.transactions.add(withdrawal);
            this.Balance += withdrawal;
            System.out.println(amount + " has been withdrawn from your account. New balance is: " + this.Balance);
        } else {
            System.out.println("Cannot withdraw negative sums");
        }
    }

    public void calculateBalance() {
        this.Balance = 0;
        for (int i : this.transactions) {
            this.Balance += i;
        }
        System.out.println("Calculated balance is: " + this.Balance);
    }
}
