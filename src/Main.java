public class Main
{
    public static void main(String[] args) {
        System.out.println("Kerem HEHE");
        LecturerRooms lecturerRoom1 = new LecturerRooms(42);
        LecturerRooms lecturerRoom2 = new LecturerRooms(54);


        UndergraduateStudents undergraduateStudents1 = new UndergraduateStudents(1, "hayrullah", "gamşullah", 2020, "undergraduate");
        UndergraduateStudents undergraduateStudents2 = new UndergraduateStudents(2, "hayriye", "yılmaz", 2022, "doctora");


        Courses courses1 = new Courses("MATHEMATIC", 101, 4);
        Courses courses2 = new Courses("PHYSICS", 102, 4);


        undergraduateStudents1.showStudentInfo();
        undergraduateStudents2.showStudentInfo();


        Lecturer lecturer1 = new Lecturer(10, "Lecturer", 4, "Aybike", "Şimşek", lecturerRoom1);
        Lecturer lecturer2 = new Lecturer(20, "Lecturer", 4, "Bedirhan", "Aydın", lecturerRoom2);


        Secretary sekreter = new Secretary(1, "sekreter", 8);
        sekreter.addCourse(lecturer1, courses1);
        sekreter.addCourse(lecturer2, courses2);
        //sekreter.changeLecturer(lecturer2, courses1);


        undergraduateStudents1.addCourse(courses1);
        undergraduateStudents1.addCourse(courses2);
        undergraduateStudents2.addCourse(courses1);
        undergraduateStudents2.addCourse(courses2);


        lecturer1.assignGrade(courses1, undergraduateStudents1, 100);
        lecturer1.assignGrade(courses2, undergraduateStudents1, 70);
        lecturer2.assignGrade(courses1, undergraduateStudents2, 35);
        lecturer2.assignGrade(courses2, undergraduateStudents2, 35);

        undergraduateStudents1.GPACalculator(courses1);
        undergraduateStudents1.GPACalculator(courses2);


        //undergraduateStudents.addCourse();
        //System.out.println(sekreter.getStaffID());

        System.out.println(undergraduateStudents1.getTakenCourses());//hocam burada hashmap ile ders adını ve notunu yazdırmayı denedik
        System.out.println(undergraduateStudents2.getTakenCourses());//ama adres döndürdü.......


        System.out.println(undergraduateStudents1.getName() + " " + courses1.getCourseName() + " " + undergraduateStudents1.getTakenCourses().get(courses1));
        System.out.println(undergraduateStudents1.getName() + " " + courses2.getCourseName() + " " + undergraduateStudents1.getTakenCourses().get(courses2));
        System.out.println(undergraduateStudents2.getName() + " " + courses1.getCourseName() + " " + undergraduateStudents2.getTakenCourses().get(courses1));
        System.out.println(undergraduateStudents2.getName() + " " + courses2.getCourseName() + " " + undergraduateStudents2.getTakenCourses().get(courses2));
    }
}

