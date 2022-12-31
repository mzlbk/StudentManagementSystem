public class UndergraduateStudents extends Students
{
    private String degree;
    private int degreeType;
    public UndergraduateStudents(int id, String name, String surname, int year, String degree)
    {
        super(id, name, surname, year);
        this.degree = degree;

    }

    private void degreeCalculator(String degree)
    {
        if(degree == "Undergraduate" || degree == "UNDERGRADUATE" || degree == "undergraduate")
        {
            degree="1";
        }
        else if ()
        {

        }
    }

    @Override
    public void addCourse(Courses courses)
    {
        super.getTakenCourses().put(courses, null);
        super.getCreditCourses().put(courses, courses.getCourseCredit());
        courses.getStudentId().add(super.getID());
    }
}
