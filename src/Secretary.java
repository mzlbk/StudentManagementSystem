public class Secretary extends Staff
{
    public Secretary(int staffID, String staffWorkInformation, int staffWorkHour)
    {
        super(staffID,staffWorkInformation,staffWorkHour);
    }
    private void addCourse(Lecturer lecturer){
        if(lecturer.getCourseList().size()>=10){
            System.out.println("This lecturer can not get more course");
        }
    }
}
