import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class GiftPage extends BaseActions {

    public GiftPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public void navigateToGiftPage(){
        driver.findElement(Locators.LINK_CATEGORY_SWEETS).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    public void navigateToGiftStore(){
        WebElement giftsStore = driver.findElement(Locators.GIFTS_STORE);
        if (giftsStore.isDisplayed()) {
            driver.findElement(Locators.GIFT_BEAR).click();
        }
        driver.navigate().back();

    }
    public void testMenuUnorderedList() {

        WebElement sideMenuList = driver.findElement(Locators.SIDE_MENU);
        sideMenuList.click();
        WebDriverWait waitSec = new WebDriverWait(driver, 10);
        waitSec.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.SIDE_MENU)));
        driver.findElement(Locators.GIFT_MENU_OPTION).click();
    }
}


