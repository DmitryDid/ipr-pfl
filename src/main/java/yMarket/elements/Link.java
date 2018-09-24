package yMarket.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import yMarket.core.Logger;

public class Link {
    private WebDriver driver;
    private Logger logger;

    public Link(WebDriver driver, Logger logger) {
        this.driver = driver;
        this.logger = logger;
    }

    public void clickLink(By locator) {
        logger.logInfo("   - Кликаем по ссылке");
        driver.findElement(locator).click();
    }
}
