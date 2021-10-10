package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkbox {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "C://Users/Zlata/Introduction/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        //Пишем ассерты- проверки.
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
       // если в скобках false (для ассерта assertFalse), то тест проходит успешно

        // System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        //проверка на то, выбран (стоит ли галка) ли чекбокс

        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();//выбрали чекбокс
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected();
                        //проверка на то, выбрал на чекбокс
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        //мы делаем assertTrue

        // посчитать кол-во чекбоксов

        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());


        System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
        //должен быть False,т.к. второй календаль недоступен, Но он TRue ,т.к. при нажатии на календарь он становится доступным

        //выбираем радиобаттон RoundTrip
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
        driver.findElement(By.id ("ctl00_mainContent_rbtnl_Trip_1")).click();
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")){
             System.out.println("it`s enabled");
             Assert.assertTrue(true);
      } else {
          Assert.assertTrue(false);
      }
        //проверяем энейбл ли календарь

       // System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());





}}
