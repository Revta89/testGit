import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemPage extends BasePage {



    @FindBy(xpath = "//span[@id='priceblock_ourprice']")
    protected static WebElement ITEM_PRICE;

    public ItemPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.getDriver(), this);
    }

    public Double getItemPrice() {
       return Double.parseDouble(ITEM_PRICE.getText().substring(1));

    }
}
