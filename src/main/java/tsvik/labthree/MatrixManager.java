package tsvik.labthree;

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
        matrix.setMainMatrix(new int[linesCount][columnsCount]);

        for (int i = 0; i < linesCount; i++) {
            for (int j = 0; j < columnsCount; j++) {
                if (randomDownPoint < 0) {
                    matrix.getMainMatrix()[i][j] = (int) (randomDownPoint - 1 + (Math.random() * (randomUpPoint - randomDownPoint + 2)));
                } else
                    matrix.getMainMatrix()[i][j] = (int) (randomDownPoint + (Math.random() * (randomUpPoint - randomDownPoint + 1)));
            }
        }
        return matrix;
    }

    public void printMatrix(Matrix matrix, String matrixDelimiter) {

        int linesCount = matrix.getMatrixLinesCount();
        int columnsCount = matrix.getMatrixColumnsCount();

        for (int i = 0; i < linesCount; i++) {
            for (int j = 0; j < columnsCount; j++) {
                System.out.print(matrix.getMainMatrix()[i][j] + matrixDelimiter);
            }
            System.out.print("\n");
        }
    }

    public int searchMaxElement(Matrix matrix) {

        int linesCount = matrix.getMatrixLinesCount();
        int columnsCount = matrix.getMatrixColumnsCount();
        int maxElement = matrix.getMainMatrix()[0][0];

        for (int i = 0; i < linesCount; i++) {
            for (int j = 0; j < columnsCount; j++) {
                if (matrix.getMainMatrix()[i][j] > maxElement) {
                    maxElement = matrix.getMainMatrix()[i][j];
                }
            }
        }
        return maxElement;
    }

    public int searchMinElement(Matrix matrix) {

        int linesCount = matrix.getMatrixLinesCount();
        int columnsCount = matrix.getMatrixColumnsCount();
        int minElement = matrix.getMainMatrix()[0][0];

        for (int i = 0; i < linesCount; i++) {
            for (int j = 0; j < columnsCount; j++) {
                if (matrix.getMainMatrix()[i][j] < minElement) {
                    minElement = matrix.getMainMatrix()[i][j];
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
                sumElements += matrix.getMainMatrix()[i][j];
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

