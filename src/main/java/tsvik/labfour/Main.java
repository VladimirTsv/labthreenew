package tsvik.labfour;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static final int RANDOM_DOWN_POINT = -10;
    public static final int RANDOM_UP_POINT = 10;
    public static final String DELIMITER = "  ";

    public static void main(String[] args) {


        MatrixManager matrixManager = new MatrixManager();
        Matrix matrix = matrixManager.createRandomMatrix(6, 6, RANDOM_DOWN_POINT, RANDOM_UP_POINT);

        matrixManager.printMatrix(matrix, DELIMITER);
        matrix.setMaxElement(matrixManager.searchMaxElement(matrix));
        matrix.setMinElement(matrixManager.searchMinElement(matrix));
        matrix.setSumElements(matrixManager.searchSumElements(matrix));
        matrixManager.printResults(matrix);/* */

    }

}