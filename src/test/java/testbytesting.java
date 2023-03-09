import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class testbytesting {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //driver.get("https://rozetka.com.ua/");

        //Google Search
        driver.get("https://www.google.com/");
        String searchFieldXpath = "//input[@title='Поиск']";
        WebElement FieldSearch = driver.findElement(By.xpath(searchFieldXpath));
        FieldSearch.sendKeys("rozetka", Keys.ENTER);
        // клик на первую ссылку в результатах поиска
        String searchrozetka = "//input[@title='Интернет-магазин ROZETKA™: официальный сайт самого ...']";
        WebElement firstLink = driver.findElement(By.xpath(searchrozetka));
        firstLink.click();

        // закрытие браузера
        driver.quit();

    }
}
