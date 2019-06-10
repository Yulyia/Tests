package locatorsAndSteps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PurchaseLandingPage extends BasePage{
    @FindBy(css = "div.selected-product__table")
    public WebElement SelectedProductForm;

    @FindBy(id = "emailUser")
    public WebElement EmailField;

    @FindBy(id = "nameUser")
    public WebElement NameField;

    @FindBy(id = "phoneUser")
    public WebElement PhoneField;

    @FindBy(css = "a.tariff_team")
    public WebElement TarifTeamGetButton;

    @FindBy(css = "div.user-data__form_btn")
    public WebElement CheckoutButton;

    @FindBy(css = "div.user-data__title")
    public WebElement VerifyForm;

    @FindBy(xpath = "//*[text()='Pay']")
    public WebElement PayButton;

    @FindBy(id = "cardNumber")
    public WebElement CardNumberField;

    @FindBy(name = "skr_cardCvc")
    public WebElement CardCVCField;

    @FindBy(name = "skr_month")
    public WebElement MonthField;

    @FindBy(name = "skr_year")
    public WebElement YearField;

    @FindBy(css = "button.payment-contract__pay-button")
    public WebElement PayYandexButton;

    @FindBy(css = " h1.title_last_yes")
    public WebElement SuccsessTitle;

    @FindBy(css = "a.payment-success__back-control")
    public WebElement GoBeBackButton;

    @FindBy(css = "div.congrats-block")
    public WebElement CongratulationsPage;


    public  void purchase(){
        TarifTeamGetButton.click();
        EmailField.sendKeys("julia.artyukhina@osinit.com");
        NameField.sendKeys("Test");
        PhoneField.sendKeys("7(567)567-56-75");
        CheckoutButton.click();
    }


    public  void clickPayButton(){

        PayButton.click();
    }

    public  void inputDataCardField(){
       CardNumberField.sendKeys("4444 4444 4444 4448");
       CardCVCField.sendKeys("000");
       MonthField.sendKeys("01");
       YearField.sendKeys("25");
    }
    public  void clickPayYandexButton(){
        PayYandexButton.click();
    }

    public  void clickCoBeBackButton(){
        GoBeBackButton.click();
    }



}
