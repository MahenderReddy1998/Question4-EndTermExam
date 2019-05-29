package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class ToughQuestion2 {
	Account a = new Account(1,"venkat","current",5000);
	@SuppressWarnings("static-access")
    @Test
    public void testCredit()
    {
		assertEquals(10000,a.credit(5000));
    }
	@SuppressWarnings("static-access")
    @Test
    public void debit()
    {
		assertEquals(3000,a.debit(2000));
    }
}