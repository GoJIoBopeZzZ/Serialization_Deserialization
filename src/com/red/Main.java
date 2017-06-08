package com.red;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String path = "students.serialize";
        List<Student> students = new ArrayList<>();
        students.add(new Student("first", "surFirst", 26));
        students.add(new Student("second", "surSecond", 36));
        students.add(new Student("third", "surThird", 46));

        try {
            studentsSerialization(path, students);
            System.out.println("Serialization is end.");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        List<Student> test = new ArrayList<>();

        try {
            studentsDeserialization(path, test);
            System.out.println("Deserialization is end.");
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void studentsSerialization(String path, List<Student> students){

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(students);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void studentsDeserialization(String path, List<Student> students){

        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            students = (List<Student>) objectInputStream.readObject();
            for(int i = 0; i < students.size(); i++)
                System.out.println("Name - " + students.get(i).getName() + "\tSurname - " +
                students.get(i).getSurName() + "\tAge - " + students.get(i).getAge());
            objectInputStream.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}