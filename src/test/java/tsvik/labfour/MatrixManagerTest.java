package tsvik.labfour;

import com.sun.org.apache.xpath.internal.operations.Equals;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatrixManagerTest {

    Matrix matrix = new Matrix();

    @Test
    public void testFindMax() {

        MatrixManager matrixManager = new MatrixManager();
        Integer number = new Integer(1);

        for (int i = 0; i < 2; i++) {
            matrix.getMainMatrix().add(new ArrayList<Integer>());
            for (int j = 0; j < 2; j++) {
                matrix.getMainMatrix().get(i).add(number);
            }
        }

        matrix.setMatrixLinesCount(2);
        matrix.setMatrixColumnsCount(2);

        assertEquals(1, matrixManager.searchMaxElement(matrix));
    }

    @Test
    public void testFindMin() {

        MatrixManager matrixManager = new MatrixManager();
        Integer number = new Integer(1);

        for (int i = 0; i < 2; i++) {
            matrix.getMainMatrix().add(new ArrayList<Integer>());
            for (int j = 0; j < 2; j++) {
                matrix.getMainMatrix().get(i).add(number);
            }
        }

        matrix.setMatrixLinesCount(2);
        matrix.setMatrixColumnsCount(2);

        assertEquals(1, matrixManager.searchMinElement(matrix));
    }

    @Test
    public void testFindSum() {

        MatrixManager matrixManager = new MatrixManager();
        Integer number = new Integer(1);

        for (int i = 0; i < 2; i++) {
            matrix.getMainMatrix().add(new ArrayList<Integer>());
            for (int j = 0; j < 2; j++) {
                matrix.getMainMatrix().get(i).add(number);
            }
        }

        matrix.setMatrixLinesCount(2);
        matrix.setMatrixColumnsCount(2);

        assertEquals(4, matrixManager.searchSumElements(matrix));
    }
}
