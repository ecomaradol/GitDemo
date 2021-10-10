package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C://Users/Zlata/Introduction/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
            //xpath for Chennai //a[@value='MAA']
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
            Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click(); //индекс [2] в xpath говорит о том,
                                                //что это из второго окна нужно выбирать

        //многие не любят работать с индексами и есть другая альтернатива выбора через Parent/child
        //выбираем парент- первое окно (откуда) , затем выбираем город
        //   //div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='MAA'] - это уникальный xpath
//Календарь
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();
                    //уникальный CSS для текущей даты





    }

}
