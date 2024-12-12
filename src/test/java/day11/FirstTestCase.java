package day11;

import org.testng.annotations.Test;

public class FirstTestCase {
    @Test(priority = 1)
    void login(){
        System.out.println("Logged in");
    }

    @Test(priority = 3)
    void logout(){
        System.out.println("Logged out");
    }

    @Test(priority = 2)
    void performActivity(){
        System.out.println("Perform tasks");
    }

}
