package Properties;

import java.io.*;
import java.security.Key;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;

public class ExerciseProperties {

    public static void main(String[] args) {
        FileOutputStream fos = null;
        File fileConfig = null;
        FileInputStream fis = null;

        try {
            //intialize outputStream => it creates a file if it doesn't excists
            fileConfig = new File("/Users/lilianetop/Desktop/config.properties");
            fos = new FileOutputStream(fileConfig);

            //create an instance of the Properties class
            Properties propConfig = new Properties();
            //create key-value pairs as string properties
            propConfig.setProperty("username", "Liliane");
            propConfig.setProperty("age", "55");
            propConfig.setProperty("email", "hallo@lilianetop.nl");

            //save the properties to the file
            //store(outputstream, "comment")
            propConfig.store(fos, "Program setting");
            fos.close();
            System.out.println("properties saved");//it works


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            fis = new FileInputStream(fileConfig);
            Properties propConfig = new Properties();
            propConfig.load(fis);

            System.out.println(propConfig.getProperty("username"));
            System.out.println(propConfig.getProperty("age"));
            System.out.println(propConfig.getProperty("email"));

            //gives a list of all key-value pairs
            propConfig.list(System.out);
            System.out.println();

            //gives the location of the collection
            System.out.println(propConfig.keys());

            System.out.println("------------");
            //returns all values
            Enumeration<Object> values = propConfig.elements();
            while (values.hasMoreElements()){
                System.out.println(values.nextElement());
            }

            System.out.println("----------");
            //returns all keys
            Enumeration<Object>  keys = propConfig.keys();
            while(keys.hasMoreElements()){
                System.out.println(keys.nextElement());
            }
            System.out.println("-----------");

            //return all keys and if default was added to proppConfigFile it would show too
            Enumeration<?> propertyNames = propConfig.propertyNames();
            while(propertyNames.hasMoreElements()) {
                System.out.println(propertyNames.nextElement());
            }

            System.out.println("-------------");

            Set<String> listProperties = propConfig.stringPropertyNames();

            for (String property : listProperties
                 ) {
                System.out.println(property);
            }






            fis.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
