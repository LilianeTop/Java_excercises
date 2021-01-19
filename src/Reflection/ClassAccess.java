package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassAccess {
    //declare private fields
    private String name = null;
    private String surName = null;
    private int age = 0;

    /*public ClassAccess() {
    }*/

    public ClassAccess(String name, String surName, int age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    public static void main(String[] args) {
        /**
         * When a Java application starts, not all classes are loaded into the JVM.
         * If your code doesn't refer to the ClassAccess class,
         * then ClassLoader, which is responsible for loading classes into the JVM,
         * will never load the class.
         * That means you have to force ClassLoader to load it
         * and get a class description in the form of a Class variable.
         * This is why we have the forName(String) method,
         * where String is the name of the class whose description we need. */

        ClassAccess access = null;
        /*try {
            //approach will only work with the default constructor (without parameters).
            Class clazz = Class.forName(ClassAccess.class.getName());
            //access = (ClassAccess) clazz.newInstance();//deprecated replace by
            access = (ClassAccess) clazz.getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println(access);// Output:Reflection.ClassAccess@f6f4d33
*/
        /**If the constructor has parameters:
         * The getConstructors() method should be called on the class definition to obtain class constructors,
         * and then getParameterTypes() should be called to get a constructor's parameters:
         */

        Class[] paramTypes = new Class[0];
        try {
            Class clazz = Class.forName(ClassAccess.class.getName());
            Constructor[] constructors = clazz.getConstructors();
            for (Constructor constructor : constructors) {
                paramTypes = constructor.getParameterTypes();
                for (Class paramType : paramTypes) {
                    System.out.print(paramType.getName() + " ");//displays the 3 parameters of the constructor
                }
                System.out.println();
            }

            try {
                clazz = Class.forName(ClassAccess.class.getName());
                //java.lang.String java.lang.String int
                //Class[] params = {String.class, String.class, int.class};
                access = (ClassAccess) clazz.getConstructor(paramTypes).newInstance("default1", "default2", 4);
            } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(access);//output: Reflection.ClassAccess@f6f4d33

    }
}

