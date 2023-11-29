import java.util.ArrayList;
public class Student extends Person {

    Student(String name , String address){

    }
    int numberOfCourses = 0;
    ArrayList<String> courses = new ArrayList<>();
    ArrayList<Integer> grades = new ArrayList<>();

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
}
