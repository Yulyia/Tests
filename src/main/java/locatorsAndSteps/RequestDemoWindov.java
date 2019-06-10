package locatorsAndSteps;

import Precondition.Constans;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RequestDemoWindov extends BasePage{

    @FindBy(css = "div.tariff>a.leading-block__try-btn_demo")
    public WebElement TarifTeamGetButton;

    @FindBy(id = "send_email_input")
    public WebElement EmailField;

    @FindBy(id = "send_email")
    public WebElement SendButton;

    @FindBy(css = "div.bad")
    public WebElement ErrorMassage;

    @FindBy(css = "div.good")
    public WebElement SuccessedMassage;

    @FindBy(id = "license-link")
    public WebElement LicenseLink;

    @FindBy(css = " div.license-text")
    public WebElement LicensePage;

    public void email_field_input(String Email) {
        EmailField.clear();
        EmailField.sendKeys(Email);
    }



}
