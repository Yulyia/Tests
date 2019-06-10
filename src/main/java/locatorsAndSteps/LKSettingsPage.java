package locatorsAndSteps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LKSettingsPage extends BasePage{


    @FindBy(css = "button.settings__submit__bSfLf")
    public WebElement ButtonSave;
    @FindBy(name = "name")
    public WebElement FieldName;
    @FindBy(name = "phone")
    public WebElement FieldPhone;
    @FindBy(name = "email")
    public WebElement FieldMail;
    @FindBy(name = "password")
    public WebElement FieldPAssword;
    @FindBy(name = "confirmPassword")
    public WebElement FieldPAssword2;
    @FindBy(xpath = "//*[text()='Настройки']")
    public WebElement ButtonSettings;
    @FindBy(css = "div.mismatch_message__1oVc_")
    public WebElement mismatchMessage;
    @FindBy(css = "p.user_name__1SXSX")
    public WebElement UserName;
    @FindBy(css = "p.user_email__AFWwQ")
    public WebElement UserMail;




    public void field_name_input(String Name)
    {
        FieldName.clear();
        FieldName.sendKeys(Name);
    }

    public void field_email_input(String Email)
    {
        FieldMail.clear();
        FieldMail.sendKeys(Email);
    }

    public void field_passwords_input(String Password1,String Password2)
    {
        FieldPAssword.clear();
        FieldPAssword2.clear();
        FieldPAssword.sendKeys(Password1);
        FieldPAssword2.sendKeys(Password2);
    }

    public void field_phone_input(String Phone)
    {
        FieldPhone.clear();
        FieldPhone.sendKeys(Phone);
    }

}

