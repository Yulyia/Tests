package locatorsAndSteps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SupportPage extends BasePage {

    @FindBy(xpath = "//*[text()='Support']")
    public WebElement SupportButton;

    @FindBy(id = "user_email")
    public WebElement EmailField;

    @FindBy(id = "user_name")
    public WebElement NameField;

    @FindBy(id = "user_message")
    public WebElement MessageField;

    @FindBy(css = " button.support_form-submit")
    public WebElement SubmitSupportButton;

    @FindBy(css = "div.notification-title_success")
    public WebElement ModalSuccessForm;

    @FindBy(css = "div.notification-title_fail")
    public WebElement ModalFailForm;

    @FindBy(id = "close_notification_btn")
    public WebElement CloseButton;




}
