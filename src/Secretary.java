public class Secretary extends Staff
{
    public Secretary(int staffID, String staffWorkInformation, int staffWorkHour)
    {
        super(staffID,staffWorkInformation,staffWorkHour);
    }

    public void addCourse(Lecturer lecturer, Courses courses){
        if(lecturer.getCourseList().size()>=10)
        {
            System.out.println("Teacher Can Give Max 10 Courses");
        }
        else
        {
            courses.setLecturer(lecturer);
            lecturer.getCourseList().add(courses);
        }
    }
    public void lecturerChanger(Lecturer lecturer, Courses courses)
    {
        courses.setLecturer(lecturer);
        lecturer.getCourseList().add(courses);
    }
}
