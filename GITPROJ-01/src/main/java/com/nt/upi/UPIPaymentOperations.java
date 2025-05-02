package com.nt.upi;

public class UPIPaymentOperations {
	
	//performs the upi payment
	public String doPayement(long phno,double amt)
	{
		return amt+ "amount is paid to @phone number"+phno;
	}

}
