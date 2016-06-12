import java.util.List;

/**
 * Created by jorged on 11/06/2016.
 */
public class Triangle {

    private List<String> sizes;

    public Triangle(List sizes) {
        this.sizes = sizes;
    }

    public Boolean validateTriangle() {
        return sizes.size() == 3;
    }

    public void checkLongValues() throws NumberFormatException{

        for (String size : sizes) {
            Long.parseLong(size);
        }

    }

    public TriangleType checkTriangleType() {
        Integer positiveComparisonCounter = 0;

        // Loops through the list of sizes to compare every single one
        // with all the others avoiding repetitions
        for (int i = 0; i < sizes.size(); i++) {
            for (int j = i + 1; j < sizes.size(); j++) {

                //Checks if the sizes are the same and increments the number of positive comparisons if so
                if (sizes.get(i).contentEquals(sizes.get(j))) {
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

}
