package day11;

import org.testng.annotations.Test;

public class SignUpMethods {
	
	@Test(priority = 1, groups = {"regression"})
	void SignUpByFB() {
		System.out.println("Signup by FB");
	}
	
	@Test(priority = 2, groups = {"regression"})
	void SignUpByInsta() {
		System.out.println("Signup by insta");
	}
	
	@Test(priority = 3, groups = {"regression"})
	void SignUpByGmail() {
		System.out.println("Signup by gmail");
	}
	
	
	
	
	
}
