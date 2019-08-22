import org.testng.annotations.Test;



public class TestGifts extends ParentClassBaseUI {

    @Test
    public void testGifts() {
       //Action logic1
        giftPage.navigateToGiftPage();
        checkAssert(Data.expectedUrlTestGifts);
        checkTitleAssert(Data.expectedTitleTestGifts);
       //Action Logic2
        giftPage.navigateToGiftStore();
        //Action Logic3
        giftPage.testMenuUnorderedList();
    }


}

