import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Arrays;

public class Registeration_TC extends BasePage {
    Home_Page hp;
    BasePage bp;
    Create_Account Ca;
    Sign_Up_Page signup;
    Print_Receipt print;
    ProceedCheckout chkout;
    HoverAndClick hover;


    @Test(dataProvider = "testData")
    public void registrations_Tc(
            String customer_firstname, String customer_lastname, String passwd, String address,
            String city, String postcode, String id_state, String phone, String email
    ) throws InterruptedException {

        bp = new BasePage();
        hp = new Home_Page(base_page_drivers);
        hp.click_on_signup_link();
        hp.setWait(base_page_drivers, 20);
        hp.Expected_Result();
        Ca = new Create_Account(base_page_drivers);
        Ca.insert_email(email);
        Ca.click_submit_account();
        signup = new Sign_Up_Page(base_page_drivers);
        signup.Set_wait_for(base_page_drivers, 20);
        signup.insert_fist_name(customer_firstname);
        signup.insert_last_name(customer_lastname);
        signup.insert_paswd(passwd);
        signup.insert_address(address);
        signup.insert_state(id_state);
        signup.insert_post_code(postcode);
        signup.insert_phone(phone);
        signup.insert_city(city);
        signup.submit_register_bttn();

        String myAccount = base_page_drivers.findElement(By.xpath("//*[@id=\"center_column\"]/h1")).getText();
        Assert.assertEquals(myAccount, "MY ACCOUNT");

        Actions actions = new Actions(base_page_drivers);
        WebDriverWait wait = initaliazeWait(base_page_drivers);
        hover = new HoverAndClick(base_page_drivers);
        hover.hoverAndClick(actions,wait);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Proceed to checkout")));
        base_page_drivers.findElement(By.linkText("Proceed to checkout")).click();


        chkout = new ProceedCheckout(base_page_drivers);
        chkout.proceedToCheckout();

        if (base_page_drivers.findElement(By.xpath("//*[@id=\"order-list\"]/tbody/tr[1]")).isDisplayed()) {
            System.out.println("Here is Your order Details");
        } else {
            System.out.println("Order was not created");
        }
        print = new Print_Receipt(base_page_drivers);
        print.printOrderStatus();





    }








    @DataProvider
    public Object[][] testData() throws IOException, InvalidFormatException {
        ReadCSVFile dataObject = new ReadCSVFile();
        System.out.println(Arrays.deepToString(dataObject.readFile()));
        return dataObject.readFile();
        } }

