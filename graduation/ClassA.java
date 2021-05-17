package graduation;

public class ClassA extends Student {
    public static final String MATH = "Toán";
    public static final String PHYSICAL = "Lý";
    public static final String CHEMICAL = "Hoá";
    public ClassA()
    {

    }

    public ClassA(String name, String id, String address, int priority) {
        super(name, id, address, priority);
    }

    @Override
    void getInfo() {
        super.getInfo();
    }

    @Override
    void showInfo() {
        super.showInfo();
        System.out.println("Class A : "+MATH+" " + PHYSICAL +" " + CHEMICAL);
    }
}
