import java.util.ArrayList;
import java.util.HashMap;

public class Courses
{
    private String courseName;
    private int courseCode;
    private int courseCredit;

    private Lecturer lecturer;

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public int getCourseCode() {
        return courseCode;
    }
    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }
    public int getCourseCredit() {
        return courseCredit;
    }
    public void setCourseCredit(int courseCredit) {
        this.courseCredit = courseCredit;
    }

    public  Courses()
    {
        this.courseName = "NULL";
        this.courseCode = 0;
        this.courseCredit = 0;
    }
    public Courses(String courseName, int courseCode, int courseCredit)
    {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.courseCredit = courseCredit;
    }

    public ArrayList<Integer> getStudentId() {
        return studentId;
    }

    public void setStudentId(ArrayList<Integer> studentId) {
        this.studentId = studentId;
    }

    public HashMap<Integer, String> getCourseGrades() {
        return courseGrades;
    }

    public void setCourseGrades(HashMap<Integer, String> courseGrades) {
        this.courseGrades = courseGrades;
    }

    //********************
    private ArrayList<Integer> studentId = new ArrayList();

    private HashMap<Integer,String> courseGrades = new HashMap<>();
    //Kullanışına bak, main class'ında var

    //public void fillCourseGrades(Student student){ //it uses lecturer extra 1
    //        courseGrades.put(student.getId(),student.getGrade(this)); //using student's extra method
    //    }
    //********************
}
