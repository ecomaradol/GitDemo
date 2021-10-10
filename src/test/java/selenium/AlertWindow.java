package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWindow {

    public static void main (String[] args) {

        System.setProperty("webdriver.chrome.driver", "C://Users/Zlata/Introduction/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        String text= "Mara"; // текст для поля

        driver.findElement(By.id("name")).sendKeys(text);
        driver.findElement(By.id("alertbtn")).click();

        driver.switchTo().alert().getText(); // проверяем какой текст в Алерте

        driver.switchTo().alert().accept(); //т.к. алерт это не HTML элемент (у него нет локатора),
                                // переключаемся на метод алерт. И т.к. у алерта только кнопка ОК, то метод accept()
        driver.findElement(By.id("confirmbtn")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();

    }
}
