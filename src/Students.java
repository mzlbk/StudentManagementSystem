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

    public void setCreditCourses(HashMap<Courses, Integer> creditCourses)
    {
        this.creditCourses = creditCourses;
    }

    public Students()
    {
        this.ID = 0;
        this.name = "NULL";
        this.surname = "NULL";
        this.year = 0;
    }

    public Students(int id, String name, String surname, int year)
    {
        this.ID = id;
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public int getID()
    {
        return ID;
    }

    public void setID(int ID)
    {
        this.ID = ID;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public ArrayList<Secretary> getSecretaryArrayList()
    {
        return secretaryArrayList;
    }

    public void setSecretaryArrayList(ArrayList<Secretary> secretaryArrayList)
    {
        this.secretaryArrayList = secretaryArrayList;
    }

    public HashMap<Courses, Integer> getTakenCourses()
    {
        return takenCourses;
    }

    public void setTakenCourses(HashMap<Courses, Integer> takenCourses)
    {
        this.takenCourses = takenCourses;
    }


    private double gpa = 0.0;
    private double credit = 0;

    public double getGpa()
    {
        return gpa;
    }

    public void setGpa(double gpa)
    {
        this.gpa = gpa;
    }

    public double getCredit()
    {
        return credit;
    }

    public void setCredit(double credit)
    {
        this.credit = credit;
    }

    public double getNullCredit()
    {
        return nullCredit;
    }

    public void setNullCredit(double nullCredit)
    {
        this.nullCredit = nullCredit;
    }

    private double nullCredit = 0;
    public double GPACalculator(HashMap courses)
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
                if(me.getValue()!=null)
                {
                    double d = (int) me.getValue();
                    double dd = (int) me2.getValue();

                    if(me2.getKey() == me.getKey() && me.getValue() != null)
                    {
                        if (d <= 100 && d >= 90)
                        {
                            gpa = gpa + 4.0;
                        }
                        else if (d >= 85 && d <= 89)
                        {
                            gpa = gpa + 3.5;
                        }
                        else if (d >= 80 && d <= 84)
                        {
                            gpa = gpa + 3.0;
                        }
                        else if (d >= 75 && d <= 79)
                        {
                            gpa = gpa + 2.5;
                        }
                        else if (d >= 65 && d <= 74)
                        {
                            gpa = gpa + 2.0;
                        }
                        else if (d >= 60 && d <= 64)
                        {
                            gpa = gpa + 1.5;
                        }
                        else if (d >= 55 && d <= 59)
                        {
                            gpa = gpa + 1.0;
                        }
                        else if (d >= 50 && d <= 54)
                        {
                            gpa = gpa + 0.5;
                        }
                        else if (d >= 0 && d <= 49)
                        {
                            gpa = gpa + 0;
                        }
                        credit = credit + dd;
                    }
                }

            }
                /*if (me2.getKey() == me.getKey() && me.getValue() != null)
                {

                    gpa = (gpa + (dd * d));
                }
            }
            int count = 0;
            Iterator itr3 = set.iterator();
            while (itr3.hasNext())
            {
                Map.Entry me3 = (Map.Entry) itr3.next();
                if (me3.getValue() != null)
                {
                    count++;
                }
            }

            gpa = gpa / count;
            System.out.println(gpa);*/
        }
        gpa = gpa / credit;
        System.out.println("GPA: "+ gpa);
        credit = 0;
        System.out.println("keremin");
        return gpa;

    }

    public void getGrade(Courses courses) {
        int note = 0;
        Set set = takenCourses.entrySet();
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            Map.Entry me = (Map.Entry) itr.next();
            if (me.getKey().equals(courses))
            {
                note = (int) me.getValue();
                break;
            }
        }
        if(note == 0)
        {
            System.out.println("No notes have been added to this course yet!");
        }
        else
        {
            System.out.println(courses.getCourseName() + " " + note);
        }
    }

    public void ListCourses()
    {
        for (Map.Entry<Courses, Integer> courseEntry: takenCourses.entrySet()){
            if(courseEntry.getValue() == null)
            {
                System.out.println(courseEntry.getKey().getCourseName() + " -");
            }
            else
            {
                System.out.println(courseEntry.getKey().getCourseName()+ " "+ courseEntry.getValue());
            }
        }
    }

    public void showStudentInfo() {
        System.out.println("ID: " + ID + " " + "Name: " + name + " " + "Surname: " + surname + " " + "Year: " + year);
    }

    abstract public void addCourse(Courses courses);

}