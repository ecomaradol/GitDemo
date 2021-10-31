package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

public class FluentWaitMy {


    public static void main (String[] args) {
            System.setProperty("webdriver.chrome.driver", "C://Users/Zlata/Introduction/chromedriver.exe");
            WebDriver driver=new ChromeDriver();
            driver.get ("https://the-internet.herokuapp.com/dynamic_loading/1");
            driver.findElement(By.xpath("//button")).click();
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30)) // после 30 сек, если элемент не найден тест будет провален
                .pollingEvery(Duration.ofSeconds(3)) // после3-х секунд опять будет искать элемент, если не нашел его первый раз
                .ignoring(NoSuchElementException.class); // FluentWait это класс,который реализует(implementing) Wait интерфейс
            //

        WebElement foo = wait.until(new Function<WebDriver, WebElement>() {

            public WebElement apply(WebDriver driver) { //ждем пока метод apply вернет WebElement
                if (driver.findElement(By.cssSelector("[id ='finish'] h4")).isDisplayed()) { //если элемент отображается, то будет его возвращать, если не появится в течение 30 сек, то будет null

                    return driver.findElement(By.cssSelector("[id ='finish'] h4")); //будет ожидать пока появится элемент finish
                } else
                    return null;

            }

        });
        System.out.println(driver.findElement(By.cssSelector("[id ='finish'] h4")).isDisplayed()); //показывает, что элемент присутствует на странице, но он не отображается,т.к. значение False(в консоли)
        }                                   //если все корректно, то будет TRUE
}
