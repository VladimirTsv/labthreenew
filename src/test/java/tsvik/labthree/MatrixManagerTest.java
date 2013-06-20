package tsvik.labthree;

import com.sun.org.apache.xpath.internal.operations.Equals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatrixManagerTest {
    private static final int[][] matrixBody = {{1, 1}, {1, 1}};

    Matrix matrix = new Matrix();

    @Test
    public void testFindMax() {

        MatrixManager matrixManager = new MatrixManager();
        matrix.setMainMatrix(matrixBody);
        matrix.setMatrixLinesCount(2);
        matrix.setMatrixColumnsCount(2);

        assertEquals(1, matrixManager.searchMaxElement(matrix));
    }

    @Test
    public void testFindMin() {

        MatrixManager matrixManager = new MatrixManager();
        matrix.setMainMatrix(matrixBody);
        matrix.setMatrixLinesCount(2);
        matrix.setMatrixColumnsCount(2);

        assertEquals(1, matrixManager.searchMinElement(matrix));
    }

    @Test
    public void testFindSum() {

        MatrixManager matrixManager = new MatrixManager();
        matrix.setMainMatrix(matrixBody);
        matrix.setMatrixLinesCount(2);
        matrix.setMatrixColumnsCount(2);

        assertEquals(4, matrixManager.searchSumElements(matrix));
    }
}
