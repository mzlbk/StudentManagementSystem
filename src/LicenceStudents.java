public class LicenceStudents extends Students
{
    private String gradeAvarage;
    public LicenceStudents(int id, String name, String surname, int year, String gradeAvarage){
        super(id, name, surname, year);
        this.gradeAvarage=gradeAvarage;
    }

    @Override
    public void addCourse(Courses courses)
    {
        super.getTakenCourses().put(courses, null);
        courses.getStudentId().add(super.getID());
    }
}