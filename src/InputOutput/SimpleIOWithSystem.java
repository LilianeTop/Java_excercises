package InputOutput;

import java.io.IOException;


public class SimpleIOWithSystem {
    public static void main(String[] args) throws IOException {
        int i = System.in.read();//reads char from console and returns ASCII code of 1st character
        System.out.println(i);//prints the int as ASCII code number for instance a = 97
        System.out.println((char) i);//prints the char connected to the int the actual input


    }
}
