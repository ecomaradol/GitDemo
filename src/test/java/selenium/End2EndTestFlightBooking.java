package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class End2EndTestFlightBooking {

    public static void main (String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C://Users/Zlata/Introduction/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='DEL']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")){
            System.out.println("it`s disabled");
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }

        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        driver.findElement(By.id("divpaxinfo")).click(); //нажали на дропдаун 1 пассажир по-умолчанию
        Thread.sleep(2000);
        int i=1;
        while (i<5) {
            driver.findElement(By.id("hrefIncAdt")).click();
            i++;
        }
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
        driver.findElement(By.id("btnclosepaxoption")).click();

        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select (staticDropdown);
        dropdown.selectByIndex(3);

        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

    }
}
