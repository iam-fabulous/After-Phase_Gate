package bank;


public class Account {

private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double amount) {
        if(amount > 0)
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if(balance >= amount)
        this.balance -= amount;
    }
}
