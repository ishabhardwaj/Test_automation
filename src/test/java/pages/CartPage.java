package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {

        WebDriver driver;

        public CartPage(WebDriver driver) {
            this.driver = driver;
        }

        public void goToCartAndCheckout() {
            driver.findElement(By.xpath("//div/A[@class='shopping_cart_link']")).click();
            // Create object of WebDriverWait class



// ...

            WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));

            // Wait till the element is not visible

            WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='checkout']")));

            //driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
        }

}

