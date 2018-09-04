package tests;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import helpers.Reporter;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import pages.DynamicContentPage;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static pages.DynamicContentPage.getPageName;

public class DynamicContentTest extends BaseTest {

    @BeforeMethod
    void setup() {
        super.setUp(getPageName());
    }

    @AfterMethod
    void teardown() {
        super.tearDown();
    }

    @Test
    void verifyDynamicContentPageLoads() throws IOException {

        // creates a toggle for the given test, adds all log events under it
        ExtentTest test = Reporter.getInstance().extent.createTest("verifyDynamicContentPageLoads", "Verify Dynamic Content page loads correctly");

        // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");

        DynamicContentPage dcp = new DynamicContentPage(super.driver);
        WebElement pageHeader = dcp.getPageHeader();

        // log with snapshot
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("verifyDynamicContentPageLoads.png").build());

        // test with snapshot
        test.addScreenCaptureFromPath("verifyDynamicContentPageLoads.png");
        assertEquals(pageHeader.getText(), getPageName());
    }
}
