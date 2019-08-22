import org.openqa.selenium.By;

public class Locators {

    //TestHomePage

    public static final By IFRAME_YOUTUBE = By.xpath("//iframe[@src='https://www.youtube.com/embed/RRECuJzm3IY?start=85']");
    public static final By BUTTON_YOUTUBE = By.cssSelector("button.ytp-large-play-button.ytp-button");

    //Test Gifts
    public static final By LINK_CATEGORY_SWEETS = By.xpath("//a[@href='https://romanceabroad.com/store/category-sweets']");
    public static final By GIFTS_STORE = By.xpath("//div[@class='col-xs-12  b-store-list']");
    public static final By GIFT_BEAR = By.xpath("//img[@src='https://romanceabroad.com/uploads/store/0/0/0/11/great-ffd05e6dee.jpg']");
    public static final By SIDE_MENU = By.xpath("//i[@class='fa fa-bars fa-lg item']");
    public static final By GIFT_MENU_OPTION = By.xpath("//a[contains(text(), '" + Data.menuOption +"')]");

    //Test Photos
    public static final By LINK_PHOTOS = By.xpath("//a[@href='https://romanceabroad.com/media/index']");
    public static final By CAROUSEL_LINE_PHOTOS = By.xpath("//div[@class='user-carousel-line ']");
   public static final By TANUA_PROFILE = By.xpath("//img[@title='Tanua']");
    public static final By DROPDOWN_LIST = By.xpath("//span[@id='gallery_media_sorter']//select");

}
