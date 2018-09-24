package yMarket.pages;

import org.openqa.selenium.WebDriver;
import yMarket.Helpers.CheckHelpers;
import yMarket.core.Logger;
import yMarket.elements.Checkbox;
import yMarket.elements.Field;
import yMarket.elements.Link;

public class PagePrototype {
    protected Logger logger;
    final Link linkHelper;
    final Field fieldHelper;
    final Checkbox checkBoxHelper;
    final CheckHelpers checkHelpers;


    PagePrototype(WebDriver driver) {
        logger = new Logger();
        linkHelper = new Link(driver, logger);
        fieldHelper = new Field(driver, logger);
        checkBoxHelper = new Checkbox(driver, logger);
        checkHelpers = new CheckHelpers(driver, logger);
    }
}
