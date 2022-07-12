import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcommercePage {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harsha\\myOwnWorkSpace\\BusyQaMaySelenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/");
        String actualTitle = driver.getTitle();
        String ExpectedTitle = "Your Store";
        if (actualTitle.equals(ExpectedTitle)) {
            System.out.println("we are on home page as expected!");
        } else {
            System.out.println("https://naveenautomationlabs.com/opencart/ URL did not navigate us to expected page!!");
        }

        //login
        By myAccountLocator = By.linkText("My Account");
        WebElement myAccountElement = driver.findElement(myAccountLocator);
        myAccountElement.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException ie) {
        }

        //username
        driver.findElement(By.name("email")).sendKeys("harsha@busyqa.com");
        //password
        driver.findElement(By.name("password")).sendKeys("Covid@2020");

        //click on login button
        driver.findElement(By.xpath("//input[@value='Login']"));


        String actualURL = driver.getCurrentUrl();
        if (actualURL.contains("account")) {
            System.out.println("PASS!");
        } else {
            System.out.println("login button did not take us to expected page!!");
        }

        System.out.println("***********************************************************");
        System.out.println(driver.getPageSource());
        driver.quit();
    }
}