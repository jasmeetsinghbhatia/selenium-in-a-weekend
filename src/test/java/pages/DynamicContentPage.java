package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DynamicContentPage {
    // PAGE NAME NEEDS TO BE CONSTANT, IT WILL BE USED THROUGHOUT ALL THE TESTS FOR THIS PAGE
    private static final String pageName = "Dynamic Content";

    //    Driver declaration
    private WebDriver driver;

    //    Selector for page header
    private By pageHeader = By.xpath("//h3[contains(text(),'Dynamic Content')]");

    //    Constructor for the class
    public DynamicContentPage(WebDriver driver) {
        this.driver = driver;
    }

    public static String getPageName() {
        return pageName;
    }

    //    Method to get page header element
    public WebElement getPageHeader() {

        WebElement pageHeaderElement = driver.findElement(this.pageHeader);
        return pageHeaderElement;
    }
}
