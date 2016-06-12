import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by jorged on 11/06/2016.
 */
public class TriangleTest {

    @Test
    public void checkIfNotEmpty() {

        Triangle triangle = new Triangle(Arrays.asList());
        assertNotNull(triangle);

    }

    @Test(expected=NumberFormatException.class)
    public void checkIfNotLongs() {

        new Triangle(Arrays.asList("10", "potato", "12.2"));

    }

    @Test
    public void checkIfPositives() {

        Triangle triangle = new Triangle(Arrays.asList("10", "-11", "12"));
        Boolean testResult = triangle.hasOnlyPositiveValues();
        assertEquals(testResult, false);

    }

    @Test
    public void checkIfTriangle() {

        Triangle triangle = new Triangle(Arrays.asList("10", "11", "12.3"));
        Boolean testResult = triangle.hasThreeLengths();
        assertEquals(testResult, true);

    }

    @Test
    public void checkTriangleInequality() {

        Triangle triangle = new Triangle(Arrays.asList("23", "2.3", "11"));
        Boolean testResult = triangle.validateInequality();
        assertEquals(testResult, false);

    }

    @Test
    public void checkIfEquilateral() {

        Triangle triangle = new Triangle(Arrays.asList("10", "10", "10"));
        TriangleType testResult = triangle.getTriangleType();
        assertEquals(testResult, TriangleType.EQUILATERAL);

    }

    @Test
    public void checkIfIsosceles() {

        Triangle triangle = new Triangle(Arrays.asList("10.4", "11", "10.4"));
        TriangleType testResult = triangle.getTriangleType();
        assertEquals(testResult, TriangleType.ISOSCELES);

    }

    @Test
    public void checkIfScalene() {

        Triangle triangle = new Triangle(Arrays.asList("10", "11", "12"));
        TriangleType testResult = triangle.getTriangleType();
        assertEquals(testResult, TriangleType.SCALENE);

    }
}
