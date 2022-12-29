import java.util.*;

public abstract class Students {
    private int ID;
    private String name;
    private String surname;
    private int year;

    private ArrayList<Secretary> secretaryArrayList = new ArrayList<>();

    private HashMap<Courses, String> takenCourses = new HashMap<>();

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

    public HashMap<Courses, String> getTakenCourses() {
        return takenCourses;
    }

    public void setTakenCourses(HashMap<Courses, String> takenCourses) {
        this.takenCourses = takenCourses;
    }

    abstract public void addCourses(Courses courses);

    //ALTI OKU
    public Double GPACalculator() {
        if (takenCourses.isEmpty()) {
            System.out.println("Student has no courses!");
            //BURAYA GPA HESAPLAMA KODLARINI YAZ
        }
        return 0.0;
        //UNUTMA ÜSTÜ OKU
    }

    public int getGrade(Courses courses) {
        int note = 0;
        Set set = this.takenCourses.entrySet();
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            if (entry.getKey().equals(courses))
            {
                note = (int) entry.getValue();
            }
        }
        if(note == 0)
        {
            System.out.println("No notes have been added to this course yet!");
            return 0; // BURAYA DA BAK NE RETURNLEYECEKSİN BULAMADIM
        }
        else
        {
            return note;
        }
    }

    //BURAYA DA BAK YAPAMADIM

    public void AddStudent(Secretary ofStudent)
    {
        //ofStudent.addStudent(this);
        secretaryArrayList.add(ofStudent);
    }

    //BURAYA DA BAK HİÇBİR BOK YAPAMADIM ÖZÜR DİLERİM / NP
    private String ListCourses(HashMap takenCourses)
    {
        String s = "s";
        this.takenCourses = takenCourses;
        return s;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + ID +
                ", name='" + name + '\'' +
                ", surname=" + surname + '\'' +
                ", year=" + year +
                //", community='" + showCommunities() + '\'' +
                //", advisor=" + advisor.GetNameSurname() +
                //", takenCourse=" + showTakenCourse() +
                '}';
    }
}