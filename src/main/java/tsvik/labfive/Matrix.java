package tsvik.labfive;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Matrix {

    private int matrixLinesCount;
    private int matrixColumnsCount;
    List<List<Integer>> mainMatrix = new ArrayList<List<Integer>>();

    private int maxElement;
    private int minElement;
    private int sumElements;

    private String author = "Tsvik";

    //GETERS
    public String getAuthor() {
        return author;
    }

    public int getMatrixLinesCount() {
        return matrixLinesCount;
    }

    public int getMatrixColumnsCount() {
        return matrixColumnsCount;
    }

    public List<List<Integer>> getMainMatrix() {
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
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setMatrixLinesCount(int linesCount) {
        this.matrixLinesCount = linesCount;
    }

    public void setMatrixColumnsCount(int columnsCount) {
        this.matrixColumnsCount = columnsCount;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matrix matrix = (Matrix) o;
        return matrixLinesCount == matrix.matrixLinesCount &&
                matrixColumnsCount == matrix.matrixColumnsCount &&
                maxElement == matrix.maxElement &&
                minElement == matrix.minElement &&
                sumElements == matrix.sumElements &&
                Objects.equals(mainMatrix, matrix.mainMatrix) &&
                Objects.equals(author, matrix.author);
    }


}