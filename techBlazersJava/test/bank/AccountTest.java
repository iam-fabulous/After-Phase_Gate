package bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {
    @Test
    public void newAccount_balanceIsZeroTest(){
        Account account = new Account();
        assertEquals(0, account.getBalance());
    }

    @Test
    public void newAccount_canDepositTest(){
        Account account = new Account();
        account.setBalance(2000);
        assertEquals(2000, account.getBalance());
    }

    @Test
    public void newAccount_canDepositOnlyPositiveTest(){
        Account account = new Account();
        account.setBalance(2000);
        assertEquals(2000, account.getBalance());
        account.setBalance(-2000);
        assertEquals(2000, account.getBalance());
    }

    @Test
    public void newAccount_balanceCanAddDepositTest(){
        Account account = new Account();
        account.setBalance(2000);
        assertEquals(2000, account.getBalance());
        account.setBalance(3000);
        assertEquals(5000, account.getBalance());
    }

    @Test
    public void newAccount_canWithdrawTest(){
        Account account = new Account();
        account.setBalance(2000);
        account.withdraw(1000);
        assertEquals(1000, account.getBalance());
    }

    @Test public void newAccount_cannotWithdrawMoreThanBalanceTest(){
        Account account = new Account();
        account.setBalance(2000);
        account.withdraw(5000);
        assertEquals(2000, account.getBalance());
    }

    @Test public void newAccount_cannotWithdrawMoreNegativeAmountTest(){
        Account account = new Account();
        account.setBalance(2000);
        account.withdraw(-1000);
        assertEquals(2000, account.getBalance());
    }
}