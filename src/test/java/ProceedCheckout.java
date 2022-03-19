import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProceedCheckout {

    WebDriver driver;
    public  ProceedCheckout
            (WebDriver driver) {
        this.driver=driver;
    }
    public void proceedToCheckout() {
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button")).click();
        driver.findElement(By.xpath("//*[@id=\"cgv\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"form\"]/p/button")).click();
        driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")).click();
        driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/p/a")).click();
    }



}
