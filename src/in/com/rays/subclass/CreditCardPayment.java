package in.com.rays.subclass;

import in.com.rays.inheritance.Payment;

public class CreditCardPayment extends Payment {

	private String ccType;

	public void setCcType(String ccType) {
		this.ccType = ccType;
	}

	public String getCcType() {
		return ccType;
	}

}
