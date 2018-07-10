package AccountManagerTest;

import java.util.HashMap;
import java.util.Map;

import AccountBlockedException.AccountBlockedException;
import accounts.Account;

public class AccountManager {

	HashMap<Integer, Account> accountMap = new HashMap<Integer, Account>();
	
	public String addAccount(int key, Account account) {
		
		if (accountMap.containsKey(key)) {
			return "Invalid Key Entry";
		}
		else {
			accountMap.put(key, account);
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
	public Account blockedAccountCheck(int key) throws AccountBlockedException{
		
		if (accountMap.get(key).getAccountNumber().equals("123456")) {
			throw new AccountBlockedException("This account has been blocked");
		}
		else {
			return accountMap.get(key);
		}
		
	}
	public int searchForFirstName(String firstName) {
		int count = 0;
		for(Map.Entry<Integer, Account> entry : accountMap.entrySet()) {
			
			if(entry.getValue().getFirstName().equals(firstName)) {
				count ++;
			}
		}
		return count;
	}
	
}
