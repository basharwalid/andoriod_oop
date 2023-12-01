package Person;

import java.util.ArrayList;
public class Student extends Person {
    int numberOfCourses;
    ArrayList<String> courses ;
    ArrayList<Integer> grades;
    Student(){
        super();
        numberOfCourses = 0;
        courses = new ArrayList<String>();
        grades = new  ArrayList<Integer>();
    }

    Student(String name , String address){
        super(name , address);
    }


    void addCourseGrade(String course , int grade){
        for(int i =0; i<courses.size(); i++){
            System.out.println("Please Enter The Course name: ");
            courses.add(course);
            System.out.println("Please Enter The Course Grade: ");
            grades.add(grade);
        }
    }

    void printGrades(){
        for (Integer grade : grades) {
            System.out.println(grade);
        }
    }

    double getAverageGrade(){
        double sum =0;
        for (Integer grade : grades) {
            sum += grade;
        }
        return sum/grades.size();
    }
    public String toString(){
        return  "Student "+getName()+ " Address : "+getAddress();
    }

}
