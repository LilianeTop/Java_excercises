package Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionExcercise {
    //declare private fields
    private String name = "Liliane";
    private String surName = "Top";
    private int age = 15;

    //no getter for age
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
        //create an instance of the class
        ReflectionExcercise reflect = new ReflectionExcercise();
        //use the getter for age field
        //int age = reflect.getAge(); when no getter
        int age = 0;
        // No getter for name
        String name = null;
        String surName = null;
        System.out.println("age is: " + age + " name is: " + name + " surname is: " + surName); // age is: 0 name is: null surname is: null

        try {
            //import reflect.field
            //assign the field object to className.getClass().getDeclaredField("fieldName);
            Field field = reflect.getClass().getDeclaredField("name");
            Field ageField = reflect.getClass().getDeclaredField("age");
            //set Accessible to true
            field.setAccessible(true);
            ageField.setAccessible(true);
            //assign the field to a field.get(className) and cast it to in this case to String
            name = (String) field.get(reflect);
            age = (int) ageField.get(reflect);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println("age is: " + age + " name is: " + name + " surname is: " + surName); // age is: 15 name is: Liliane surname is: null
        //if you use getter
        System.out.println("surname is: " + reflect.getSurname());//surname is: Top


        try {
            Field surNameField = reflect.getClass().getDeclaredField("surName");
            surNameField.setAccessible(true);
            //fieldNameField.set(className, "new value")
            surNameField.set(reflect, "Vaillant");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        System.out.println("age is: " + age + " name is: " + name + " surname is: " + reflect.surName); // age is: 15 name is: Liliane surname is: Vaillant

    }
        /**
         * getFields() returns all accessible fields
         * getDeclaredFields() returns also private and protected fields
         * both do not return the fields of a parent class!
         * */

    }


