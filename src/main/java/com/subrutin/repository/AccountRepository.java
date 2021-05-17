package com.subrutin.repository;

import com.subrutin.domain.Account;

public interface AccountRepository {

	public void update(Account Account);
	
	public Account find(Long id);
}
