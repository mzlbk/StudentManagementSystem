public class HeadOfDepartment extends Lecturer
{
    public HeadOfDepartment(int staffID, String staffWorkInformation, int staffWorkHour ,String lecturerName, String lecturerSurname, LecturerRooms lecturerRooms)
    {
        super(staffID, staffWorkInformation, staffWorkHour, lecturerName, lecturerSurname, lecturerRooms);
    }

    //BURASI MEZUNİYET BELGESİ VERME ŞEYSİ


    private int courseNum1=0;
    private int courseNum2=0;
    private int courseNum3=0;
    public void giveCertificate(UndergraduateStudents student)
    {
        int courseNum = student.getTakenCourses().size();

        if(courseNum>=40 && student.getGpa()>=2.0)
        {
            System.out.println(student.getName() + " " + student.getSurname()+ " " + "graduated halal");
            courseNum1=0;
        }
        else{
            System.out.println(student.getName() + " " + student.getSurname()+ " " + "can not graduated halal");
            courseNum1=0;
        }
    }
    public void giveCertificate(LicenceStudents student)
    {
        int courseNum = student.getTakenCourses().size();

        if(courseNum>=7 && student.getGpa()>=2.5)
        {
            System.out.println(student.getName() + " " + student.getSurname()+ " " + "graduated halal");
            courseNum2=0;
        }
        else{
            System.out.println(student.getName() + " " + student.getSurname()+ " " + "can not graduated");
            courseNum2=0;
        }
    }
    public void giveCertificate(DoctoraStudents student)
    {
        int courseNum = student.getTakenCourses().size();

        if(courseNum>=8 && student.getGpa()>=3.0)
        {
            System.out.println(student.getName() + " " + student.getSurname()+ " " + "graduated halal");
            courseNum3=0;
        }
        else{
            System.out.println(student.getName() + " " + student.getSurname()+ " " + "can not graduated");
            courseNum3=0;
        }
    }
}
