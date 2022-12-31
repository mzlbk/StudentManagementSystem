import java.util.*;

public abstract class Students {
    private int ID;
    private String name;
    private String surname;
    private int year;

    private ArrayList<Secretary> secretaryArrayList = new ArrayList<>();

    private HashMap<Courses, Integer> takenCourses = new HashMap<>();
    private HashMap<Courses, Integer> creditCourses = new HashMap<>();

    public HashMap<Courses, Integer> getCreditCourses() {
        return creditCourses;
    }

    public void setCreditCourses(HashMap<Courses, Integer> creditCourses) {
        this.creditCourses = creditCourses;
    }

    public Students() {
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


    double gpa = 0.0;

    //ALTI OKU
    public void GPACalculator(HashMap courses)
    {
        int i;
        if (takenCourses.isEmpty())
        {
            System.out.println("Student has no courses!");
        }
        else
        {
            Set set = takenCourses.entrySet();
            Iterator itr1 = set.iterator();

            Set set1 = courses.entrySet();
            Iterator itr2 = set1.iterator();

            while (itr1.hasNext())
            {
                Map.Entry me = (Map.Entry) itr1.next();
                Map.Entry me2 = (Map.Entry) itr2.next();
                if (me2.getKey() == me.getKey())
                {
                    double d = (int) me.getValue();
                    double dd = (int) me2.getValue();
                    gpa = (gpa + (dd * d));
                }
            }
            gpa = gpa / takenCourses.size();
            System.out.println(gpa);
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

    public void ListCourses()
    {
        for (Map.Entry<Courses, Integer> courseEntry: takenCourses.entrySet()){
            System.out.println(courseEntry.getKey().getCourseName()+ " "+ courseEntry.getValue());
        }
    }

    public void showStudentInfo() {
        System.out.println("ID: " + ID + " " + "Name: " + name + " " + "Surname: " + surname + " " + "Year: " + year);
    }

    abstract public void addCourse(Courses courses);

}