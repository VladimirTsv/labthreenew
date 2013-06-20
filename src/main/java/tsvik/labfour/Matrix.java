package tsvik.labfour;

import java.util.ArrayList;
import java.util.List;

public class Matrix {

    private int matrixLinesCount;
    private int matrixColumnsCount;
    List<List<Integer>> mainMatrix = new ArrayList<List<Integer>>();

    private int maxElement;
    private int minElement;
    private int sumElements;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    private String author = "Tsvik";

    //GETERS
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


}