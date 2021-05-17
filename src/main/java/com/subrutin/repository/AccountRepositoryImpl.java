package com.subrutin.repository;

import java.math.BigDecimal;
import java.util.*;

import com.subrutin.domain.Account;

public class AccountRepositoryImpl implements AccountRepository {

	private Map<Long, Account> accountMap = new HashMap<Long, Account>();
	{
		Account account1 = new Account();
		account1.setId(1L);
		account1.setAccountNumber("145314010");
		account1.setName("Rafelino");
		account1.setBalance(new BigDecimal(100000));

		Account account2 = new Account();
		account2.setId(2L);
		account2.setAccountNumber("145314011");
		account2.setName("Angelica");
		account2.setBalance(new BigDecimal(500000));
		
		accountMap.put(account1.getId(), account1);
		accountMap.put(account2.getId(), account2);
	}

	@Override
	public void update(Account account) {
		accountMap.put(account.getId(), account);

	}

	@Override
	public Account find(Long id) {
		return accountMap.get(id);
	}

}
