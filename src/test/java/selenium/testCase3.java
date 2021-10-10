package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testCase3 {
    public static void main(String[] args){
    //CREATE Driver object
        System.setProperty("webdriver.gecko.driver", "C:\\Users/Zlata/Introduction/geckodriver.exe");
    WebDriver driver= new FirefoxDriver();
       // driver.get("http://google.com");
       // System.out.println(driver.getTitle());//validate title page
       // System.out.println(driver.getCurrentUrl());//validate if you are landed on write page
      //  System.out.println(driver.getPageSource());//print page source
       /* driver.get("http://facebook.com");
        driver.findElement(By.cssSelector("#email")).sendKeys("CSS selector");
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Xpath");
        //driver.findElement(By.id("email")).sendKeys("This is my first code");
       // driver.findElement(By.name("pass")).sendKeys("This is pass");
       // driver.findElement(By.linkText("Forgot Password?")).click();*/

       // driver.navigate().back(); //тоже, что и нажать кнопку назад в браузере
       // driver.close(); //closes current browser
       // driver.quit(); // closes all the browsers opened by SELENIUM

       driver.get("https://login.salesforce.com/");

       // driver.findElement(By.id("username")).sendKeys("This is my first code");
        //driver.findElement(By.id("password")).sendKeys("This is pass");
       // driver.findElement(By.className("input r4 wide mb16 mt8 username")).sendKeys("Hi");//Error. compound classes not work in Selenium!!!!! Just sould one word
        //driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
      //  System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());

        driver.findElement(By.cssSelector("")).sendKeys("NAME");
        driver.findElement(By.cssSelector("#password")).sendKeys("PASS");
        driver.findElement(By.cssSelector("#Login")).click();
    }}
