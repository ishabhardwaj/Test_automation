package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckoutPage;
import pages.LoginPage;
import pages.ProductPage;


public class SauceDemoTest {

        WebDriver driver;

        @BeforeMethod
        public void setup() {
            driver = new ChromeDriver();
            driver.get("https://www.saucedemo.com/");
            driver.manage().window().maximize();
        }

        @Test
        public void testOrderFlow() {
            new LoginPage(driver).login("standard_user", "secret_sauce");
            new ProductPage(driver).addFleeceJacketToCart();
            new CartPage(driver).goToCartAndCheckout();
            new CheckoutPage(driver).fillCheckoutDetails();
            String summary = new CheckoutPage(driver).getPaymentInfo();
            Assert.assertTrue(summary.contains("Payment Information"));
        }

        @AfterMethod
        public void tearDown() {
            driver.quit();
        }
    }


