import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {


    private static final String URL = "https://www.amazon.com/";
    private WebDriver driver;

    @FindBy (xpath = "//*[@id='twotabsearchtextbox']")
    protected WebElement searchField;


    @FindBy (xpath = "//div[@class ='nav-search-submit nav-sprite']")
    protected WebElement searchButton;

    public HomePage(WebDriver driver) {
        super(driver);
       PageFactory.initElements(this.getDriver(),this);
    }

    public HomePage open() {
        getDriver().get(URL);
        return this;
    }

    public HomePage fillSearchInput (String query) {

        searchField.sendKeys(query);

        return this;
    }

    public SearchResultPage pressSearch () {
        waitForElementDisplayed("//*[@id='twotabsearchtextbox']");
        //waitForElementDisplayed((By) searchButton);
        searchButton.click();
        return new SearchResultPage(getDriver());


    }
}

//tasty-drop.net

