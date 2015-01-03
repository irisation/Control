import com.busel.Rhombus;
import com.busel.Tetragon;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Irko on 03.01.2015.
 */
public class PerimeterTest {

    @DataProvider(name = "Perimeter")
    public static Object[][] primeNumbers() {
        return new Object[][] { { 16, new Rhombus(4,45)}, { 20, new Rhombus(5,45)}, { 4, new Rhombus(1,50)} };
    }

    @Test(dataProvider = "Perimeter")
    public void testPerimeterChecker(Integer expectedResult, Rhombus rhombus) {
        Assert.assertEquals((Integer)expectedResult,(Integer)Tetragon.getPerimeter(rhombus));
    }
}
