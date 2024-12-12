package day11;

import org.testng.annotations.Test;

public class LoginMethods {
	
	@Test(priority = 1, groups = {"sanity"})
	void loginByFB() {
		System.out.println("Login by FB");
	}
	
	@Test(priority = 2, groups = {"sanity"})
	void loginByInsta() {
		System.out.println("Login by Insta");
	}
	
	@Test(priority = 3, groups = {"sanity"})
	void loginByGmail() {
		System.out.println("Login by Gmail");
	}
	
	
}
