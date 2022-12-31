import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Lecturer extends Staff
{
    private String lecturerName;
    private String lecturerSurname;
    private LecturerRooms lecturerRooms;
    private ArrayList<Courses> courseList = new ArrayList<Courses>();
    public Lecturer(int staffID, String staffWorkInformation, int staffWorkHour ,String lecturerName, String lecturerSurname, LecturerRooms lecturerRooms)
    {
        super(staffID, staffWorkInformation, staffWorkHour);
        this.lecturerName = lecturerName;
        this.lecturerSurname = lecturerSurname;
        this.lecturerRooms = lecturerRooms;
    }

    public void assignGrade(Courses course, Students student, int note)
    {
        int count = 0;
        Set set = student.getTakenCourses().entrySet();
        Iterator itr11 = set.iterator();

        while (itr11.hasNext())
        {
            Map.Entry mapEntry = (Map.Entry) itr11.next();
            if(mapEntry.getKey().equals(course))
            {
                mapEntry.setValue(note);
                count++;
            }
        }
        if(count==0)
        {
            System.out.println("Note Not Entered Yet!");
        }
        else
        {
            System.out.println(note);
        }
    }
    public String getLecturerName()
    {
        return lecturerName;
    }
    public void setLecturerName(String lecturerName)
    {
        this.lecturerName = lecturerName;
    }
    public String getLecturerSurname()
    {
        return lecturerSurname;
    }
    public void setLecturerSurname(String lecturerSurname)
    {
        this.lecturerSurname = lecturerSurname;
    }
    public ArrayList<Courses> getCourseList()
    {
        return courseList;
    }
    public void setCourseList(ArrayList<Courses> courseList)
    {
        this.courseList = courseList;
    }
}
