import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class testbytesting {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Google Search
        driver.get("https://www.google.com/");
        String searchFieldXpath1 = "//input[@class='gLFyf']";
        WebElement FieldSearch2 = driver.findElement(By.xpath(searchFieldXpath1));
        FieldSearch2.sendKeys("rozetka", Keys.ENTER);
        // клик на первую ссылку в результатах поиска
        String searchrozetka = ".//h3[@class='LC20lb MBeuO DKV0Md']/..";
        WebElement firstLink = driver.findElement(By.xpath(searchrozetka));
        firstLink.click();

        //Поиск на сайте Розетки
        String searchFieldXpath = "//input[@name='search']";
        WebElement FieldSearch = driver.findElement(By.xpath(searchFieldXpath));
        FieldSearch.sendKeys("шампунь",Keys.ENTER);

        //Выбор шампуня
        String searchLinkShampu = ".//span[@class='goods-tile__title' and text()=' Шампунь против перхоти Head & Shoulders Основной уход 900 мл (8006540114971)  ']/..";
        WebElement LinkSpampu = driver.findElement(By.xpath(searchLinkShampu));
        LinkSpampu.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement buttonBuyShampu = driver.findElement(By.className("button--green"));
        buttonBuyShampu.click();

        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        WebElement buttonCheckOpen = driver.findElement(By.className("cart-receipt__submit"));
        buttonCheckOpen.click();

        // закрытие браузера
        //driver.quit();

    }
}
