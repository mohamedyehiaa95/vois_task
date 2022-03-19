import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BasePage {

    WebDriver base_page_drivers;

    @BeforeClass
    public void open_browser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\a815201\\Downloads\\chromedriver.exe");
        base_page_drivers = new ChromeDriver();
        base_page_drivers.get("http://automationpractice.com/index.php");
    }

    public WebDriverWait initaliazeWait(WebDriver driver) {
        return new WebDriverWait(driver, 50000);
    }
}
