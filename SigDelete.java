/**
 * Created on 5/20/2017.
 * Deletes screenshot sig files.
 */

import java.io.*;

public class SigDelete {

    public static void deleteSignatures(final File folder) {
        for (final File file : folder.listFiles()) {
            if (file.isDirectory()) {
                deleteSignatures(file);
            } else {
                System.out.println(file.getName());
                if(file.getName().toString().contains(".sig")){
                        file.delete();
                }
            }
        }
    }

    public static void main(String[] args) {
        final File screenshots = new File("F:/In the Groove 2/Screenshots");
        deleteSignatures(screenshots);
    }
}
