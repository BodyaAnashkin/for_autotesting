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


        //BuyShampuInRozetka testNumberOne = new BuyShampuInRozetka();
        //testNumberOne.buyShampuInRozetka();


        BuyMonitorInRozetka testNumberTwo = new BuyMonitorInRozetka();
        testNumberTwo.BuyMonitor();

    }
}
