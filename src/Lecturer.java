import java.util.ArrayList;

public class Lecturer extends Staff
{
    private String lecturerName;
    private String lecturerSurname;

    //private LecturerRooms lecturerRooms; SONRA BAKMAYI UNUTMA

    private ArrayList<Courses> courseList = new ArrayList<Courses>();

    public Lecturer(int staffID, String staffWorkInformation, int staffWorkHour ,String lecturerName, String lecturerSurname, LecturerRooms lecturerRooms)
    {
        super(staffID, staffWorkInformation, staffWorkHour);
        this.lecturerName = lecturerName;
        this.lecturerSurname = lecturerSurname;
        //this.lecturerRooms= lecturerRooms.assignLecturer(this); SONRA BAKMAYI UNUTMA
    }

    public void assignGrade(Courses course, Students student, String grade)
    {
        System.out.println("POLİMORFİZM KANKA POLİMORFİZM");
    }
}
