package task3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        ArrayList<String> a1 = new ArrayList<>();
        a1.add("Java 1,0");
        a1.add("Sys");
        a1.add("C+");

        Person s1 = new Student("Bob", a1);
        s1.addCourse("Java 1.0");

        Person t1 = new Teacher("Signe", a1);
        t1.addCourse("Jave 1.0");
    }


}
