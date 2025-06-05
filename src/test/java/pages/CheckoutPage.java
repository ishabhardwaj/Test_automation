package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import java.time.Duration;
public class CheckoutPage {

    WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }
    public void fillCheckoutDetails() {
        driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys(("test"));
        driver.findElement(By.id("//input[@id='last-name']")).sendKeys("test");
        driver.findElement(By.id("//input[@id='postal-code']")).sendKeys("110065");
        driver.findElement(By.id("//input[@id='continue']")).click();
    }
    public String getPaymentInfo()
    {
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        // Wait till the element is not visible

        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='finish']")));

        String paymentInfo= driver.findElement(By.id("//div[@data-test='payment-info-value']")).getText();
        String totalPrice = driver.findElement(By.id("//div[@data-test='total-label']")).getText();
        return paymentInfo;

    }
}

