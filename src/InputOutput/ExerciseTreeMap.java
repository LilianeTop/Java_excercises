package InputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;
/*
lion.avi.part.lili.part5
lion.avi.part41
lion.avi.lili.part3
lion.avi.part1
end*/

public class ExerciseTreeMap {
    public static void main(String[] args) throws IOException {
        //Create a reader to read filenames from keyboard
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //create a map for all filenames <String = .<partN>, String = fullFilename>
        Map<Integer, String> folder = new TreeMap<>();// place all entries in order

        //read filenames until "end" is entered
        String s;
        while (!(s = reader.readLine()).equals("end")) {
            //reads the filename
            //split the filenames .part<n> will be the key to be able to sort the files in the right order
            String partString = s.substring(s.lastIndexOf(".part") + 5);
            System.out.println(partString);
            Integer partNumber = Integer.parseInt(partString);
            System.out.println(partNumber);
            folder.put(partNumber, s);
        }
        reader.close();

        for(Map.Entry<Integer, String> file : folder.entrySet()){
            System.out.println(file.getKey() + " " + file.getValue());
        }
    }
}
