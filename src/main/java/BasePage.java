import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    private WebDriver driver;
    private static final int WAIT_FOR_ELEMENT = 10;
    public BasePage (WebDriver driver) {
        this.driver = driver;
    }
    public WebDriver getDriver() {
        return driver;
    }
    protected void waitForElementDisplayed( String text) {
    new WebDriverWait(driver, WAIT_FOR_ELEMENT).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(text)));
    }
}
