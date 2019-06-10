package AllTests;

import Precondition.Constans;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
@Epic("Smoke Tests")
@Feature("SupportPageTest ")
public class SupportPageTest extends TestBase{

    @Test
    public void SupportTest()  {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.get("http://192.168.111.151/");
        supportPage.SupportButton.click();

        supportPage.EmailField.sendKeys(Constans.E_mail);
        supportPage.NameField.sendKeys(Constans.Name);
        supportPage.MessageField.sendKeys("TEST: I don't go to the Settings");
        supportPage.SubmitSupportButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.modal-form")));
        Assert.assertTrue(supportPage.ModalSuccessForm.isDisplayed());
        supportPage.CloseButton.click();

        driver.navigate().refresh();
        supportPage.SubmitSupportButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.modal-form")));
        Assert.assertTrue(supportPage.ModalFailForm.isDisplayed());
    }




}
