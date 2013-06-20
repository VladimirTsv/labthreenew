package company.tsvik.labone;

class Lab1 {

 public static final int matrixLinesCount = 5;
    public static final int matrixColumnsCount = 5;
    public static final int randomDownPoint = -10;
    public static final int randomUpPoint = 10;
    public static final String delimiter = "  ";

    public static int[][] mainMatrix = new int[matrixLinesCount][matrixColumnsCount];

    public static int maxElement;
    public static int minElement;
    public static int sumElements;


    public static int[][] CreateRandomMatrix(int[][] mainMatrix, int linesCount, int columnsCount,
                                             int randomDownPoint, int randomUpPoint) {

        if (randomDownPoint>randomUpPoint) {
        System.out.println("Вы ввели недопустимые границы рандома. Значение переменных будут заменены между собой.");
        int swapTemporary;
        swapTemporary=randomDownPoint;
        randomDownPoint=randomUpPoint;
        randomUpPoint=swapTemporary;
        }

        for (int i = 0; i < linesCount; i++) {
            for (int j = 0; j < columnsCount; j++) {
                mainMatrix[i][j] = (int) (randomDownPoint  + (Math.random() * (randomUpPoint - randomDownPoint + 1)));
            }
        }
        return mainMatrix;
    }

    public static void PrintMatrix(int[][] matrix, int linesCount, int columnsCount, String matrixDelimiter) {
        for (int i = 0; i < linesCount; i++) {
            for (int j = 0; j < columnsCount; j++) {
                System.out.print(matrix[i][j] + matrixDelimiter);
            }
            System.out.print("\n");
        }
    }

    public static int SearchMaxElement(int[][] matrix, int linesCount, int columnsCount) {

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

    public static int SearchMinElement(int[][] matrix, int linesCount, int columnsCount) {

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

    public static int SearchSumElements(int[][] matrix, int linesCount, int columnsCount) {

        int sumElements = 0;

        for (int i = 0; i < linesCount; i++) {
            for (int j = 0; j < columnsCount; j++) {
                sumElements += matrix[i][j];
            }
        }
        return sumElements;
    }

    public static void PrintResults(int maxElements, int minElements, int sumElements) {

        System.out.println("Максимальный элемент матрицы:  " + maxElements);
        System.out.println("Минимальный элемент матрицы:  " + minElements);
        System.out.println("Сумма элементов матрицы:  " + sumElements);

    }


    public static void main(String[] args) {

        CreateRandomMatrix(mainMatrix, matrixLinesCount, matrixColumnsCount,
                randomDownPoint, randomUpPoint);

        PrintMatrix(mainMatrix, matrixLinesCount, matrixColumnsCount,
                delimiter);

        maxElement = SearchMaxElement(mainMatrix, matrixLinesCount, matrixColumnsCount);

        minElement = SearchMinElement(mainMatrix, matrixLinesCount, matrixColumnsCount);

        sumElements = SearchSumElements(mainMatrix, matrixLinesCount, matrixColumnsCount);

        PrintResults(maxElement,minElement, sumElements);

    }
}
