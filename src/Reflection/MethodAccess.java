package Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodAccess {
    //declare private fields
    private String name = "Liliane";
    private String surName = "Top";
    private int age = 15;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    //no getter for field name
    public void setName(String name) {
        this.name = name;
    }

    //no setter for surname only getter
    public String getSurname() {
        return surName;
    }

    private void printData() {
        System.out.println(age + name + surName);
    }


    public static void main(String[] args) {
        MethodAccess access = new MethodAccess();
        ReflectionExcercise reflectMethod = new ReflectionExcercise();
        int age = access.getAge();
        String name = null;
        String surName = null;

        //you have access to the printDate() method via an instance of the class
        access.printData();//output 15LilianeTop
        //reflectMethod.printData(); //no access to this method
        printData(access);// output 15LilianeTop

        try {
            Field field = reflectMethod.getClass().getDeclaredField("name");
            //Field field = access.getClass().getDeclaredField("name");
            field.setAccessible(true);
            field.set(reflectMethod,  "Maria");
            name = (String) field.get(reflectMethod);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        printData(access);//output 15MariaTop
        System.out.print("From reflectMethodClass: ");
        printData(reflectMethod);

        System.out.println(MethodAccess.class.getName());//output Package + className : Reflection.MethodAccess


    }

    public static void printData(Object access) {
        try {
            Method method = access.getClass().getDeclaredMethod("printData");
            method.setAccessible(true);
            method.invoke(access);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

}
