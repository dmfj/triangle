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

        Triangle triangle = new Triangle(Arrays.asList("10", "11", "12"));
        assertNotNull(triangle);

    }

    @Test
    public void checkIfTriangle() {

        Triangle triangle = new Triangle(Arrays.asList("10", "11", "12"));
        Boolean testResult = triangle.validateTriangle();
        assertEquals(testResult, true);

    }

    @Test
    public void checkIfEquilateral() {

        Triangle triangle = new Triangle(Arrays.asList("10", "10", "10"));
        Integer testResult = triangle.checkTriangleType();
        assertEquals(testResult, Triangle.EQUILATERAL);

    }

    @Test
    public void checkIfIsosceles() {

        Triangle triangle = new Triangle(Arrays.asList("10", "11", "10"));
        Integer testResult = triangle.checkTriangleType();
        assertEquals(testResult, Triangle.ISOSCELES);

    }

    @Test
    public void checkIfScalene() {

        Triangle triangle = new Triangle(Arrays.asList("10", "11", "12"));
        Integer testResult = triangle.checkTriangleType();
        assertEquals(testResult, Triangle.SCALENE);

    }
}
