package day11;

import org.testng.annotations.Test;

public class PaymentMethods {

	@Test(priority = 1, groups = {"regression", "sanity", "functional"})
	void paymentInRupee() {
		System.out.println("Payment in rupees");
	}
	
	@Test(priority = 2, groups = {"regression", "sanity", "functional"})
	void paymentInDollar() {
		System.out.println("Payment in dollars");
	}
	
}
