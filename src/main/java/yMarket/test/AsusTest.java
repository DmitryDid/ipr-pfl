package yMarket.test;

import org.junit.Test;
import org.openqa.selenium.By;
import yMarket.core.Core;

public class AsusTest extends Core {

    @Test
    public void testUntitledTestCase() {
        upperMenuPage.selectComputers(By.linkText("Компьютеры"));
        leftMenuPage.selectNotebooks(By.linkText("Ноутбуки"));
        filterPage.fillMinPrice(By.id("glpricefrom"), "70000");
        filterPage.fillMaxPrice(By.id("glpriceto"), "80000");
        filterPage.selectProducer(By.xpath("//span[text()='ASUS']"));
        filterPage.selectType(By.xpath("//span[text()='ноутбук']"));
        filterPage.selectDiagonal(By.xpath("//span[text()='15\"-15.9\"']"));
        filterPage.selectProcessor(By.xpath("//span[text()='Core i7']"));
        filterPage.selectCountCoreProcessor(By.xpath("//span[text()='6']"));
        productPage.selectItem(By.linkText("Ноутбук ASUS TUF Gaming FX504GD (Intel Core i7 8750H 2200 MHz/15.6\"/1920x1080/" +
                "8GB/1128GB HDD+SSD/DVD нет/NVIDIA GeForce GTX 1050/Wi-Fi/Bluetooth/Windows 10 Home)"));
        logger.logInfo("Выполнем проверку заголовка страницы и цены товара");
        checkHelpers.checkPageHeader("Ноутбук ASUS TUF Gaming FX504GD (Intel Core i7 8750H 2200 MHz/15.6\"/1920x1080/" +
                "8GB/1128GB HDD+SSD/DVD нет/NVIDIA GeForce GTX 1050/Wi-Fi/Bluetooth/Windows 10 Home)");
        checkHelpers.checkPrice("71 880 \u20BD");
    }
}
