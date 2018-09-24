package yMarket.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends PagePrototype {

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void selectItem(By locator) {
        logger.logInfo("Переходим на страницу искомого товара");
        linkHelper.clickLink(locator);
    }
}
