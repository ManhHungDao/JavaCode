package graduation;

public class ClassC extends Student{
    public static String LITERATURE = "Văn";
    public static String HISTORY="Sử";
    public static String  GEOPRAPHY="Địa";

    public ClassC() {
    }

    public ClassC(String name, String id, String address, int priority) {
        super(name, id, address, priority);
    }

    @Override
    void getInfo() {
        super.getInfo();
    }

    @Override
    void showInfo() {
        super.showInfo();
        System.out.println("ClassC : "+LITERATURE+" " +HISTORY+" " +GEOPRAPHY);
    }
}
