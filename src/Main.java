public class Main
{
    public static void main(String[] args) {
        System.out.println("Kerem HEHE");

        //Creating Lecturer Offices
        LecturerRooms lecturerRoom1 = new LecturerRooms(42);
        LecturerRooms lecturerRoom2 = new LecturerRooms(54);

        HeadOfDepartment headOfDepartment = new HeadOfDepartment(3,"BAŞHOCA",8, "HOCA","HOCA",lecturerRoom1);

        //Creating Students
        Students undergraduateStudents1 = new UndergraduateStudents(1, "Hayrullah", "Gamşullah", 2020, "undergraduate");
        Students undergraduateStudents2 = new UndergraduateStudents(2, "Hayriye", "Yılmaz", 2022, "doctora");

        //Creating courses
        UndergraduateCourses courses1 = new UndergraduateCourses("MATHEMATIC", 101, 4);
        UndergraduateCourses courses2 = new UndergraduateCourses("PHYSICS", 102, 4);
        UndergraduateCourses courses3 = new UndergraduateCourses("PROGRAMMING",103,2);
        UndergraduateCourses courses4 = new UndergraduateCourses("A",104,2);

        //Showing student id, name, surname and entry year
        System.out.println("Students Infos");
        undergraduateStudents1.showStudentInfo();
        undergraduateStudents2.showStudentInfo();

        //Creating lecturers
        Lecturer lecturer1 = new Lecturer(10, "Lecturer", 4, "Aybike", "Şimşek", lecturerRoom1);
        Lecturer lecturer2 = new Lecturer(20, "Lecturer", 4, "Bedirhan", "Aydın", lecturerRoom2);

        //Creating Secretary
        Secretary sekreter = new Secretary(1, "secretary", 8);
        //Secretary can add courses for the teacher
        sekreter.addCourse(lecturer1, courses1);
        sekreter.addCourse(lecturer2, courses2);
        sekreter.addCourse(lecturer1, courses3);
        sekreter.addCourse(lecturer1,courses4);

        //Also secretary can change the course lecturer
        sekreter.changeLecturer(lecturer2, courses1);

        //Adding courses for students
        undergraduateStudents1.addCourse(courses1);
        undergraduateStudents1.addCourse(courses2);
        undergraduateStudents1.addCourse(courses3);
        undergraduateStudents2.addCourse(courses1);
        undergraduateStudents2.addCourse(courses2);
        undergraduateStudents2.addCourse(courses3);
        undergraduateStudents2.addCourse(courses4);

        //Lecturers can add notes for the students who are the take him/her course
        System.out.println();
        System.out.println("Adding notes");
        lecturer1.assignGrade(courses1, undergraduateStudents1, 100);
        lecturer2.assignGrade(courses2, undergraduateStudents1, 100);
        lecturer1.assignGrade(courses3,undergraduateStudents1,100);
        lecturer1.assignGrade(courses1, undergraduateStudents2, 35);
        lecturer2.assignGrade(courses2, undergraduateStudents2, 35);
        //lecturer1.assignGrade(courses3,undergraduateStudents2,100);
        lecturer1.assignGrade(courses4,undergraduateStudents2,100);

        //Calculating the gpa
        System.out.println();
        System.out.println("GPAs");
        undergraduateStudents1.GPACalculator(undergraduateStudents1.getCreditCourses());
        undergraduateStudents2.GPACalculator(undergraduateStudents2.getCreditCourses());

        //It shows the courses and their notes which are the student takes
        System.out.println();
        System.out.println("Taken Courses and Their Notes");
        undergraduateStudents1.ListCourses();
        undergraduateStudents2.ListCourses();

        //It shows the only one course you want and its grade
        System.out.println();
        System.out.println("Only one Course and its note");;
        undergraduateStudents1.getGrade(courses2);
        //undergraduateStudents.addCourse();
        //System.out.println(sekreter.getStaffID());

        headOfDepartment.giveCertificate(undergraduateStudents1);

        System.out.println();
        System.out.println("Students and their notes");
        System.out.println(undergraduateStudents1.getName() + " " + courses1.getCourseName() + " " + undergraduateStudents1.getTakenCourses().get(courses1));
        System.out.println(undergraduateStudents1.getName() + " " + courses2.getCourseName() + " " + undergraduateStudents1.getTakenCourses().get(courses2));
        System.out.println(undergraduateStudents2.getName() + " " + courses1.getCourseName() + " " + undergraduateStudents2.getTakenCourses().get(courses1));
        System.out.println(undergraduateStudents2.getName() + " " + courses2.getCourseName() + " " + undergraduateStudents2.getTakenCourses().get(courses2));
    }
}

