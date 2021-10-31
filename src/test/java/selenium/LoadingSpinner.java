package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoadingSpinner {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://Users/Zlata/Introduction/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        WebDriverWait w = new WebDriverWait(driver, 10);
        driver.get("https://www.itgeared.com/demo/1506-ajax-loading.html");
        Thread.sleep (3000);
        driver.findElement(By.xpath("//a[contains(text(),'Click to load get data via Ajax!')]")).click();
        System.out.println(w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results"))).getText());

    }
}
