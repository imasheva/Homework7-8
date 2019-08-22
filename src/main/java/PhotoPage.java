
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class PhotoPage extends BaseActions {

    public PhotoPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void clickToPhotoPage() {
        driver.findElement(Locators.LINK_PHOTOS).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    public void carouselProcess() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.CAROUSEL_LINE_PHOTOS)));

        WebElement carouselLine = driver.findElement(Locators.CAROUSEL_LINE_PHOTOS);
        if (carouselLine.isDisplayed()) {
            driver.findElement(Locators.TANUA_PROFILE).click();
        }
    }

    public void testDropDownListLeft() {
        driver.navigate().back();

        Select dropDownList = new Select(driver.findElement(Locators.DROPDOWN_LIST));
        dropDownList.selectByIndex(Data.sortByIndex);
    }
}