package AllTests;

import org.apache.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import locatorsAndSteps.*;

import java.util.concurrent.TimeUnit;

public class TestBase {
    protected static WebDriver driver;

    public static SupportPage supportPage;
    public static LoginPage loginPage;
    public static LKSettingsPage lkSettingsPage;
    public static RequestDemoWindov requestDemoWindov ;
    public static MainPage mainPage;
    public static PurchaseLandingPage searchPurchasePage;



    @BeforeTest
    public void SettingsTest()
    {

//        System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
//        driver = new ChromeDriver();
        driver = new RemoteWebDriver(DesiredCapabilities.chrome());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }


    @BeforeMethod
    public void StartMethod()
    {

        supportPage = new SupportPage();
        supportPage.init(driver);
        loginPage =  new LoginPage();
        loginPage.init(driver);
        lkSettingsPage = new LKSettingsPage();
        lkSettingsPage.init(driver);
        mainPage = new MainPage();
        mainPage.init(driver);
        requestDemoWindov = new RequestDemoWindov();
        requestDemoWindov.init(driver);
        searchPurchasePage = new PurchaseLandingPage();
        searchPurchasePage.init(driver);
    }


    @AfterTest
    public  void  AfterTest()
    {
        driver.quit();
    }
}

