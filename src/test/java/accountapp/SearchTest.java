package accountapp;

import AccountManagerTest.AccountManager;
import accounts.Account;
import com.qa.app.App;
import AccountBlockedException.AccountBlockedException;
import static org.junit.Assert.*;

import org.junit.Test;


public class SearchTest {

	
		@Test 
		public void searchFirstNameTest() {
			
			AccountManager manager = new AccountManager();
			Account account1 = new Account("Jim", "Bob", "285908723");
			Account account2 = new Account("Bill", "Bob", "28234523");
			Account account3 = new Account("Ben", "Jammin", "834754327");
			Account account4 = new Account("Jim", "Frennett", "345345543");
			Account account5 = new Account("Bill", "Freedle", "48756243");
			Account account6 = new Account("Bill", "Freedle", "48756243");
			manager.addAccount(0, account1);
			manager.addAccount(1, account2);
			manager.addAccount(2, account3);
			manager.addAccount(3, account4);
			manager.addAccount(4, account5);
			manager.addAccount(5, account6);
			
			 AssertEquals(3,manager.searchForFirstName("Bill"));
			 AssertEquals(2,manager.searchForFirstName("Jim"));
			 AssertEquals(1,manager.searchForFirstName("Ben"));
		}
	}


