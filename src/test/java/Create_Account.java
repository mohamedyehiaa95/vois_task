import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Create_Account  {

    WebDriver driver;
    public Create_Account(WebDriver driver){
        this.driver=driver;

    }
    private By email= By.name("email_create");
    private By create_account =By.id("SubmitCreate");

public void insert_email(String fmail)
{

    driver.findElement(email).sendKeys(fmail);
}
public void click_submit_account(){
    driver.findElement(create_account).click();
}
}
