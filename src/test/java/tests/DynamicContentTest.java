package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import pages.DynamicContentPage;


class DynamicContentTest extends BaseTest {

    public DynamicContentTest() {
        super("Dynamic Content");
    }

    @BeforeEach
    void setUp() {
        super.setUp();
    }

    @AfterEach
    void tearDown() {
        super.tearDown();

    }

    @Test
    void dynamicContentTest() {
        DynamicContentPage dcp = new DynamicContentPage(super.driver);
        WebElement pageHeader = dcp.getPageHeader();
        Assertions.assertEquals("Dynamic Content",pageHeader.getText());
    }
}
