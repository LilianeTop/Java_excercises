package InputOutput;

import java.io.*;

public class ExercisePrintWriter {
    public static void main(String[] args) throws IOException {
        File file = new File("src/InputOutput/temp.txt");
        System.out.println(file.getAbsolutePath());///Users/lilianetop/Desktop/excercises/src/InputOutput/temp.txt
        PrintWriter output = new PrintWriter(file);

        output.printf("amount is %f, %e\n", 32.32, 32.32);
        output.printf("amount is %5.4f %5.4e\n", 32.32, 32.32);
        output.printf("%6b\n", (1 > 2));//boolean
        output.printf("%6s\n", "Java");
        output.close();

        // try-with resources
        //FIXME: try(create a source) { block with code do something() }
        try (PrintWriter output2 = new PrintWriter(new FileWriter(file, true));)
        {
            output2.printf("amount is %f, %e\n", 32.32, 32.32);
            output2.printf("amount is %5.4f %5.4e\n", 32.32, 32.32);
            output2.printf("%6b\n", (1 > 2));//boolean
            output2.printf("%6s\n", "Java");
        }
        //PrintWriter overwrites the existing text there is no append() unless you
        //wrap the PrintWriter into a Filewriter(fileName, true);
    }

}
