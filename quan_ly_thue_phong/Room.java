package quan_ly_thue_phong;

public class Room {
    public static double ROOM_A = 500;
    public static double ROOM_B = 300;
    public static double ROOM_C = 100;

    public Room() {
    }
    double price(String typeRoom)
    {
        if(typeRoom.equals("a") || typeRoom.equals("A"))
        {
            return ROOM_A;
        }
        if(typeRoom.equals("b") || typeRoom.equals("B")){
            return ROOM_B;
        }
        else
            return ROOM_C;
    }
}
