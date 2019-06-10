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
@Feature("LicenseAgreementTests")
public class LicenseAgreementTests extends TestBase {

    @Test
    public void LicenseAgreement()  {
        driver.get(Constans.URL_CRYPTODETECTOR);
        requestDemoWindov.TarifTeamGetButton.click();
        (new WebDriverWait(driver, 30))
                .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.sign-in")));
        requestDemoWindov.LicenseLink.click();
        Assert.assertTrue(requestDemoWindov.LicensePage.isDisplayed());

        mainPage.CryptodetectorLogoButton.click();
        Assert.assertTrue(mainPage.TitleHome.isDisplayed());
    }


}
