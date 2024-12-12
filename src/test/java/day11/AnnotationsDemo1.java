package day11;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsDemo1 {
	
	@BeforeMethod
	void login() {
		System.out.println("Login succesful");
	}
	
	@Test(priority = 1)
	void search() {
		System.out.println("Search succesful");
	}
		
	@AfterMethod
	void logout() {
		System.out.println("Logout succesful");
	}
	
	@Test(priority = 2)
	void advanceSearch() {
		System.out.println("Advance search succesful");
	}
	
	
}
