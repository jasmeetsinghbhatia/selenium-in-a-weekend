package tests;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import helpers.Reporter;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import pages.ForgotPasswordPage;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static pages.ForgotPasswordPage.getConfirmationText;
import static pages.ForgotPasswordPage.getPageName;

public class ForgotPasswordTest extends BaseTest {

    @BeforeMethod
    void setup() {
        super.setUp(getPageName());
    }

    @AfterMethod
    void teardown() {
        super.tearDown();
    }

    @Test
    void verifyForgotPasswordPageLoads() throws IOException {

        // creates a toggle for the given test, adds all log events under it
        ExtentTest test = Reporter.getInstance().extent.createTest("verifyForgotPasswordPageLoads", "Verify forgot password page loads correctly");

        // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");

        ForgotPasswordPage fpp = new ForgotPasswordPage(super.driver);
        WebElement pageHeader = fpp.getPageHeader();

        // log with snapshot
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("verifyForgotPasswordPageLoads.png").build());

        // test with snapshot
        test.addScreenCaptureFromPath("verifyForgotPasswordPageLoads.png");

        assertEquals(pageHeader.getText(), getPageName());
    }

    @Test
    void verifyForgotPasswordEmailSubmissionWorks() throws IOException {

        // creates a toggle for the given test, adds all log events under it
        ExtentTest test = Reporter.getInstance().extent.createTest("verifyForgotPasswordEmailSubmissionWorks", "Check if email submission works");

        // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");

        ForgotPasswordPage fpp = new ForgotPasswordPage(super.driver);

        fpp.typeEmailInTextBox();
        fpp.submitForgotPasswordEmail();

        // log with snapshot
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("verifyForgotPasswordEmailSubmissionWorks.png").build());

        // test with snapshot
        test.addScreenCaptureFromPath("verifyForgotPasswordEmailSubmissionWorks.png");
        assertEquals(fpp.getConfirmationPageContent(), getConfirmationText());
    }
}
