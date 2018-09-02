package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DynamicContentPage {

    //    Driver declaration
    private WebDriver driver;

    //    Selector for page header
    private By pageHeader = By.xpath("//h3[contains(text(),'Dynamic Content')]");

    //    Constructor
    public DynamicContentPage(WebDriver driver) {
        this.driver = driver;
    }

    //    Method to get page header element
    public WebElement getPageHeader() {

        WebElement pageHeaderElement = driver.findElement(this.pageHeader);
        return pageHeaderElement;
    }
}
