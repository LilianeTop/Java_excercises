package InputOutput;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class ExcerciseOutputStream {


    public static void main(String[] args) {
        //TODO: write data to file where data is byte
        //it works but gets overwritten by the next input stream of text.
        try {
            //File file = new File("/Users/lilianetop/Desktop/excercises/src/InputOutput/testinput");
            File file = new File("../testinput");
            FileOutputStream foutput = new FileOutputStream(file);
            foutput.write(108);//this is the letter l
            foutput.write(65); //this is the letter A
            System.out.println("success with outputStream");
            foutput.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        //TODO: write data to file with FileOutputStream
        //this works
        try {
            File file = new File("/Users/lilianetop/Desktop/excercises/src/InputOutput/testinput.txt");
            FileOutputStream fout = new FileOutputStream(file);
            String s = "Liliane is busy trying to get it to work!\n";
            byte b[] = s.getBytes();//converting String into byte array
            String s2 = "Liliane is lekker bezig!\n";
            byte b2[] = s2.getBytes();//converting String into byte array
            fout.write(b);
            fout.write(b2);
            System.out.println("fout " + fout.toString());//output gives memeory location of file
            fout.close();
        } catch (Exception e) {
            e.getMessage();
        }

        //TODO: add text to a file without overwriting it by adding true to new FileOutputStream(file, true)
        try {
            File file = new File("/Users/lilianetop/Desktop/excercises/src/InputOutput/testinput.txt");
            FileOutputStream fout = new FileOutputStream(file, true);
            String s = "Liliane wants to add text to this file!\n";
            byte b[] = s.getBytes();//converting String into byte array
            String s2 = "Without overwriting the existing text!\n";
            byte b2[] = s2.getBytes();//converting String into byte array
            fout.write(b);
            fout.write(b2);
            System.out.println("OutputStream can also add text to a file");
           fout.close();
        } catch (Exception e) {
            System.out.println("it's not working");;
        }

    }


}
