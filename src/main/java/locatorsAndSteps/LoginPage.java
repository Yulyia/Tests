package locatorsAndSteps;

import Precondition.Constans;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static AllTests.TestBase.loginPage;

public class LoginPage extends BasePage{


    @FindBy(css = "a.start-auth")
    public WebElement LoginButton;

    @FindBy(css = "div.login_head__oT-a2")
    public WebElement LabelLogin;

    @FindBy(css = "div.email_input__Ei25f>input")
    public WebElement FieldLogin;

    @FindBy(css = "div.password_input__ap_I0>input")
    public WebElement FieldPassword;

    @FindBy(css = "button.login_button__3FoMe")
    public WebElement ButtonLogin;

    @FindBy(css = "span.auth_error_message__3FMpF")
    public WebElement ErrorMessage;

    @FindBy(css = "div.account__content__1YTit")
    public WebElement ContentAccaunt;

    @FindBy(xpath = "//*[text()='Выйти']")
    public WebElement ButtonExit;

    @FindBy(css = "div.recover_password__11-Qg>a")
    public WebElement PasswordRecoveryButton;

    @FindBy(name = "email")
    public WebElement EmailField;

    @FindBy(css = "input.recovery_button__1QzHX")
    public WebElement RecoverySendButton;

    @FindBy(css = "button.set_locale__btn__3BH36:nth-of-type(1)")
    public WebElement LanguageRussian;

    @FindBy(css = "button.set_locale__btn__3BH36:nth-of-type(2)")
    public WebElement LanguageEnglish;




    public void login(String login, String password)
    {
        FieldLogin.clear();
        FieldPassword.clear();
        FieldLogin.sendKeys(login);
        FieldPassword.sendKeys(password);
        ButtonLogin.click();
    }

    public  void LanguageEnglish (){

        LanguageEnglish.click();

    }

    public  void LanguageRussian ()
    {
        LanguageRussian.click();
    }

    public void email_field_imput()
    {
        FieldLogin.clear();
        FieldLogin.sendKeys(Constans.E_mail);
    }

    public void password_field_imput()
    {
        FieldPassword.clear();
        FieldPassword.sendKeys(Constans.Password);
    }

    public void buttin_logout_click()
    {
        LanguageRussian();
        ButtonExit.click();
    }

    public void buttin_login_click()
    {
        LoginButton.click();
    }

    public void email_recovery_field_imput()
    {
        EmailField.clear();
        EmailField.sendKeys(Constans.E_mail);
    }




}
