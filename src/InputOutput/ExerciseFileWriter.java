package InputOutput;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class ExerciseFileWriter {
    public static void main(String[] args) {
        //TODO: write data to file where data is String => FileWriter is preferred to write character based over FileOutputStream
        try {
            File file = new File("/Users/lilianetop/Desktop/excercises/src/InputOutput/testWriterFile");
            FileWriter writer = new FileWriter(file);
            String s = "Liliane is playing with filewriter \n";
            String s2 = "Liliane is curious if filewriter works!\n";
            writer.write(s);
            writer.write(s2);
            System.out.println("writer " + writer.toString());//output is memory location of file writer
            writer.close();
        } catch (Exception e) {
            e.getMessage();
        }

        //TODO: add text to existing file (this works!!)
        try {
            File file = new File("/Users/lilianetop/Desktop/excercises/src/InputOutput/testWriterFile");
            FileWriter writer = new FileWriter(file, true);
           // FileWriter (file, boolean append);
            String s = "Liliane wants to add text with filewriter \n";
            String s2 = "Without overwriting existing text!\n";
            writer.write(s);
            writer.write(s2);
            System.out.println("Adding works");
            writer.close();
        } catch (Exception e) {
            e.getMessage();
        }

    }
}
