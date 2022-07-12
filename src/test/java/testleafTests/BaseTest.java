package testleafTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    public WebDriver driver;

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harsha\\myOwnWorkSpace\\BusyQaMaySelenium\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://leafground.com/home.html");
    }

    public void tearDown() {
        driver.quit();
    }
}