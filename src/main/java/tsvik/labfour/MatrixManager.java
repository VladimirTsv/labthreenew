package tsvik.labfour;

import java.util.ArrayList;

public class MatrixManager {

    public Matrix createRandomMatrix(int linesCount, int columnsCount,
                                     int randomDownPoint, int randomUpPoint) {

        if (randomDownPoint > randomUpPoint) {
            System.out.println("Wrong random points. Random points will be exchanged");
            int swapTemporary;
            swapTemporary = randomDownPoint;
            randomDownPoint = randomUpPoint;
            randomUpPoint = swapTemporary;
        }
        Matrix matrix = new Matrix();
        matrix.setMatrixLinesCount(linesCount);
        matrix.setMatrixColumnsCount(columnsCount);
        Integer number = new Integer(1);

        for (int i = 0; i < linesCount; i++) {
            matrix.getMainMatrix().add(new ArrayList<Integer>());
            for (int j = 0; j < columnsCount; j++) {
                if (randomDownPoint < 0) {
                    number = (int) (randomDownPoint - 1 + (Math.random() * (randomUpPoint - randomDownPoint + 2)));
                } else
                    number = (int) (randomDownPoint + (Math.random() * (randomUpPoint - randomDownPoint + 1)));
                matrix.getMainMatrix().get(i).add(number);
            }
        }
        return matrix;
    }

    public void printMatrix(Matrix matrix, String matrixDelimiter) {

        int linesCount = matrix.getMatrixLinesCount();
        int columnsCount = matrix.getMatrixColumnsCount();

        for (int i = 0; i < linesCount; i++) {
            for (int j = 0; j < columnsCount; j++) {
                System.out.print(matrix.getMainMatrix().get(i).get(j) + matrixDelimiter);
            }

            System.out.print("\n");
        }
        System.out.print(matrix.getAuthor());
        System.out.print("\n\n");
    }

    public int searchMaxElement(Matrix matrix) {

        int linesCount = matrix.getMatrixLinesCount();
        int columnsCount = matrix.getMatrixColumnsCount();
        int maxElement = matrix.getMainMatrix().get(0).get(0);

        for (int i = 0; i < linesCount; i++) {
            for (int j = 0; j < columnsCount; j++) {
                if (matrix.getMainMatrix().get(i).get(j) > maxElement) {
                    maxElement = matrix.getMainMatrix().get(i).get(j);
                }
            }
        }
        return maxElement;
    }

    public int searchMinElement(Matrix matrix) {

        int linesCount = matrix.getMatrixLinesCount();
        int columnsCount = matrix.getMatrixColumnsCount();
        int minElement = matrix.getMainMatrix().get(0).get(0);

        for (int i = 0; i < linesCount; i++) {
            for (int j = 0; j < columnsCount; j++) {
                if (matrix.getMainMatrix().get(i).get(j) < minElement) {
                    minElement = matrix.getMainMatrix().get(i).get(j);
                }
            }
        }
        return minElement;
    }

    public int searchSumElements(Matrix matrix) {

        int linesCount = matrix.getMatrixLinesCount();
        int columnsCount = matrix.getMatrixColumnsCount();
        int sumElements = 0;

        for (int i = 0; i < linesCount; i++) {
            for (int j = 0; j < columnsCount; j++) {
                sumElements += matrix.getMainMatrix().get(i).get(j);
            }
        }
        return sumElements;
    }

    public void printResults(Matrix matrix) {

        System.out.println("Max element of matrix:  " + matrix.getMaxElement());
        System.out.println("Min element of matrix:  " + matrix.getMinElement());
        System.out.println("Sum of matrix elements:  " + matrix.getSumElements());

    }


}

