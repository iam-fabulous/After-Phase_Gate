package bank;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AccountTest1 {
    Account account;

    @BeforeEach
    public void setup(){
        account = new Account(1, "Ebuka", "chuks", "1234");
    }



    @Test
    public void newAccount_balanceIsZeroTest(){
        Account account = new Account(1, "femi", "jacob", "0000");
        int result = account.getBalance();
       assertEquals(0, result);
//        account.setBalance(0);
    }

//    @Test
//    public void testMode(){
//        account.getBalance();
//    }

//    @Test
//    public void newAccount_canDepositTest(){
//        account.setBalance(2000);
//        assertEquals(2000, account.getBalance());
//    }
//
//    @Test
//    public void newAccount_canDepositOnlyPositiveTest(){
//        account.setBalance(2000);
//        assertEquals(2000, account.getBalance());
//        account.setBalance(-2000);
//        assertEquals(2000, account.getBalance());
//    }
//
//    @Test
//    public void newAccount_balanceCanAddDepositTest(){
//        account.setBalance(2000);
//        assertEquals(2000, account.getBalance());
//        account.setBalance(3000);
//        assertEquals(5000, account.getBalance());
//    }
//
//    @Test
//    public void newAccount_canWithdrawTest(){
//        account.setBalance(2000);
//        account.withdraw(1000);
//        assertEquals(1000, account.getBalance());
//    }
//
//    @Test
//        public void newAccount_cannotWithdrawMoreThanBalanceTest(){
//        account.setBalance(2000);
//        account.withdraw(5000);
//        assertEquals(2000, account.getBalance());
//    }
//
//    @Test
//        public void newAccount_cannotWithdrawNegativeAmountTest(){
//        account.setBalance(2000);
//        account.withdraw(-1000);
//        assertEquals(2000, account.getBalance());
//    }
}