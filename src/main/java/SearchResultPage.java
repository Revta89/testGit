import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage extends BasePage {


    @FindBy (xpath = "//a/span[text()='Apple iPhone 11 (64GB, White) [Locked] + Carrier Subscription']")
    protected static WebElement FIRST_RESULT;

    public SearchResultPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.getDriver(), this);

    }

    public ItemPage openFirstItem() {
        //waitForElementDisplayed((By) FIRST_RESULT);
        FIRST_RESULT.click();
        return new ItemPage(this.getDriver());
    }
}
