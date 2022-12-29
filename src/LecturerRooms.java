public class LecturerRooms extends Areas
{
    private int floor;
    public int getFloor() {
        return floor;
    }
    public void setFloor(int floor) {
        this.floor = floor;
    }
    public LecturerRooms()
    {
        this.floor = 0;
    }
    public LecturerRooms(String areasName, int floor)
    {
        super(areasName);
        this.floor = floor;
    }
}
