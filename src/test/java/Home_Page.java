import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home_Page  {

    WebDriver driver;
   public Home_Page(WebDriver driver) {
        this.driver=driver;
    }

    private By signup_link = By.linkText("Sign in");
    private By authentication_Message = By.xpath("//*[@id=\"center_column\"]/h1");
    public void click_on_signup_link() {

        driver.findElement(signup_link).click();
    }

    public void setWait(WebDriver driver,int time ){
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sign in")));
    }
    public String Expected_Result(){
    return driver.findElement(authentication_Message).getText();
}}