package accountapp;

import AccountManagerTest.AccountManager;
import accounts.Account;
import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTests {

	AccountManager accountManager = new AccountManager();
	Account firstAccount = new Account("Phil", "Bully", "328562589");
	Account secondAccount = new Account("Bill", "Francoise", "452345872");
	Account failAccount = new Account();
	
	
	@Test
	public void testAddAccount() {
 		assertEquals("Account not found at key entry: 0", accountManager.addAccount(0, firstAccount));
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
		assertEquals("Account at index: 0 has been edited.", accountManager.editAccount(0, "fname", "lname", "accountNumber"));
	}
	@Test 
	public void testDeleteAccount() {
		accountManager.addAccount(0, firstAccount);
		assertEquals("Account Removed at index: 0", accountManager.deleteAccount(0));
	}
	
}
