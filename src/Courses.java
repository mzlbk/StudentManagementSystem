public class Courses
{
    private String courseName;
    private int courseCode;
    private int courseCredit;

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


}
