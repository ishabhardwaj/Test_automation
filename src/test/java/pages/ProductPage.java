package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addFleeceJacketToCart() {
        driver.findElement(By.xpath("//div[contains(@class, 'inventory_item') and .//div[contains(text(), 'Sauce Labs Fleece Jacket')]]//button[contains(text(), 'Add to cart')]")).click();
        ////div[contains(@class, 'inventory_item') and .//div[contains(text(), 'Sauce Labs Fleece Jacket')]]//button[contains(text(), 'Add to cart')]
        //driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
    }
}
