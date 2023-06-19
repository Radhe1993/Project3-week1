package Project_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Com_Hero
{
    public static void main(String[] args) throws InterruptedException {
        String baseUrl = "http://the-internet.herokuapp.com/login";
        // Browser Setup
        WebDriver driver = new ChromeDriver();
        // Open URL
        driver.get(baseUrl);
        // Print the title
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        System.out.println("Print the title = "+driver.getTitle());
        // Print the current URL
        System.out.println("Print the Current URL = "+driver.getCurrentUrl());
        // Print the page source
        System.out.println("Print the page source = "+driver.getPageSource());
        //Enter the email in email field
        driver.findElement(By.name("username")).sendKeys("SiyaRam@gmail.com");
        // Enter the pass word in password field
        driver.findElement(By.name("password")).sendKeys("88997766");
        // close the browser
        Thread.sleep(5000);
        driver.close();
    }
}
