package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPasswordPage {
    // PAGE NAME NEEDS TO BE CONSTANT, IT WILL BE USED THROUGHOUT ALL THE TESTS FOR THIS PAGE
    private static final String PAGE_NAME = "Forgot Password";
    private static final String CONFIRMATION_TEXT = "Your e-mail's been sent!";

    //    Driver declaration
    private WebDriver driver;

    //    Selector for Forgot Password Page
    private By pageHeader = By.xpath("//h2[contains(text(),'Forgot Password')]");
    private By emailTextBox = By.xpath("//input[@id='email']");
    private By retrievePasswordButton = By.xpath("//button[@id='form_submit']");
    private By confirmationPageContent = By.xpath("//div[@id='content']");

    // Test Email to use for forgot password test
    private static final String forgotPasswordEmail = "test@test.com";

    //    Constructor for the class
    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public static String getPageName() {
        return PAGE_NAME;
    }

    public static String getConfirmationText() {
        return CONFIRMATION_TEXT;
    }

    //    Method to get page header element
    public WebElement getPageHeader() {
        return driver.findElement(this.pageHeader);
    }

    public void typeEmailInTextBox() {
        WebElement emailTextBoxElement = driver.findElement(this.emailTextBox);
        emailTextBoxElement.sendKeys(forgotPasswordEmail);
    }

    public void submitForgotPasswordEmail() {
        WebElement retrievePasswordButtonElement = driver.findElement(this.retrievePasswordButton);
        retrievePasswordButtonElement.click();
    }

    public String getConfirmationPageContent() {
        WebElement confirmationPageContentText = driver.findElement(this.confirmationPageContent);
        return confirmationPageContentText.getText();
    }
}
