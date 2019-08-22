
import org.testng.annotations.Test;


public class TestPhotos extends ParentClassBaseUI {

    @Test
    public void testPhotos() {

        //action logic 1
        photoPage.clickToPhotoPage();

        checkAssert(Data.expectedUrlTestPhotos);
        checkTitleAssert(Data.expectedUrlTitleTestPhotos);

        //action logic 2
        photoPage.carouselProcess();

        //action logic 3
        photoPage.testDropDownListLeft();
    }

}
