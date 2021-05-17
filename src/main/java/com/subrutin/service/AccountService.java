package com.subrutin.service;

import java.math.BigDecimal;

import com.subrutin.domain.Account;

public interface AccountService {

	public void transferMoney(Long sourceId, Long destinationId, BigDecimal balance);
	
	public Account getAccount(Long id);
}
