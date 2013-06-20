package tsvik.labthree;

public class Matrix {

    private int matrixLinesCount;
    private int matrixColumnsCount;
    private int[][] mainMatrix;

    private int maxElement;
    private int minElement;
    private int sumElements;

    //GETERS
    public int getMatrixLinesCount() {
        return matrixLinesCount;
    }

    public int getMatrixColumnsCount() {
        return matrixColumnsCount;
    }

    public int[][] getMainMatrix() {
        return mainMatrix;
    }

    public int getMaxElement() {
        return maxElement;
    }

    public int getMinElement() {
        return minElement;
    }

    public int getSumElements() {
        return sumElements;
    }

    //SETTERS
    public void setMatrixLinesCount(int linesCount) {
        this.matrixLinesCount = linesCount;
    }

    public void setMatrixColumnsCount(int columnsCount) {
        this.matrixColumnsCount = columnsCount;
    }

    public void setMainMatrix(int[][] matrixBody) {
        this.mainMatrix = matrixBody;
    }

    public void setMaxElement(int element) {
        this.maxElement = element;
    }

    public void setMinElement(int element) {
        this.minElement = element;
    }

    public void setSumElements(int element) {
        this.sumElements = element;
    }


}