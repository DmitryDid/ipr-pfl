package yMarket.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeftMenuPage extends PagePrototype {

    public LeftMenuPage(WebDriver driver) {
        super(driver);
    }

    public void selectNotebooks(By locator) {
        logger.logInfo("Переходим в раздел Ноутбуки");
        linkHelper.clickLink(locator);
        checkHelpers.checkPageHeader("Ноутбуки");
    }
}
