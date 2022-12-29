public class ClassroomNo extends Areas
{
    private int classroomCode;
    public int getClassroomName()
    {
        return classroomCode;
    }
    public void setClassroomName(int classroomName)
    {
        this.classroomCode = classroomName;
    }


    public ClassroomNo()
    {
        this.classroomCode = 0;
    }
    public ClassroomNo(int arasCode, int classroomCode)
    {
        super(arasCode);
        this.classroomCode = classroomCode;
    }
}
