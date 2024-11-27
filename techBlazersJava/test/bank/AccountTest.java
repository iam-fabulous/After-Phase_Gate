package bank;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    Account account;

    @BeforeEach
    public void setUp() {
        account = new Account("firstName", "lastName", "1234");
    }

    @Test
    public void newAccount_balanceIsZeroTest() {
        assertEquals(0, account.getBalance("1234"));
    }

    @Test
    public void newAccount_CanDepositTest(){
        account.deposit(2000);
        assertEquals(2000, account.getBalance("1234"));
    }

    @Test
    public void newAccount_CanOnlyDepositPositiveTest(){
        account.deposit(2000);
        assertEquals(2000, account.getBalance("1234"));
        account.deposit(-2000);
        assertEquals(2000, account.getBalance("1234"));
    }

    @Test
    public void newAccount_balanceCanAddDeposit(){
        account.deposit(2000);
        assertEquals(2000, account.getBalance("1234"));
        account.deposit(2000);
        assertEquals(4000, account.getBalance("1234"));
    }

    @Test
    public void newAccount_withdraw(){
        account.deposit(2000);
        assertEquals(2000, account.getBalance("1234"));
        account.withdraw(1000, "1234");
        assertEquals(1000, account.getBalance("1234"));
    }

    @Test
    public void newAccount_cannotWithdrawMoreThanBalance(){
        account.deposit(2000);
        assertEquals(2000, account.getBalance("1234"));
        account.withdraw(3000, "1234");
        assertEquals(2000, account.getBalance("1234"));
    }

    @Test
    public void newAccount_cannotWithdrawNegativeAmount(){
        account.deposit(2000);
        assertEquals(2000, account.getBalance("1234"));
        account.withdraw(-2000, "1234");
        assertEquals(2000, account.getBalance("1234"));
    }

    @Test
    public void newAccount_cannotWithdrawZeroAmount(){
        account.deposit(2000);
        assertEquals(2000, account.getBalance("1234"));
        account.withdraw(0, "1234");
        assertEquals(2000, account.getBalance("1234"));
    }

    @Test
    public void newAccount_updatePin(){
        account.deposit(2000);
        assertEquals(2000, account.getBalance("1234"));
        account.withdraw(1000, "1234");
        assertEquals(1000, account.getBalance("1234"));
        account.updatePin("1234", "1111");
        account.withdraw(500, "1111");
        assertEquals(500, account.getBalance("1111"));

    }

    @Test
    public void newAccount_can_get_firstName(){

        assertEquals("firstName", account.getFirstName());
    }
}