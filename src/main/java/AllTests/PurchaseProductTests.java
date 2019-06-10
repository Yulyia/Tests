package AllTests;


import Precondition.Constans;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;
@Epic("Smoke Tests")
@Feature("PurchaseProductTests ")
public class PurchaseProductTests extends TestBase{

    @Test
    public void PurchaseProductTest() throws InterruptedException
    {
        driver.get(Constans.URL_CRYPTODETECTOR);
        searchPurchasePage.purchase();

        searchPurchasePage.clickPayButton();
        searchPurchasePage.inputDataCardField();
        searchPurchasePage.clickPayYandexButton();
        Thread.sleep(5000);
        Assert.assertTrue(searchPurchasePage.SuccsessTitle.isDisplayed());
        searchPurchasePage.clickCoBeBackButton();
        Assert.assertTrue(searchPurchasePage.CongratulationsPage.isDisplayed());
    }

    @Test
    public void PurchasePage()
    {
        driver.get(Constans.URL_CRYPTODETECTOR);
        searchPurchasePage.TarifTeamGetButton.click();
        searchPurchasePage.EmailField.sendKeys(Constans.E_mail);
        searchPurchasePage.NameField.sendKeys("Test");
        searchPurchasePage.PhoneField.sendKeys("7(567)567-56-75");
        searchPurchasePage.CheckoutButton.click();
        Assert.assertTrue(searchPurchasePage.VerifyForm.isDisplayed());
    }

}
