import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Print_Receipt {

    WebDriver driver;
    public  Print_Receipt
            (WebDriver driver) {
        this.driver=driver;
    }

    public void printOrderStatus() {
        String orderReference = driver.findElement(By.xpath("//*[@id=\"order-list\"]/tbody/tr[1]/td[1]/a")).getText();
        String date = driver.findElement(By.xpath("//*[@id=\"order-list\"]/tbody/tr/td[2]")).getText();
        String totalPrice = driver.findElement(By.xpath("//*[@id=\"order-list\"]/tbody/tr/td[3]")).getText();
        String Order_Status = driver.findElement(By.xpath("//*[@id=\"order-list\"]/tbody/tr/td[5]")).getText();
        System.out.println("your order Reference is " + orderReference + "  Date " + date + " Total_Price " + totalPrice + " order status " + Order_Status);
    }
}
