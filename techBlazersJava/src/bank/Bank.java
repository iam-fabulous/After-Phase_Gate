package bank;

import javax.security.auth.login.AccountNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private int numberOfAccounts;
    private List<Account> accounts = new ArrayList<>();

    public Account createAccount(String firstname, String lastName, String pin) {
        Account acc = new Account(firstname, lastName, pin);
        int accountNumber = generateAccount();
        acc.setAccountNumber(accountNumber);
        accounts.add(acc);
        return acc;
    }

    private int generateAccount() {
        numberOfAccounts++;
        return numberOfAccounts;
    }

    public int getAccount() {

        return accounts.size();
    }

    public void deposit(int accountNumber, int amount) {
        Account acc = findAccount(accountNumber);
        acc.deposit(amount);
    }

    private Account findAccount(int accountNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber() == accountNumber) {
                return acc;
            }
        }
        throw new AccountDoesNotExist("Invalid Account Number!");
    }

    public int getBalance(int accountNumber,String pin) {
        Account acc = findAccount(accountNumber);
        return acc.getBalance(pin);

    }

    public void withdraw(int accountNumber, int amount, String pin) {
        Account acc = findAccount(accountNumber);
        acc.withdraw(amount, pin);
    }

    public void transfer(int senderAccount, int receiverAccount, int amount, String pin) {
        Account sender = findAccount(senderAccount);
        sender.withdraw(amount, pin);
        Account receiver = findAccount(receiverAccount);
        receiver.deposit(amount);

    }
}