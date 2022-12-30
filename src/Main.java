public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        System.out.println("Kerem HEHE");
        Courses courses = new Courses("a",1,2);
        UndergraduateStudents undergraduateStudents = new UndergraduateStudents(1, "a", "a", 1,"a");
        undergraduateStudents.showStudentInfo();
        undergraduateStudents.GPACalculator(courses);
    }
}

