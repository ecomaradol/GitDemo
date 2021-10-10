package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforceE2E {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C://Users/Zlata/Introduction/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://rediff.com");
        driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
        driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("132");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("456");
        driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();

                }
}
