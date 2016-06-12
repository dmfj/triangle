import javax.print.attribute.standard.MediaSize;

/**
 * Created by jorged on 11/06/2016.
 */
public enum TriangleType {

    EQUILATERAL(2),
    ISOSCELES(1),
    SCALENE(0);

    Integer positiveComparisons;

    TriangleType(Integer positiveComparisons) {
        this.positiveComparisons = positiveComparisons;
    }

    public static TriangleType getTriangleType(Integer numberOfComparisons) {

        TriangleType triangleType;

        switch(numberOfComparisons) {
            case 1:
                triangleType = ISOSCELES;
                break;
            case 2:
                triangleType = EQUILATERAL;
                break;
            default:
                triangleType = SCALENE;
        }

        return triangleType;

    }
}
