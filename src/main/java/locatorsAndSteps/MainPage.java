package locatorsAndSteps;

import AllTests.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    @FindBy(id = "home-link")
    public WebElement Home;

    @FindBy(css = "a.menu__link.active")
    public WebElement ActiveMenu;

    @FindBy(css = "div.col-xs-6.leading-block__home>a")
    public WebElement ButtonForHome;

    @FindBy(css = "div.title-block")
    public WebElement TitleHome;

    @FindBy(css = "div.leading-block__business>a")
    public WebElement ButtonForBusiness;

    @FindBy(css = "div.leading-block__description-home")
    public WebElement BlockForHome;

    @FindBy(css = "div.leading-block__description-business")
    public WebElement BlockForBusiness;

    @FindBy(id = "prevent-link")
    public WebElement Prevent;

    @FindBy(css = "#prevent .advantage-text__head")
    public WebElement Security;

    @FindBy(id = "price-link")
    public WebElement Price;

    @FindBy(css = "div.find-security")
    public WebElement Buy;

    @FindBy(id = "contacts-link")
    public WebElement Contacts;

    @FindBy(css = "div.footer-logo")
    public WebElement footer;

    @FindBy(id = "home")
    public WebElement BlockHome;

    @FindBy(css = " a.navbar-crypto__logo")
    public WebElement CryptodetectorLogoButton;

    @FindBy(css = "button.lang_selector.active")
    public WebElement ActiveLanguadge;

    @FindBy(css = "div>button.lang_selector:nth-of-type(2)")
    public WebElement LanguageRussian;

    @FindBy(css = "div>button.lang_selector:nth-of-type(1)")
    public WebElement LanguageEnglish;




    public  void LanguageEnglish (){
            LanguageEnglish.click();
    }


}
