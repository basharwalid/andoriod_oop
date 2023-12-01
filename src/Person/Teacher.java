package Person;

import java.util.ArrayList;

public class Teacher extends Person{
    Teacher(String name , String address){
    }
    int numberOfCourses =0;

    ArrayList<String> courses = new ArrayList<>();


    public String toString(){
        return getName()+getAddress();
    }

    boolean addCourse(String course){
        boolean isFound = courses.contains(course);
        if(isFound){
            return true;
        }else return false;
    }

    boolean removeCourse(String course){
        boolean isFound = courses.contains(course);
        if(isFound){
            return true;
        }else return false;
    }

}
