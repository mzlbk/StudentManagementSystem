public class Secretary extends Staff
{
    public Secretary(int staffID, String staffWorkInformation, int staffWorkHour)
    {
        super(staffID,staffWorkInformation,staffWorkHour);
    }

    public void addCourse(Lecturer lecturer, Courses courses){
        if(lecturer.getCourseList().size()>=10){
            System.out.println("This lecturer can not get more course");
        }
        else
        {
            courses.setLecturer(lecturer);
            lecturer.getCourseList().add(courses);
            //System.out.println(courses.getLecturer().getLecturerName() + " " + lecturer.getCourseList().get(0));
        }
    }

    public void changeLecturer(Lecturer lecturer, Courses courses)
    {
        courses.setLecturer(lecturer);
        lecturer.getCourseList().add(courses);
        //System.out.println(courses.getLecturer().getLecturerName() + " " + lecturer.getCourseList());
    }
}
