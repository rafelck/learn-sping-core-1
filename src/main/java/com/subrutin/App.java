package com.subrutin;

import java.math.BigDecimal;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.subrutin.service.AccountService;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		AccountService accountService = appContext.getBean("accountService", AccountService.class);

		System.out.println("Account = " + accountService.getAccount(1L).getName() + " Balance :"
				+ accountService.getAccount(1L).getBalance());
		System.out.println("Account = " + accountService.getAccount(2L).getName() + " Balance :"
				+ accountService.getAccount(2L).getBalance());

		accountService.transferMoney(2L, 1L, new BigDecimal(450000));
		
		System.out.println("After Transfer");
		
		System.out.println("Account = " + accountService.getAccount(1L).getName() + " Balance :"
				+ accountService.getAccount(1L).getBalance());
		System.out.println("Account = " + accountService.getAccount(2L).getName() + " Balance :"
				+ accountService.getAccount(2L).getBalance());

	}
}
