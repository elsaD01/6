package task3;

import java.util.ArrayList;

public class Teacher extends Person{

    ArrayList<String> canTeach;

    ArrayList<String> currentCourses = new ArrayList<>();

    public Teacher(String name, ArrayList<String> canTeach){

        super(name);
        this.canTeach = canTeach;
    }

    @Override
    public boolean addCourse(String course) {
        if(canTeach.contains(course)){
            currentCourses.add(course);
            return true;
        }else{
            return false;
        }
    }

}
