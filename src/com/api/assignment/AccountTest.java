package com.api.assignment;

import org.junit.Assert;
import org.junit.Test;

public class AccountTest {
    private double epsilon = 1e-6;

        @Test
        public void accountCannotHaveNegativeOverdraftLimit() {
            Account account = new Account(-20);

            Assert.assertEquals(0d, account.getOverdraftLimit(), epsilon);
        }
        @Test
        public void accountDeposit() {
            Account account = new Account(100);
            Assert.assertEquals(false, account.deposit(-10));
        }
        @Test
        public void accountWithdraw() {
            Account account = new Account(100);
            Assert.assertEquals(false, account.withdraw(-10));
        }

        @Test
        public void accountOverStep() {
            Account account = new Account(100);
            Assert.assertEquals(false, account.withdraw(200));
        }

    @Test
    public void accountCorrectAmountDeposit() {
        Account account = new Account(100);
        Assert.assertEquals(true, account.deposit(10));
    }
    @Test
    public void accountCorrectAmountDeposit1() {
        Account account = new Account(100);
        Assert.assertEquals(true, account.deposit(10));
        Assert.assertEquals(10d, account.getBalance(),epsilon);
    }
    @Test
    public void accountCorrectAmountWithdraw() {
        Account account = new Account(100);
        Assert.assertEquals(true, account.withdraw(10));
    }
}
