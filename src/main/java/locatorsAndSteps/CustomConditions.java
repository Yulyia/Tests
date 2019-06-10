package locatorsAndSteps;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class CustomConditions extends BasePage {

    public static ExpectedCondition<Boolean> scrollSucceseed() {
        return new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return (Boolean) ((JavascriptExecutor) driver)
                        .executeScript("var a = window.pageYOffset; return a<1500 && a>500;");
            }
        };
    }
}
