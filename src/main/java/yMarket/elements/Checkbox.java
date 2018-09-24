package yMarket.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import yMarket.core.Logger;

public class Checkbox {
    private WebDriver driver;
    private Logger logger;

    public Checkbox(WebDriver driver, Logger logger) {
        this.driver = driver;
        this.logger = logger;
    }

    public void selectCheckbox(By locator) {
        logger.logInfo("   - Устанавливаем флаг в чекбокс");
        driver.findElement(locator).click();
    }
}
