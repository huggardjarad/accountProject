package accountapp;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class AccountTests {

	AccountManager accountManager;
	Account firstAccount;
	Account secondAccount;
	Account failAccount;
	
	@Before
	public void setUp() {
		
		accountManager = new AccountManager();
		firstAccount = new Account("Phil", "Bully", "328562589");
		secondAccount = new Account("Bill", "Francoise", "452345872");
		failAccount = new Account();
	}
	
	@Test
	public void testAddAccount() {
		assertEquals("Account Added", accountManager.addAccount(0, firstAccount));
		assertEquals("Account not found at key entry: ", accountManager.addAccount(0, firstAccount));
	}
	@Test
	public void testGetAccount() {
		assertEquals("", accountManager.getAccount(0).getAccountNumber());
		assertEquals("", accountManager.getAccount(1).getAccountNumber());
		
		accountManager.addAccount(0, firstAccount);
		assertEquals(firstAccount,accountManager.getAccount(0));
	}
	@Test
	public void testEditAccount() {
		accountManager.addAccount(0, firstAccount);
		assertEquals(firstAccount, accountManager.getAccount(0));
		assertEquals("account was not found at index 2", accountManager.editAccount(2, "fname", "lname", "accountNumber"));
	}
	@Test 
	public void testDeleteAccount() {
		accountManager.addAccount(0, firstAccount);
		assertEquals("Account Removed at index: 0", accountManager.deleteAccount(0));
	}
}
