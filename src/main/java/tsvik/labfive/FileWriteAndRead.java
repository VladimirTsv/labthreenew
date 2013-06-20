package tsvik.labfive;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.FileReader;

import com.google.gson.*;

public class FileWriteAndRead {

    public void writeToFile(Matrix matrix, String fileAddress) throws IOException {


        /*FileWriter file= new FileWriter(fileAdress);
        file.write(matrix.getMatrixLinesCount());
        file.write(matrix.getMatrixColumnsCount());
        file.write(matrix.getMaxElement());
        file.write(matrix.getMinElement());
        file.write(matrix.getAuthor());

        //file.write(matrix.getMainMatrix().get());
        //file.flush();
        file.close();*/

        Gson gson = new Gson();
        try {
            FileWriter file = new FileWriter(fileAddress);
            gson.toJson(matrix, file);
            file.close();
        } catch (Exception e) {
            System.out.println("File hasn't created");
        }

    }

    public Matrix readFromFile( String fileAddress) throws IOException {
        Matrix matrix = new Matrix();
        FileReader file = new FileReader(fileAddress);
        Gson gson = new Gson();
        try {
          matrix=  gson.fromJson(file, Matrix.class);
        } catch (Exception e) {
            System.out.println("File not found. Error 404. Reinstall Windows");
        }
        //file.close();
        return matrix;
    }
}