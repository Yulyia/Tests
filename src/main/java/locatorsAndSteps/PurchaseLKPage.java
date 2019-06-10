package locatorsAndSteps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PurchaseLKPage extends BasePage{
    @FindBy(xpath = "//*[text()='Лицензии']")
    public WebElement LicenseButton;

    @FindBy(xpath = "//*[text()='Устройства']")
    public WebElement DevicesButton;

    @FindBy(xpath = " //*[text()='Добавить']")
    public WebElement ExtendButton;

    @FindBy(xpath = "//*[text()='Купить сейчас']")
    public WebElement PurchaseOneDeviceButton;

    @FindBy(css = "button.submit_button__AhVzI")
    public WebElement ApplyButton;

    @FindBy(css = "div.modal_container__error__3Gqcb")
    public WebElement MismatchMessage;

    @FindBy(css = " button.submit_button__AhVzI")
    public WebElement PayLKButton;

    @FindBy(css = " h1.title")
    public WebElement TitleYandex;


}
