package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class HandlingBrowserWindows {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Set<String> windowIds = driver.getWindowHandles();

        for (String winIds : windowIds){
            String title = driver.switchTo().window(winIds).getTitle();
            System.out.println(title);
            if (title.equals("Swag Labs")){
                driver.close();
            }
        }
    }
}
