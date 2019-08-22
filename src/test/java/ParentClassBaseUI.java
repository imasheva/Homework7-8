import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class ParentClassBaseUI {

    static WebDriver driver;
    WebDriverWait wait;

    PhotoPage photoPage;
    GiftPage giftPage;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        photoPage = new PhotoPage(driver, wait);
        giftPage = new GiftPage(driver, wait);

        driver.manage().window().maximize();
        driver.get(Data.mainUrl);
    }

    public static void checkAssert(String expectedUrl) {
        String findedUrl = driver.getCurrentUrl();
        Assert.assertEquals(findedUrl, expectedUrl);
    }

    public static void checkTitleAssert(String extectedTitle) {
        String findedTitle = driver.getTitle();
        Assert.assertEquals(findedTitle, extectedTitle);
    }

    public static void mouseClick(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();

    }

    @AfterMethod
    public void afterActions() {
        driver.quit();
    }

}