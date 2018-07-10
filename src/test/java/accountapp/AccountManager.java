package accountapp;

import java.util.HashMap;

import accounts.Account;

public class AccountManager {

	HashMap<Integer, Account> accountMap = new HashMap<Integer, Account>();
	
	public String addAccount(int key, accountapp.Account account) {
		
		if (accountMap.containsKey(key)) {
			return "Account Added";
		}
		else {
			return "Account not found at key entry: " + key;
		}
	}
	
	public Account getAccount(int key) {
		
		if (accountMap.containsKey(key)) {
			return accountMap.get(key);
		}
		else {
			Account emptyAccount = new Account();
			return emptyAccount;
		}
	}
	
	public String deleteAccount(int key) {
		if(accountMap.containsKey(key)) {
			 accountMap.remove(key);
			 return "Account Removed at index: " + key;
		}
		else {
			return "Account does not exist";
		}
	}
	public String editAccount(int key, String firstName, String lastName, String accountNumber) {
		if (accountMap.containsKey(key)) {
			accountMap.get(key).setFirstName(firstName);
			accountMap.get(key).setLastName(lastName);
			accountMap.get(key).setAccountNumber(accountNumber);
			return "Account at index: " + key + " has been edited.";
		}
		else { 
			return "Account was not found";
		}
	}
	
}
