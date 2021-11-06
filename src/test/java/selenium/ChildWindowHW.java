package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class ChildWindowHW {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Users/Zlata/Introduction/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
        Set<String> window = driver.getWindowHandles();
        Iterator<String> it = window.iterator();
        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);
       String example = driver.findElement(By.cssSelector("h3")).getText();
        System.out.println(example);
        driver.switchTo().window(parentId);
        String example1 = driver.findElement(By.cssSelector("h3")).getText();
        System.out.println(example1);

    }
}
