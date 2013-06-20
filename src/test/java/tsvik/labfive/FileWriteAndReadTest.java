package tsvik.labfive;

import org.junit.jupiter.api.Test;
import tsvik.labfive.Matrix;
import tsvik.labfive.MatrixManager;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class FileWriteAndReadTest {

    Matrix matrix = new Matrix();

    @Test
    public void testFindMax() {

        MatrixManager matrixManager = new MatrixManager();
        Matrix matrix = new Matrix();
        Integer number = new Integer(1);
        Matrix matrix1 = new Matrix();

        FileWriteAndRead fileWriteAndRead = new FileWriteAndRead();

        for (int i = 0; i < 2; i++) {
            matrix.getMainMatrix().add(new ArrayList<Integer>());
            for (int j = 0; j < 2; j++) {
                matrix.getMainMatrix().get(i).add(number);
            }
        }

        matrix.setMatrixLinesCount(2);
        matrix.setMatrixColumnsCount(2);
        matrix.setAuthor("Tsvik");
        matrix.setMaxElement( matrixManager.searchMaxElement(matrix));
        matrix.setMinElement(matrixManager.searchMinElement(matrix));
        matrix.setSumElements(matrixManager.searchSumElements(matrix));

        try {
            fileWriteAndRead.writeToFile(matrix,"D:\\test.json");
            matrix1= fileWriteAndRead.readFromFile("D:\\test.json");
        } catch (IOException e) {
            e.printStackTrace();
        }


        assertEquals(matrix,matrix1 );
    }
}

