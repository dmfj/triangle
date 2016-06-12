import java.util.Arrays;

/**
 * Created by jorged on 12/06/2016.
 */
public class TriangleChecker {

    public static void main(String[] args) {

        try {

            Triangle triangle = new Triangle(Arrays.asList(args));

            if (triangle.isValidTriangle()) {
                System.out.println(triangle.getTriangleType().name());
            } else {
                System.out.println("Sorry, but this is not a triangle.");
            }

        } catch (NumberFormatException ex) {
            System.out.println("One or more lengths provided are invalid. Please check.");
        }

    }

}
