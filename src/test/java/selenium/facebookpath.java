package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users/Zlata/Introduction/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://facebook.com");
      /*  driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("376725710@qip.ru");
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("19831983mA");
        driver.findElement(By.xpath("//input[@name='login']")).click();*/
           // driver.findElement(By.cssSelector("input[name='email']")).sendKeys("376725710@qip.ru");
           driver.findElement(By.cssSelector("#email")).sendKeys("123");
            //driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("19831983mA");
            driver.findElement(By.cssSelector("button[name='login']")).click();
    }

}


