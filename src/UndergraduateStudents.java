public class UndergraduateStudents extends Students
{
    private String degree;
    public UndergraduateStudents(int id, String name, String surname, int year, String degree)
    {
        super(id, name, surname, year);
        this.degree = degree;

    }
    public String getDegree()
    {
        return degree;
    }
    public void setDegree(String degree)
    {
        this.degree = degree;
    }
    @Override
    public void addCourse(Courses courses)
    {
        super.getTakenCourses().put(courses, null);
        super.getCreditCourses().put(courses, courses.getCourseCredit());
        courses.getStudentId().add(super.getID());
    }
}
