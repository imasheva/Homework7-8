import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

    public class BaseActions {

        protected WebDriver driver;
        protected WebDriverWait wait;

        //contructor
        public BaseActions(WebDriver driver, WebDriverWait wait) {
            this.driver = driver;
            this.wait = wait;
        }

    }


