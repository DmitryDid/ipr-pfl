package yMarket.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FilterPage extends PagePrototype {

    public FilterPage(WebDriver driver) {
        super(driver);
    }

    public void fillMaxPrice(By locator, String maxPrice) {
        logger.logInfo("Ввод суммы фильтрации до: " + maxPrice);
        fieldHelper.fieldFilling(locator, maxPrice);
    }

    public void fillMinPrice(By locator, String minPrice) {
        logger.logInfo("Ввод суммы фильтрации от: " + minPrice);
        fieldHelper.fieldFilling(locator, minPrice);

    }

    public void selectCountCoreProcessor(By locator) {
        logger.logInfo("Выбираем количество ядер");
        checkBoxHelper.selectCheckbox(locator);
    }

    public void selectProcessor(By locator) {
        logger.logInfo("Выбираем поколение процессора");
        checkBoxHelper.selectCheckbox(locator);
    }

    public void selectDiagonal(By locator) {
        logger.logInfo("Выбираем диагональ устройства");
        checkBoxHelper.selectCheckbox(locator);
    }

    public void selectType(By locator) {
        logger.logInfo("Выбираем тип устройства");
        checkBoxHelper.selectCheckbox(locator);
    }

    public void selectProducer(By locator) {
        logger.logInfo("Выбираем производителя");
        checkBoxHelper.selectCheckbox(locator);
    }
}
