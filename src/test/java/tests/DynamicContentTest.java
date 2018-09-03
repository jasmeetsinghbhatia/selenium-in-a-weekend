package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.DynamicContentPage;

public class DynamicContentTest extends BaseTest{

    public DynamicContentTest() {
        super("Dynamic Content");
    }

    @BeforeTest
    void setup(){
        super.setUp();
    }

    @AfterTest
    void teardown(){
        super.tearDown();
    }

    @Test
    void verifyDynamicContentPageLoads(){
        DynamicContentPage dcp = new DynamicContentPage(super.driver);
        WebElement pageHeader = dcp.getPageHeader();
        Assert.assertEquals("Dynamic Content",pageHeader.getText());
    }
}
