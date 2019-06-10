package AllTests;

import Precondition.Constans;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;

@Epic("Smoke Tests")
@Feature("LKSettingsTests ")
public class LKSettingsTests extends TestBase{



    @Test
    public void LKSettingsTrue() {
        driver.get(Constans.URL_CRYPTODETECTOR);
        loginPage.buttin_login_click();
        loginPage.login(Constans.E_mail, Constans.Password);
        loginPage.LanguageRussian();
        lkSettingsPage.ButtonSettings.click();

        lkSettingsPage.field_name_input("Test");
        lkSettingsPage.field_email_input("test@test.ru");
        lkSettingsPage.field_passwords_input("123qwe","123qwe");
        lkSettingsPage.ButtonSave.click();

        driver.navigate().refresh();

        loginPage.login("test@test.ru", "123qwe");
        lkSettingsPage.ButtonSettings.click();
        Assert.assertEquals(lkSettingsPage.UserName.getText(), "Test");
        Assert.assertEquals(lkSettingsPage.UserMail.getText(), "test@test.ru");

        lkSettingsPage.field_name_input(Constans.Name);
        lkSettingsPage.field_phone_input(Constans.Phone);
        lkSettingsPage.field_email_input(Constans.E_mail);
        lkSettingsPage.field_passwords_input(Constans.Password, Constans.Password);
        lkSettingsPage.ButtonSave.click();
    }


    @Test()
    public void LKSettingsincorrectEmail() {
        driver.get(Constans.URL_CRYPTODETECTOR);
        loginPage.LoginButton.click();
        loginPage.login(Constans.E_mail, Constans.Password);
        loginPage.LanguageRussian();
        lkSettingsPage.ButtonSettings.click();

        lkSettingsPage.FieldPhone.clear();
        lkSettingsPage.field_email_input("123");
        Assert.assertTrue(lkSettingsPage.mismatchMessage.isDisplayed());
        Assert.assertTrue(!lkSettingsPage.ButtonSave.isEnabled());

        loginPage.buttin_logout_click();
    }

    @Test()
    public void LKSettingsPassword2IsEmty() {
        driver.get(Constans.URL_CRYPTODETECTOR);
        loginPage.LoginButton.click();
        loginPage.login(Constans.E_mail, Constans.Password);
        loginPage.LanguageRussian();
        lkSettingsPage.ButtonSettings.click();

        lkSettingsPage.field_email_input("test@test.ru");
        lkSettingsPage.FieldPAssword.sendKeys("123");
        Assert.assertTrue(lkSettingsPage.mismatchMessage.isDisplayed());
        Assert.assertTrue(!lkSettingsPage.ButtonSave.isEnabled());

        lkSettingsPage.FieldPAssword.clear();
        lkSettingsPage.FieldPAssword.sendKeys("123qwe");
        lkSettingsPage.FieldPAssword2.sendKeys("123");
        Assert.assertTrue(lkSettingsPage.mismatchMessage.isDisplayed());
        Assert.assertTrue(!lkSettingsPage.ButtonSave.isEnabled());

        loginPage.buttin_logout_click();
    }

    @Test()
    public void LKSettingsIncorrectPasswords() {
        driver.get(Constans.URL_CRYPTODETECTOR);
        loginPage.LoginButton.click();
        loginPage.login(Constans.E_mail, Constans.Password);
        loginPage.LanguageRussian();
        lkSettingsPage.ButtonSettings.click();

        lkSettingsPage.field_email_input("test@test.ru");

        lkSettingsPage.field_passwords_input("123qwe", "123");
        Assert.assertTrue(lkSettingsPage.mismatchMessage.isDisplayed());
        Assert.assertTrue(!lkSettingsPage.ButtonSave.isEnabled());

        loginPage.buttin_logout_click();
    }

}

