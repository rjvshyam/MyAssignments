package week3.day2;

public abstract class CanaraBank implements Payments {

	public void cashOnDelivery() {
	System.out.println("implement from interface");	}

	public void upiPayments() {
		System.out.println("implement from interface");	}

	public void cardPayments() {
		System.out.println("implement from interface");	}

	public void internetBanking() {
		System.out.println("implement from interface");	}
	
	public void recordPaymentDetails() {
		System.out.println("implement from abstract");	}



}
