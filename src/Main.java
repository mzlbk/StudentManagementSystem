public class Main
{
    public static void main(String[] args)
    {
        System.out.println("KEREMİM HEHE\n");

        
        //Creating Lecturer Offices
        LecturerRooms lecturerRoom1 = new LecturerRooms(42);
        LecturerRooms lecturerRoom2 = new LecturerRooms(54);
        Areas diningHole = new Areas(1);
        Areas canteen = new Areas(2);


        //Creating Students
        UndergraduateStudents undergraduateStudents1 = new UndergraduateStudents(1, "Bedirhan", "Aydın", 2020, "Undergraduate");
        UndergraduateStudents undergraduateStudents2 = new UndergraduateStudents(2, "Zeynep Kübra", "Batmaz", 2022, "Undergraduate");


        //Creating courses
        UndergraduateCourses courses1 = new UndergraduateCourses("MATHEMATICS", 101, 2);
        UndergraduateCourses courses2 = new UndergraduateCourses("PHYSICS", 102, 4);
        UndergraduateCourses courses3 = new UndergraduateCourses("JAVA PROGRAMMING",103,6);
        UndergraduateCourses courses4 = new UndergraduateCourses("DATA STRUCTURES",104,5);


        //Showing student id, name, surname and entry year
        System.out.println("Students Information");
        undergraduateStudents1.showStudentInfo();
        undergraduateStudents2.showStudentInfo();


        //Creating lecturers
        Lecturer lecturer1 = new HeadOfDepartment(10, "Lecturer", 4, "Aybike", "Şimşek Dilbaz", lecturerRoom1);
        Lecturer lecturer2 = new Lecturer(20, "Lecturer", 4, "Oktay", "Yıldız", lecturerRoom2);


        //Creating Secretary
        Secretary sekreter = new Secretary(1, "Secretary", 8);


        //Creating OtherStaff
        OtherStaff technician = new OtherStaff(2, "Technician", 10);
        OtherStaff cCleaner = new OtherStaff(3 , "Cleaner", 8);


        //Secretary can add courses for the teacher
        sekreter.addCourse(lecturer1, courses1);
        sekreter.addCourse(lecturer2, courses2);
        sekreter.addCourse(lecturer1, courses3);
        sekreter.addCourse(lecturer1,courses4);


        //Also secretary can change the course lecturer
        sekreter.lecturerChanger(lecturer2, courses1);


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
        //lecturer1.assignGrade(courses3,undergraduateStudents2,100);   //NULL Değer Olduğu Zaman Ortalama Hesaplamaya Girmiyor
        lecturer1.assignGrade(courses4,undergraduateStudents2,100);


        //Calculating the GPA
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


        //Polymorphism ile Bölüm Başkanı Atama İşlemi
        ((HeadOfDepartment) lecturer1).requestGraduate(undergraduateStudents1);


        //Öğrenci Bilgileri
        System.out.println();
        System.out.println("Students and their notes");
        System.out.println(undergraduateStudents1.getName() + " " + courses1.getCourseName() + " " + undergraduateStudents1.getTakenCourses().get(courses1));
        System.out.println(undergraduateStudents1.getName() + " " + courses2.getCourseName() + " " + undergraduateStudents1.getTakenCourses().get(courses2));
        System.out.println(undergraduateStudents2.getName() + " " + courses1.getCourseName() + " " + undergraduateStudents2.getTakenCourses().get(courses1));
        System.out.println(undergraduateStudents2.getName() + " " + courses2.getCourseName() + " " + undergraduateStudents2.getTakenCourses().get(courses2));
    }
}

