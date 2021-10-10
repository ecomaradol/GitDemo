package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    public static void main(String[] args){
        //CREATE Driver object
        System.setProperty("webdriver.chrome.driver", "C:\\Users/Zlata/Introduction/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://google.com");
        System.out.println(driver.getTitle());
        driver.get("http://yahoo.com");
        driver.navigate().back(); //тоже, что и нажать кнопку назад в браузере
    }

}
