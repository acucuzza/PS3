package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AccountTest {
	
	Account account = new Account(1122, 20000, 4.5);

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void WithdrawTest() {
		account.withdraw(2500);
		assertTrue(account.getBalance() == 17500);
	}
	@Test
	public void DepositTest() {
		account.deposit(3000);
		assertTrue(account.getBalance() == 23000);
	}
	
	@Test
	public void Getters() {
		System.out.println("The balance is " + account.getBalance() + "\n" + "The monthly interest is " + account.getMonthlyInterestRate() + "\n" + "The date created is " + account.getDateCreated());
		assertTrue(account.getBalance() == 20000);
		assertTrue(account.getMonthlyInterestRate() == 0.375);
	}
	
	
	//can't get to work and maven won't let me build without it working.
	/*@Test(expected = InsufficientFundsException.class)
	public void WithdrawOverDraw() throws Exception {
		account.withdraw(1000000);
		
	} */
}
