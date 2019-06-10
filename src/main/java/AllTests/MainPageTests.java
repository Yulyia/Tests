package AllTests;

import Precondition.Constans;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import locatorsAndSteps.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

@Epic("Smoke Tests")
@Feature("MainPageTests ")
public class MainPageTests extends TestBase{

       @Test
       public void ActiveButtonOnMainMenu(){
            driver.get(Constans.URL_CRYPTODETECTOR);
            mainPage.LanguageEnglish();

            mainPage.Home.click();
            Assert.assertEquals(mainPage.ActiveMenu.getText(),"Home");

            mainPage.Prevent.click();
            Assert.assertEquals(mainPage.ActiveMenu.getText(),"Prevent");

            mainPage.Price.click();
            Assert.assertEquals(mainPage.ActiveMenu.getText(),"Price");

            mainPage.Contacts.click();
            Assert.assertEquals(mainPage.ActiveMenu.getText(),"Contacts");
        }


    @Test()
    public void BlockHomeMoovinField() throws InterruptedException {
        driver.get(Constans.URL_CRYPTODETECTOR);

        mainPage.Home.click();
        Assert.assertTrue(250<= mainPage.TitleHome.getLocation().x && mainPage.TitleHome.getLocation().x<=700);
        Actions Actions = new Actions(driver);
        Actions.moveToElement(mainPage.ButtonForHome).build().perform();
        Thread.sleep(3000);
        Assert.assertTrue(mainPage.TitleHome.getLocation().x>=800);

        Assert.assertTrue(mainPage.BlockForHome.isDisplayed());


        Actions.moveToElement(mainPage.ButtonForBusiness).build().perform();
        Thread.sleep(1000);
        Assert.assertTrue(mainPage.TitleHome.getLocation().x<=200);

        Assert.assertTrue(mainPage.BlockForBusiness.isDisplayed());
    }


    @Test()
    public void moovingToMainPage() throws InterruptedException {
        driver.get(Constans.URL_CRYPTODETECTOR);

        mainPage.Prevent.click();

        Wait<WebDriver> newWait = new WebDriverWait(driver, 10, 1000).withMessage("Scroll failed!");
        newWait.until(CustomConditions.scrollSucceseed());

        Long  scrollPrevent2 = (Long) ((JavascriptExecutor)driver).executeScript("return window.pageYOffset;");
        Long b= (Long)((JavascriptExecutor)driver).executeScript("return jQuery.active;");
        System.out.println(b);
        Assert.assertTrue(scrollPrevent2<1500 && scrollPrevent2>500);

        mainPage.Home.click();
        Assert.assertTrue(mainPage.BlockHome.isDisplayed());
        Thread.sleep(1000);
        Long  scrollHome2 = (Long) ((JavascriptExecutor)driver).executeScript("return window.pageYOffset;");
        Assert.assertTrue(scrollHome2<=500);

        mainPage.Price.click();
        Assert.assertTrue(mainPage.Buy.isDisplayed());
        Thread.sleep(1000);
        Long  scrollPrice2 = (Long) ((JavascriptExecutor)driver).executeScript("return window.pageYOffset;");
        Assert.assertTrue(scrollPrice2>1500 && scrollPrice2<2000);

        mainPage.Contacts.click();
        Assert.assertTrue(mainPage.footer.isDisplayed());
        Thread.sleep(1000);
        Long  scrollContacts2 = (Long) ((JavascriptExecutor)driver).executeScript("return window.pageYOffset;");
        Assert.assertTrue(scrollContacts2>2000 && scrollContacts2<3000);
    }


    @Test(enabled = false)
    public void RequestDemo(){
        driver.get(Constans.URL_CRYPTODETECTOR);
        requestDemoWindov.TarifTeamGetButton.click();
        (new WebDriverWait(driver, 30))
               .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.sign-in")));
        requestDemoWindov.SendButton.click();
        Assert.assertTrue(requestDemoWindov.ErrorMassage.isDisplayed());

        requestDemoWindov.email_field_input(Constans.E_mail);
        requestDemoWindov.SendButton.click();
        Assert.assertTrue(requestDemoWindov.SuccessedMassage.isDisplayed());
    }
}


