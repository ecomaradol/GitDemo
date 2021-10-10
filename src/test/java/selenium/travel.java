package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class travel {
    public static void main (String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Users/Zlata/Introduction/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get ("https://rahulshettyacademy.com/dropdownsPractise/");
        //dropdown with select tag
        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select (staticDropdown);
        dropdown.selectByIndex(3); //создали dropdown объект класса Select
                                    // и тепеь можем с помощью объекта обраться до методов
                                    //selectByIndex - выбираем значение 3 (UDS) для дропдауна
                            //Как определить, что дропдаун ытатичный? У него тег Select (in Inspect)
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByVisibleText("AED");
        System.out.println(dropdown.getFirstSelectedOption().getText()); //это работает ТОЛЬКО!!! для дропдауна с тегом SELECT
        dropdown.selectByValue("INR");
        System.out.println(dropdown.getFirstSelectedOption().getText());
    }
}
