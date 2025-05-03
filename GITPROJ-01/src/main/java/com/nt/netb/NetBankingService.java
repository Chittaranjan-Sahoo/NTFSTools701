package com.nt.netb;

public class NetBankingService {
	
	public String transferMoney(long srcAccount,long destAccount,double amount)
	{
		return amount+ "is transfer from"+srcAccount+"to dest Account"+destAccount;
	}

}
