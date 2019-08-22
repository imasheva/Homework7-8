import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestHomePage extends ParentClassBaseUI{

    @Test
    public void testIframe(){
        WebElement iframeYouTube = driver.findElement(Locators.IFRAME_YOUTUBE);
        driver.switchTo().frame(iframeYouTube);
        driver.findElement(Locators.BUTTON_YOUTUBE).click();

    }
}
