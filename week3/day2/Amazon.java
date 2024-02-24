package week3.day2;

public class Amazon extends CanaraBank{

public void localBranch() {
System.out.println("Offer implemented in Pallavaram branch");	
}
public static void main(String[] args) {
	Amazon obj = new Amazon();
	obj.cashOnDelivery();
	obj.upiPayments();
	obj.cardPayments();
	obj.internetBanking();
	obj.recordPaymentDetails();
	obj.localBranch();
	}

}
