public abstract class Staff
{
    private int staffID;
    private int staffWorkHour;
    private String staffWorkInformation;
    public Staff()
    {
        this.staffID = 0;
        this.staffWorkHour = 0;
        this.staffWorkInformation = "NULL";
    }

    public Staff(int staffID, String staffWorkInformation, int staffWorkHour)
    {
        this.staffID = staffID;
        this.staffWorkHour = staffWorkHour;
        this.staffWorkInformation = staffWorkInformation;
    }
    public int getStaffID()
    {
        return staffID;
    }
    public void setStaffID(int staffID)
    {
        this.staffID = staffID;
    }
    public String getStaffWorkInformation()
    {
        return staffWorkInformation;
    }
    public void setStaffWorkInformation(String staffWorkInformation)
    {
        this.staffWorkInformation = staffWorkInformation;
    }
    public int getStaffWorkHour()
    {
        return staffWorkHour;
    }
    public void setStaffWorkHour(int staffWorkHour)
    {
        this.staffWorkHour = staffWorkHour;
    }

}
