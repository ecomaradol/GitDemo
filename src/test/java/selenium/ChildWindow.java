package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class ChildWindow {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C://Users/Zlata/Introduction/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.cssSelector(".blinkingText")).click();
        Set <String> window = driver.getWindowHandles(); //получаем все окна parenid childid window
        Iterator <String> it = window.iterator(); //window.iterator получает доступ к parenid childid window
        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId); //переключаемся на childid window
        String emailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
        driver.switchTo().window(parentId); //  переключаемся на parentId window
        driver.findElement(By.id("username")).sendKeys(emailId); //передаем значение emailId в поле username

    }
}