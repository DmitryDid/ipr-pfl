package yMarket.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UpperMenuPage extends PagePrototype {

    public UpperMenuPage(WebDriver driver) {
        super(driver);
    }

    public void selectComputers(By locator) {
        logger.logInfo("Переходим в раздел Компьютеры");
        linkHelper.clickLink(locator);
    }
}
