package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMouseKey {
    //commit to mybranch
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C://Users/Zlata/Introduction/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize(); //полностью раскрыть окно
        driver.get("https://www.amazon.com/");
        Actions a = new Actions(driver); //создали объект а класса Actions для работы с мышкой

        WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
        a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
                    //печатаем в поле большими буквами слово hello и нажали дважды по слову, выделив его
        a.moveToElement(move).build().perform(); //при наведении на кнопку всплывает попап с подменю. НИЧЕГО не нажимаем
                            //этот шаг ГОТОВ к выполнению при build и уже реализуется при perform
        a.moveToElement(move).contextClick().build().perform(); //нажали правой кнопкой мыши по элементу move


    }
}
