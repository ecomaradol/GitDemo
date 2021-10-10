package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class updatedDropdown {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C://Users/Zlata/Introduction/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        //dropdown with select tag
        driver.findElement(By.id("divpaxinfo")).click(); //нажали на дропдаун 1 пассажир по-умолчанию
            Thread.sleep(2000);       //добавили ожидание- позже перепишем на эксплисит вэйт
       // driver.findElement(By.id("hrefIncAdt")).click(); //выбрали кнопку добавления пассажира. Уже 2 пассажира
       int i=1;
        while (i<5) {
            driver.findElement(By.id("hrefIncAdt")).click();
            i++;
        }
       // System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        //для добавления бОльшего кол-ва пассажиров используем цикл while
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
        driver.findElement(By.id("btnclosepaxoption")).click(); //нажади кнопку Done




    }
}
