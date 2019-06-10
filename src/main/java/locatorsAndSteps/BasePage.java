package locatorsAndSteps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public void init(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


}
