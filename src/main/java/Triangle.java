import java.util.ArrayList;
import java.util.List;

/**
 * Created by jorged on 11/06/2016.
 */
public class Triangle {

    private List<Double> lengths;

    public Triangle(List lengths) throws NumberFormatException{
        lengths = new ArrayList<Double>();

        for (Object size : lengths) {
            this.lengths.add(Double.parseDouble(String.valueOf(size)));
        }
    }

    /**
     * Verifies if we have 3 lengths
     * @return true if size of list is 3; false if any other
     */
    public Boolean hasThreeLengths() {
        return lengths.size() == 3;
    }

    /**
     * Validates if the lengths are positive values
     * @return true if all elements of the lengths list are positive; false if any is negative
     */
    public Boolean hasOnlyPositiveValues() {
        Boolean allArePositive = true;

        for (Double length : lengths) {
            if (length <= 0) {
                allArePositive = false;
                break;
            }
        }

        return allArePositive;
    }

    /**
     * Checks the type of triangle
     * @return TriangleType object that can be EQUILATERAL, ISOSCELES or SCALENE
     */
    public TriangleType getTriangleType() {
        Integer positiveComparisonCounter = 0;

        // Loops through the list of lengths to compare every single one
        // with all the others avoiding repetitions
        for (int i = 0; i < lengths.size(); i++) {
            for (int j = i + 1; j < lengths.size(); j++) {

                //Checks if the lengths are the same and increments the number of positive comparisons if so
                if (lengths.get(i).equals(lengths.get(j))) {
                    positiveComparisonCounter += 1;
                }

            }

            //If 2 comparisons are true, no need to compare anymore
            if (TriangleType.getTriangleType(positiveComparisonCounter) == TriangleType.EQUILATERAL) {
                break;
            }
        }

        return TriangleType.getTriangleType(positiveComparisonCounter);
    }

    /**
     * Validates the triangle inequality, which states that the sum of 2 sides of a triangle are always
     * bigger than / equal to the remaining side
     * @return true if triangle inequality verifies; false if not
     */
    public Boolean validateInequality() {

        Boolean validated = true;

        for (int i = 0; i < lengths.size(); i++) {

            Double sumOfTheOtherTwo = 0.0;

            for (int j = 0; j < lengths.size(); j++) {
                if (i != j) {
                    sumOfTheOtherTwo += lengths.get(j);
                }
            }

            if (sumOfTheOtherTwo < lengths.get(i)) {
                validated = false;
                break;
            }
        }

        return validated;
    }
}
