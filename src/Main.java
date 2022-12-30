public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        System.out.println("Kerem HEHE");

        Courses courses = new Courses("a",1,2);
        UndergraduateStudents undergraduateStudents = new UndergraduateStudents(1, "a", "a", 1,"a");
        UndergraduateStudents undergraduateStudents1 = new UndergraduateStudents(1, "b", "b", 2, "b");

        undergraduateStudents.showStudentInfo();
        undergraduateStudents1.showStudentInfo();
        undergraduateStudents.GPACalculator(courses);

        Lecturer lecturer = new Lecturer(1,"s",1,"s","s",1);
        lecturer.assignGrade(courses,undergraduateStudents,100);
        Staff sekreter = new Secretary(1,"sekreter",8);
        //sekreter.addCourse(undergraduateStudents);
        //undergraduateStudents.addCourses;
        //System.out.println(sekreter.getStaffID());
    }
}

