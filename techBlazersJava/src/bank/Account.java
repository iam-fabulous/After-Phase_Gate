package bank;

public class Account {
    private int accountNumber;
    private int balance = 0;
    private String firstName;
    private String lastName;
    private String pin;

public Account(String firstName, String lastName, String pin) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.pin = pin;
}


    public int getBalance(String pin){
        validatePin(pin);
        return this.balance;
    }

    public void deposit(int amount) {
        if (amount > 0)
            this.balance += amount;
    }

    public void withdraw(int amount, String pin) {
        validatePin(pin);
        if(balance > amount && amount > 0)
            this.balance -= amount;
    }

    private void validatePin(String pin) {
        if(!this.pin.equals(pin))
            throw new IncorrectPinException("invalid pin");
    }

    public void updatePin(String oldPin, String newPin) {
        if(oldPin.equals(this.pin)){
            this.pin = newPin;
        }
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }
}