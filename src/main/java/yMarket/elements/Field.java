package yMarket.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import yMarket.core.Logger;

public class Field {
    private WebDriver driver;
    private Logger logger;

    public Field(WebDriver driver, Logger logger) {
        this.driver = driver;
        this.logger = logger;
    }

    public void fieldFilling(By locator, String minPrice) {
        driver.findElement(locator).click();
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(minPrice);
    }
}
