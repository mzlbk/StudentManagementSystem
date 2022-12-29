public class DoctoraStudents extends Students
{
    private String degree;
    public DoctoraStudents(int id, String name, String surname, int year, String degree){
        super(id, name, surname, year);
        this.degree=degree;
    }
    @Override
    public void addCourses(Courses courses) {

    }
}
