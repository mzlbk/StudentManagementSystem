public class UndergraduateStudents extends Students
{
    private String degree;
    public UndergraduateStudents(int id, String name, String surname, int year, String degree)
    {
        super(id, name, surname, year);
        this.degree=degree;
    }

    public void addCourses(Courses courses)
    {

    }
}
