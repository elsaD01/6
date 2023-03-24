package task3;

import java.util.ArrayList;

public class Student extends Person{

    ArrayList<String> passedCourses;

    ArrayList<String> currentCourses = new ArrayList<>();

    public Student(String name, ArrayList<String> passedCourses){

        super(name);
        this.passedCourses = passedCourses;
    }

    @Override
    public boolean addCourse(String course) {
        if(passedCourses.contains(course)) {
            return false;
        }
        currentCourses.add(course);
        return true;
    }


    /*for each*/
        /*for(String s:passedCourses){
            if(s.equals(course)){
                return false;
            }
        }
        currentCourses.add(course);
        return true;*/



}
