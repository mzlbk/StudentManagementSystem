public class UndergraduateStudents extends Students
{
    private String degree;
    public UndergraduateStudents(int id, String name, String surname, int year, String degree)
    {
        super(id, name, surname, year);
        this.degree=degree;
    }

    @Override
    public void addCourse(Courses courses)
    {
        super.getTakenCourses().put(courses, null);
        courses.getStudentId().add(super.getID());
    }
}
