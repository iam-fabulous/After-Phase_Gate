package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BankTest {
    Bank bank;
    Account account;
    @BeforeEach
    public void setUp() {
        bank = new Bank();
        account = createNewAccount();
    }
    @Test
    public void Bank_Can_CreateAccount(){
       // Account account = createNewAccount();
        assertNotNull(account);
        assertEquals(1, bank.getAccount());
    }

    private Account createNewAccount() {
        Account account = bank.createAccount("Firstname", "last name", "1111");
        return account;
    }

    @Test
    public void Bank_Can_Deposit(){
       // Account account = createNewAccount();
        bank.deposit(account.getAccountNumber(), 2000);
        assertEquals(2000, bank.getBalance(1, "1111"));
    }

    @Test
    public void Bank_Can_Withdraw(){
        bank.deposit(account.getAccountNumber(), 2000);
        assertEquals(2000, bank.getBalance(1, "1111"));
        bank.withdraw(1,1000,"1111");
        assertEquals(1000, bank.getBalance(1, "1111"));
    }

    @Test
    public void Bank_Can_Transfer(){
        bank.deposit(account.getAccountNumber(), 2000);
        assertEquals(2000, bank.getBalance(1, "1111"));
        bank.transfer(1,2,1000,"1111");
        assertEquals(1000, bank.getBalance(1, "1111"));
    }
}
