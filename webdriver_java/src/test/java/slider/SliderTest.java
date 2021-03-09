package slider;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SliderTest extends BaseTests {
    @Test

    public void testSlideToNumber(){
        String value = "4";
        var slidePage = homePage.clickHorizontalSliderPage();
        slidePage.setSliderValue(value);
        assertEquals(slidePage.getSliderValue(), value, "Slider value incorrect");
    }
}
