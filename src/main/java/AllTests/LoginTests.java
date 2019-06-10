package AllTests;

import Precondition.Constans;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.logging.Logger;

import static Precondition.TestRailConf.get_tests_in_run;
import static Precondition.TestRailConf.update_testrail;

@Epic("Smoke Tests")
@Feature("LoginTests ")
public class LoginTests extends TestBase {
    private String incorrect_password = "111111";
    private static final Logger LOGGER = Logger.getLogger(LoginTests.class.getName());

    @Test
    public void LoginNegativeTest() throws Exception {
        driver.get(Constans.URL_CRYPTODETECTOR);
        get_tests_in_run("142");
        update_testrail(12699, 142, false);

        loginPage.buttin_login_click();
        loginPage.FieldLogin.clear();
        loginPage.FieldPassword.clear();
        Assert.assertTrue(!loginPage.ButtonLogin.isEnabled());

        loginPage.FieldLogin.sendKeys(Constans.E_mail);
        Assert.assertTrue(!loginPage.ButtonLogin.isEnabled());

        loginPage.FieldPassword.sendKeys(incorrect_password);
        loginPage.ButtonLogin.click();
        Assert.assertTrue(loginPage.ErrorMessage.isDisplayed());
    }

    @Test
    public void LoginPositiveTest()  {
        LOGGER.info("Тест проверяет позитивный сценарий авторизации");
        driver.get(Constans.URL_CRYPTODETECTOR);

        loginPage.buttin_login_click();
        loginPage.email_field_imput();
        loginPage.password_field_imput();
        loginPage.ButtonLogin.click();
        Assert.assertTrue(loginPage.ContentAccaunt.isDisplayed());

        loginPage.buttin_logout_click();
    }

    @Test
    public void PasswordRecoveryTest()  {
        driver.get(Constans.URL_CRYPTODETECTOR);
        loginPage.buttin_login_click();
        loginPage.PasswordRecoveryButton.click();
        Assert.assertTrue(!loginPage.RecoverySendButton.isEnabled());

        loginPage.email_recovery_field_imput();
        loginPage.RecoverySendButton.click();
    }

}
