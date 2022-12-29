public class HeadOfDepartment extends Lecturer
{
    public HeadOfDepartment(int staffID, String staffWorkInformation, int staffWorkHour ,String lecturerName, String lecturerSurname, LecturerRooms lecturerRooms)
    {
        super(staffID, staffWorkInformation, staffWorkHour, lecturerName, lecturerSurname, lecturerRooms);
    }


    //BURASI MEZUNİYET BELGESİ VERME ŞEYSİ

    /*
    private int courseNum=0;
    public void giveCertificate(UndergraduateStudent student){
        student.getTakenCourse().forEach((lesson,grade) -> {
            if(lesson != null && grade != null && student.controlSuccessfully(lesson)==true){
                courseNum++;
            }
        });


        if(courseNum>=40 && student.CalculateGPA()>=2.0){
            System.out.println("Congratulations you take a certificate");
            System.out.println(student.toString());
            courseNum=0;
        }
        else{
            System.out.println("This student does not meet the conditions to get certificate");
            courseNum=0;
        }
    }

    public void giveCertificate(GraduateStudent student){ //Method overloading
        if(student.getDegree()=="MASTER"){
            student.getTakenCourse().forEach((lesson,grade) -> {
                if(lesson != null && grade != null && student.controlSuccessfully(lesson)==true){
                    courseNum++;
                }
            });

            if(courseNum>=7 && student.CalculateGPA()>=2.5){
                System.out.println("Congratulations you take a certificate");
                System.out.println(student.toString());
                courseNum=0;
            }
            else{
                System.out.println("This student does not meet the conditions to get certificate");
                courseNum=0;
            }
        }
        else if(student.getDegree()=="DOCTORAL"){
            student.getTakenCourse().forEach((lesson,grade) -> {
                if(lesson != null && grade != null && student.controlSuccessfully(lesson)==true){
                    courseNum++;
                }
            });

            if(courseNum>=8 && student.CalculateGPA()>=3.0){
                System.out.println("Congratulations you take a certificate");
                System.out.println(student.toString());
                courseNum=0;
            }
            else{
                System.out.println("This student does not meet the conditions to get certificate");
                courseNum=0;
            }
        }
    }
    */

}
