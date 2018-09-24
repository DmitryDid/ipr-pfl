package yMarket.core;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import yMarket.Helpers.CheckHelpers;
import yMarket.pages.FilterPage;
import yMarket.pages.LeftMenuPage;
import yMarket.pages.ProductPage;
import yMarket.pages.UpperMenuPage;

import java.util.concurrent.TimeUnit;

public class Core {
    private Logger logger;
    private WebDriver driver;
    protected CheckHelpers checkHelpers;
    protected UpperMenuPage upperMenuPage;
    protected LeftMenuPage leftMenuPage;
    protected FilterPage filterPage;
    protected ProductPage productPage;


    @Before
    public void start() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        init();
        driver.get("https://market.yandex.ru/");
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    private void init() {
        logger = new Logger();
        upperMenuPage = new UpperMenuPage(driver);
        leftMenuPage = new LeftMenuPage(driver);
        filterPage = new FilterPage(driver);
        productPage = new ProductPage(driver);
        checkHelpers = new CheckHelpers(driver, logger);
    }
}
