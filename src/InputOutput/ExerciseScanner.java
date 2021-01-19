package InputOutput;

import java.io.*;
import java.util.Scanner;

public class ExerciseScanner {
    public static void main(String[] args) throws IOException {
        //reads from a String
        Scanner scanner = new Scanner("Liliane heeft het zwaar vandaag");
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            System.out.println(s);
        }
        //read from file by creating a new File object with constructor parameter the pathname
        //throws exception in case the file is not found
        //new File() does NOT create an actual file => use createNewFile();
        Scanner scanner2 = new Scanner(new File("src/InputOutput/temp.txt"));//this is an existing file
        while (scanner2.hasNext()) {
            String s = scanner2.nextLine();
            System.out.println(s);
        }

        //what will happen if you create a scanner with a non-existing file?
        //it will throw a FileNotFoundException
        /*File filename = new File("");
        Scanner scanner3  = new Scanner(filename);
        while(scanner3.hasNext()){
            String s = scanner3.next();
            System.out.println(s);
        }*/

        //what will happen if you create a PrintWriter for an existing file?
        File file = new File("src/InputOutput/scannerFile.txt");
        file.createNewFile();//this works

        PrintWriter pw = new PrintWriter(file);//writes text but the write()method writes bytes
        pw.write("wat is de output? : " + 11);//does not write to the file why? cos didn't close the stream
        // output is FF is int c = 11 why? unless I make it into a String it will give a concatenation
        pw.println(" " + 12);//does not write to the file either why? cos didn't close teh stream output is 12
        //this works and the output is 12
        pw.close();//if you do not close the stream the data will not be written to the file

        PrintWriter pwWithWrapper = new PrintWriter(new FileWriter(file, true));
        pwWithWrapper.write("why is this so difficult?");//a string will be converted to text
        pwWithWrapper.write(13);//doesn't do anything a primitive can't be written to a textfile
        pwWithWrapper.print(14);//this works print() method works with primitives and text
        pwWithWrapper.write((byte) 15);//this doesn't why?

        pwWithWrapper.flush();
        pwWithWrapper.close();

        Scanner scanner4 = new Scanner(new File("src/InputOutput/scannerFile.txt"));
        while (scanner4.hasNext()) {
            String i = scanner4.next();
            System.out.print(i + " ");
        }
        scanner4.close();
    }


}
