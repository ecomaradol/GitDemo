package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

    public static void main (String[] args) {

        System.setProperty("webdriver.chrome.driver", "C://Users/Zlata/Introduction/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(driver.findElement((By.cssSelector("iframe[class= 'demo-frame']")))); //нужно переключиться на фрейм,т.к. Селениум не видит элементы фрейма
                //переключились на фрейм
        driver.findElement(By.id("draggable")).isDisplayed(); // проверили, что этот фрейм отображается
        Actions a = new Actions(driver); // объект а класса Actions
        WebElement target = driver.findElement(By.id("droppable")); //создали куда тянем
        WebElement source = driver.findElement(By.id("draggable")) ; //создали что тянем
        a.dragAndDrop(source, target).build().perform();  //тянем
        driver.switchTo().defaultContent(); //переключаемся на обычное окно



    }
}
