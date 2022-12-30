import java.util.*;

public abstract class Students {
    private int ID;
    private String name;
    private String surname;
    private int year;

    private ArrayList<Secretary> secretaryArrayList = new ArrayList<>();

    private HashMap<Courses, Integer> takenCourses = new HashMap<>();

    public Students()
    {
        this.ID = 0;
        this.name = "NULL";
        this.surname = "NULL";
        this.year = 0;
    }

    public Students(int id, String name, String surname, int year) {
        this.ID = id;
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public ArrayList<Secretary> getSecretaryArrayList() {
        return secretaryArrayList;
    }

    public void setSecretaryArrayList(ArrayList<Secretary> secretaryArrayList) {
        this.secretaryArrayList = secretaryArrayList;
    }

    public HashMap<Courses, Integer> getTakenCourses() {
        return takenCourses;
    }

    public void setTakenCourses(HashMap<Courses, Integer> takenCourses) {
        this.takenCourses = takenCourses;
    }



    //ALTI OKU
    public void GPACalculator(Courses courses)
    {
        int i;
        double gpa = 0.0;
        if (takenCourses.isEmpty())
        {
            System.out.println("Student has no courses!");
        }
        else
        {
            Set set = takenCourses.entrySet();
            Iterator itr1 = set.iterator();
            while (itr1.hasNext()) {
                Map.Entry me = (Map.Entry) itr1.next();
                i = Integer.parseInt("me.getValue()");
                gpa = gpa + courses.getCourseCredit()*i;
            }
            System.out.println(gpa);
            System.out.println("kerem");
        }
    }

    public int getGrade(Courses courses) {
        int note = 0;
        Set set = takenCourses.entrySet();
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            Map.Entry me = (Map.Entry) itr.next();
            if (me.getKey().equals(courses))
            {
                note = (int) me.getValue();
            }
        }
        if(note == 0)
        {
            System.out.println("No notes have been added to this course yet!");
            return 0;
        }
        else
        {
            return note;
        }
    }

    private void ListCourses(HashMap takenCourses)
    {
        this.takenCourses = takenCourses;
        System.out.println();
    }

    public void showStudentInfo() {
        System.out.println("ID: " + ID + " " + "Name: " + name + " " + "Surname: " + surname + " " + "Year: " + year);
    }

    abstract public void addCourse(Courses courses);

}