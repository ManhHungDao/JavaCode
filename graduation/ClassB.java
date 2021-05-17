package graduation;

public class ClassB extends Student{
    public static final String BIOLOGICAL = "sinh";
    public static final String MATH = "Toán";
    public static final String CHEMICAL = "Hoá";

    public ClassB() {
    }

    public ClassB(String name, String id, String address, int priority) {
        super(name, id, address, priority);
    }

    @Override
    void getInfo() {
        super.getInfo();
    }

    @Override
    void showInfo() {
        super.showInfo();
        System.out.println("ClassB :"+MATH +" " + CHEMICAL+" " +BIOLOGICAL);
    }
}
