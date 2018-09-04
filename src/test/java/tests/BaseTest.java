package tests;

import helpers.Reporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BasePage;

public class BaseTest {

    WebDriver driver;

    void setUp(String pageName) {
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

        // Open the Home page of the test application
        this.driver.get("http://the-internet.herokuapp.com");
        // Click on the given page name to launch the page and start testing that page
        BasePage.clickOpenPage(this.driver, pageName);

        // Start Reporter
        Reporter.getInstance();
    }

    void tearDown() {
        this.driver.close();
        Reporter.getInstance().extent.flush();
    }
}
