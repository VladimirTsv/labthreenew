package company.tsvik.labtwo;

public class MatrixManager {

    private Matrix CreateRandomMatrix( int linesCount, int columnsCount,
                                       int randomDownPoint, int randomUpPoint) {
Matrix matrix =new Matrix();
        if (randomDownPoint > randomUpPoint) {
            System.out.println("Вы ввели недопустимые границы рандома. Значение переменных будут заменены между собой.");
            int swapTemporary;
            swapTemporary = randomDownPoint;
            randomDownPoint = randomUpPoint;
            randomUpPoint = swapTemporary;
        }

        for (int i = 0; i < linesCount; i++) {
            for (int j = 0; j < columnsCount; j++) {
                if (randomDownPoint < 0) {
                   matrix.mainMatrix[i][j] = (int) (randomDownPoint - 1 + (Math.random() * (randomUpPoint - randomDownPoint + 2)));
                }
                else
                    matrix.mainMatrix[i][j] = (int) (randomDownPoint + (Math.random() * (randomUpPoint - randomDownPoint + 1)));
            }
        }
        return matrix;
    }

    public void PrintMatrix(int[][] matrix, int linesCount, int columnsCount, String matrixDelimiter) {
        for (int i = 0; i < linesCount; i++) {
            for (int j = 0; j < columnsCount; j++) {
                System.out.print(matrix[i][j] + matrixDelimiter);
            }
            System.out.print("\n");
        }
    }

    private int SearchMaxElement(int[][] matrix, int linesCount, int columnsCount) {

        int maxElement = matrix[0][0];

        for (int i = 0; i < linesCount; i++) {
            for (int j = 0; j < columnsCount; j++) {
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                }
            }
        }
        return maxElement;
    }

    private int SearchMinElement(int[][] matrix, int linesCount, int columnsCount) {

        int minElement = matrix[0][0];

        for (int i = 0; i < linesCount; i++) {
            for (int j = 0; j < columnsCount; j++) {
                if (matrix[i][j] < minElement) {
                    minElement = matrix[i][j];
                }
            }
        }
        return minElement;
    }

    private int SearchSumElements(int[][] matrix, int linesCount, int columnsCount) {

        int sumElements = 0;

        for (int i = 0; i < linesCount; i++) {
            for (int j = 0; j < columnsCount; j++) {
                sumElements += matrix[i][j];
            }
        }
        return sumElements;
    }

    public void PrintResults(int maxElements, int minElements, int sumElements) {

        System.out.println("Максимальный элемент матрицы:  " + maxElements);
        System.out.println("Минимальный элемент матрицы:  " + minElements);
        System.out.println("Сумма элементов матрицы:  " + sumElements);

    }


    public static void main(String[] args) {

        MatrixManager objectMatrix = new MatrixManager();
        Matrix matrix =new Matrix();

        objectMatrix.CreateRandomMatrix( Matrix.matrixLinesCount, Matrix.matrixColumnsCount,
                Matrix.randomDownPoint, Matrix.randomUpPoint);

        objectMatrix.PrintMatrix(matrix.mainMatrix, matrix.matrixLinesCount, matrix.matrixColumnsCount,
                Matrix.delimiter);

        matrix.maxElement = objectMatrix.SearchMaxElement(matrix.mainMatrix, matrix.matrixLinesCount, matrix.matrixColumnsCount);

        matrix.minElement = objectMatrix.SearchMinElement(matrix.mainMatrix, matrix.matrixLinesCount, matrix.matrixColumnsCount);

        matrix.sumElements = objectMatrix.SearchSumElements(matrix.mainMatrix, matrix.matrixLinesCount, matrix.matrixColumnsCount);

        objectMatrix.PrintResults(matrix.maxElement, matrix.minElement, matrix.sumElements);

    }
}

