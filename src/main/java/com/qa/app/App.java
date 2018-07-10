package com.qa.app;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import AccountManagerTest.AccountManager;
import accounts.Account;

public class App {

	public static void main(String[] args) {
		AccountManager manager = new AccountManager();
		Account account1 = new Account("Jarad", "Huggard", "04589645");
		ObjectMapper mapper = new ObjectMapper();
		
		manager.addAccount(0, account1);
		try {
			String jsonStr = mapper.writeValueAsString(manager.getAccount(0));
			System.out.println(jsonStr);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
