import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sign_Up_Page {

    WebDriver driver;
 public Sign_Up_Page(WebDriver driver) {
     this.driver=driver;

    }

    private By customer_firstname = By.xpath("//*[@id=\"customer_firstname\"]");
    private By customer_lastname = By.xpath("//*[@id=\"customer_lastname\"]");
    private By passwd = By.xpath("//*[@id=\"passwd\"]");
    private By address = By.xpath("//*[@id=\"address1\"]");
    private By id_state = By.id("id_state");
    private By postcode = By.id("postcode");
    private By city = By.id("city");
    private By phone = By.id("phone");
    private By submitAccount = By.id("submitAccount");

    public void insert_fist_name(String fname){

        driver.findElement(customer_firstname).sendKeys(fname);

    }
    public void insert_last_name(String lname){

        driver.findElement(customer_lastname).sendKeys(lname);

    }public void insert_paswd (String password){

        driver.findElement(passwd).sendKeys(password);

    }
    public void insert_address (String adres){

        driver.findElement(address).sendKeys(adres);

    }public void insert_state (String state){

        driver.findElement(id_state).sendKeys(state);

    }

    public void insert_post_code (String zip){

        driver.findElement(postcode).sendKeys(zip);

    }
    public void insert_city (String citycode){

        driver.findElement(city).sendKeys(citycode);

    }public void insert_phone (String mphone){

        driver.findElement(phone).sendKeys(mphone);

    }public void submit_register_bttn (){

        driver.findElement(submitAccount).click();

    }
    public void Set_wait_for(WebDriver driver,int time ){
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"customer_firstname\"]")));

    }
}