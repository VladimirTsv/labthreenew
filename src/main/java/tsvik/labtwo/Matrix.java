package company.tsvik.labtwo;

public class Matrix {

    public static final int matrixLinesCount = 10;
    public static final int matrixColumnsCount = 10;
    public static final int randomDownPoint = -10;
    public static final int randomUpPoint = 10;
    public static final String delimiter = "  ";

    public  int[][] mainMatrix = new int[matrixLinesCount][matrixColumnsCount];

    public  int maxElement;
    public  int minElement;
    public  int sumElements;

}