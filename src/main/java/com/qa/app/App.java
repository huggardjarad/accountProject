package com.qa.app;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.thoughtworks.xstream.XStream;

import AccountBlockedException.AccountBlockedException;
import AccountManagerTest.AccountManager;
import accounts.Account;

public class App {

	public static void main(String[] args) throws AccountBlockedException {
		AccountManager manager = new AccountManager();
		Account account1 = new Account("Jarad", "Huggard", "04589645");
		ObjectMapper mapper = new ObjectMapper();
		XStream xstream = new XStream();
		
		manager.addAccount(0, account1);
		try {
			String jsonStr = mapper.writeValueAsString(manager.getAccount(0));
			System.out.println(jsonStr+"\n");
		}catch(IOException e) {
			e.printStackTrace();
		}
		String xmlStr = xstream.toXML(manager.getAccount(0));
		System.out.println(xmlStr);
		
		Account account2 = new Account("Sam", "Kirk", "123456");
		manager.addAccount(1, account2);
		manager.blockedAccountCheck(1);
		
	}

}
