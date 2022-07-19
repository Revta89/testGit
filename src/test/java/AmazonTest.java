import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AmazonTest {
    private WebDriver driver;


    @BeforeClass (description = "Start browser")
    private void initBrowser() {
        System.setProperty("webdriver.chrome.driver", "D://_webdriver//chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS );
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test (description = "Amazon test")
    public void amazonSearchTest() {
        Double iphonePrice = new HomePage(driver).open().fillSearchInput("Iphone 11").pressSearch().openFirstItem().getItemPrice();
        Assert.assertTrue( iphonePrice <800, "Iphone 11 is very expensive");
    }


    @AfterClass (description = "Close browser")
      public void tearDown() {
       driver.quit();
    }
// new test

}
