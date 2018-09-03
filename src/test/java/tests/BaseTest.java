package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BasePage;

public class BaseTest {

    WebDriver driver;
    private String page;

    public BaseTest(String pageName) {
        this.page = pageName;
    }

    void setUp() {
        //        We will be using chrome driver for the purpose of development of this framework.

        //        Working with Firefox as primary browser
        //        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
        //        this.driver = new FirefoxDriver();

        //        Working with IE as primary browser
        //        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        //        this.driver = new InternetExplorerDriver();

        //        Working with Chrome as primary browser
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        this.driver = new ChromeDriver();
        this.driver.get("http://the-internet.herokuapp.com");
        BasePage.clickOpenPage(this.driver, this.page);
    }

    void tearDown() {
        this.driver.close();
    }
}
