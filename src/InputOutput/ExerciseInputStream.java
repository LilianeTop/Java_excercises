package InputOutput;

import java.io.File;
import java.io.FileInputStream;

public class ExerciseInputStream {
    public static void main(String[] args) {
        //this works it writes the txt of the file testinput to the console and the text can also be found within the file
        File file = new File("/Users/lilianetop/Desktop/excercises/src/InputOutput/testinput");

        //TODO: FileInputStream read single character
        try {
            FileInputStream fin = new FileInputStream(file);
            int i = fin.read();
            int j = fin.read();
            int k = fin.read();
            System.out.println("first character " + (char) i);//reads first char
            System.out.println("second " + (char) j);//reads second char
            System.out.println("third " + (char) k);//reads third

            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        //TODO: FileInputStream read all characters
        try {
            FileInputStream fin = new FileInputStream(file);
            int i = 0;
            while ((i = fin.read()) != -1){
                System.out.print((char) i);
            }
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
