package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.List;

public class GreenCart {

    public static void main (String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C://Users/Zlata/Introduction/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //МАКСИМУМ 5 СЕК ждем, чтобы успел появиться каждый объект
        WebDriverWait w = new WebDriverWait(driver, 5); //создаем новый объект w класса WebDriverWait
        // передаем параметры driver and 5 sec !!! Это ЭКСПЛИСИТ ВЭЙТ
        String[] itemsNeeded={"Cucumber", "Beetroot", "Carrot"}; //объявили массив с 4-мя элементами, которые хотим добавить в корзину

        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        Thread.sleep (3000);
        AddItems(driver, itemsNeeded);
       // GreenCart c = new GreenCart(); //создаем объект класса GreenCart
        AddItems(driver, itemsNeeded); //вызываем метод

        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();

        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button.promoBtn")).click();
                            //определяем explicit wait

        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo"))); //будет ожидание 5 сек
                        //до тех пор пока ожидаемое состояние элемента не станет - виден


        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
    }
    public static void AddItems(WebDriver driver, String[] itemsNeeded) {
        int j=0;
        List<WebElement> products= driver.findElements(By.cssSelector("h4.product-name")); //выбираем 30 элементов из списка магазина

        for(int i=0; i<products.size(); i++) {
            String [] name=products.get(i).getText().split("-");
            String formattedName = name[0].trim();


            //convert array into array list to easy search
            List<String> itemsNeededList = Arrays.asList(itemsNeeded);

            if (itemsNeededList.contains(formattedName)) {

                j++;
                driver.findElements(By.xpath("//div[@class ='product-action']/button")).get(i).click();
                if (j==itemsNeeded.length) {   //делаем динамический код. Т.е. мы не знаем сколько продуктов будет в массиве
                    // поэтому указываем Длину массива itemsNeeded.length
                    break;
                }
            }
        }
    }
}
