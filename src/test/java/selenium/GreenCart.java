package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class GreenCart {

    public static void main (String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C://Users/Zlata/Introduction/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        int j=0;
        String[] itemsNeeded={"Cucumber", "Brocolli", "Beetroot", "Carrot"}; //объявили массив с 4-мя элементами, которые хотим добавить в корзину

        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
Thread.sleep (3000);
        List<WebElement> products= driver.findElements(By.cssSelector("h4.product-name")); //выбираем 30 элементов из списка магазина

        for(int i=0; i<products.size(); i++) {
            String [] name=products.get(i).getText().split("-");
            String formattedName = name[0].trim();


            //convert array into array list to easy search
            List itemsNeededList = Arrays.asList(itemsNeeded);

            if (itemsNeededList.contains(formattedName)) {

                j++;
                driver.findElements(By.xpath("//div[@class ='product-action']/button")).get(i).click();
    if (j==itemsNeeded.length) {   //делаем динамический код. Т.е. мы не знаем сколько продуктов будет в массиве
                                    // поэтому указываем Длину массива itemsNeeded.length
        break;
    }
            }
        }

}}
