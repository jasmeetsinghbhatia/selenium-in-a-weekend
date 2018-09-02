package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    public static void clickOpenPage(WebDriver driver, String page){
        By pageLink = By.linkText(page);
        driver.findElement(pageLink).click();
    }
}
